package com.pyl.demo.config;

import com.pyl.demo.sys.dao.entity.LoginUser;
import com.pyl.demo.sys.dao.entity.SysUser;
import com.pyl.demo.sys.service.SysUserService;
import org.springblade.core.tool.utils.Func;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<SysUser> users = sysUserService.loadUserByUsername(username);

        if(Func.isNotEmpty(users)) {
            SysUser user = users.get(0);
            LoginUser userDetails = new LoginUser(user.getId(),
                    user.getAccount(),
                    user.getPassword(),
                    user.getDeptId(),
                    user.getRoleId());

            return userDetails;
        }
        return null;
    }
}
