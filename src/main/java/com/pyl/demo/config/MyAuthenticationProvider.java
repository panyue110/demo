package com.pyl.demo.config;

import com.pyl.demo.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        // 如上面的介绍，这里通过authentication.getDetails()获取详细信息
        String userName = authentication.getName();// 这个获取表单输入中返回的用户名;
        String password = (String) authentication.getCredentials();// 这个是表单中输入的密码；

        request.getSession().setAttribute("LAST_USERNAME",userName);
        if(password == null||password.equals("")){
            throw new BadCredentialsException("密码不能为空");
        }

//        if (details.getVercode() == null || details.getVercode() == "") {
//
//            throw new AuthenticationServiceException("验证码不能为空");
//        }
//
//        if (!details.getVercode().toLowerCase().contentEquals(details.getVercode().toLowerCase())) {
//
//            throw new AuthenticationServiceException("验证码不匹配");
//        }

        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {

            BadCredentialsException exception = new BadCredentialsException("账号或密码不能为空！");// 在界面输出自定义的信息！！
            throw exception;
        }

        UserDetails user =  userDetailsService.loadUserByUsername(userName);
        if(user == null){
            throw new BadCredentialsException("账号不存在或密码错误");
        }

        password= MD5Util.encode(password);
        if (!user.getPassword().equals(password)) {

            BadCredentialsException exception = new BadCredentialsException("账号不存在或密码错误");// 在界面输出自定义的信息！！
            throw exception;
        }
        if(!user.isEnabled()){
            throw new BadCredentialsException("用户已停用，请联系管理员");
        }

        return new UsernamePasswordAuthenticationToken(user, password, user.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
