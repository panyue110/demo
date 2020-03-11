package com.pyl.demo.config;

import com.pyl.demo.utils.ObjectUtils;
import com.pyl.demo.utils.R;
import org.springblade.core.tool.utils.Func;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyAuthenticationProvider provider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/js/**","/layuiadmin/**").permitAll()
                .antMatchers("/register", "/loginPage","login-error")
                .permitAll().anyRequest().authenticated()
                .and()
                .formLogin().usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/loginPage")//登录界面
                .loginProcessingUrl("/login") //处理登录操作的url
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter out = httpServletResponse.getWriter();
                        out.write(Func.toJson(R.success("登录成功")));
                        out.flush();
                        out.close();
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                                    @Override
                                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                                        httpServletResponse.setContentType("application/json;charset=utf-8");
                                        PrintWriter out = httpServletResponse.getWriter();
                                        out.write("{\"code\":200,\"success\":false,\"msg\":\""+e.getMessage()+"\"}");
                                        out.flush();
                                        out.close();
                                    }
                                })
                .permitAll()
                //.defaultSuccessUrl("/index") //登录成功后跳转地址
                .and()
                .logout()
                .logoutSuccessUrl("/loginPage")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .and().rememberMe()
                .tokenValiditySeconds(1209600)
                .and().csrf().disable()
                .headers().frameOptions().sameOrigin();

    }

    /**
     * 自定义的用密码密码验证
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(provider);
    }



}
