package com.pyl.demo.utils;

import com.pyl.demo.sys.dao.entity.LoginUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class LoignUserUtil {

    public static LoginUser getUserInfo(){
        LoginUser userDetails = (LoginUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (userDetails != null) {
           return  userDetails;
        }
        return  null;
    }
}
