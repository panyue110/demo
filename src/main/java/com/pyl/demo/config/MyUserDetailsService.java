package com.pyl.demo.config;

import com.pyl.demo.dao.entity.MyUserDetails;
import com.pyl.demo.dao.entity.TSBaseUser;
import com.pyl.demo.service.TSBaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private TSBaseUserService userSerivce;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        TSBaseUser user = userSerivce.loadUserByUserName(username);
        if(user!=null) {
            MyUserDetails userDetails=new MyUserDetails(user.getUsername(),
                    user.getRealname(),
                    user.getPassword(),
                    user.getDepartid(),
                    "ROLE_ADMIN",
                    true,
                    true,
                    true,
                    true);

            return userDetails;
        }
        return null;
    }
}
