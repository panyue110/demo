package com.pyl.demo.utils;

import com.pyl.demo.dao.entity.MyUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class UserUtilis {

    public static MyUserDetails getUserInfo(){
        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (userDetails != null) {
           return  userDetails;
        }
        return  null;
    }
}
