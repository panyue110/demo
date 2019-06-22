package com.pyl.demo.controller;


import com.pyl.demo.dao.entity.TSBaseUser;
import com.pyl.demo.service.TSBaseUserService;
import com.pyl.demo.utils.Response;
import com.pyl.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author panyue
 * @since 2019-06-18
 */
@Controller
@RequestMapping("/tSBaseUser")
public class TSBaseUserController {

    @Autowired
    private TSBaseUserService baseUserService;

    @RequestMapping("/passwordPage")
    public String passwordPage(){
        return "/user/password";
    }

    /**
     * 修改密码
     * @param password 新密码
     * @param oldPassword 原密码
     * @return
     */
    @RequestMapping("/updatePassword")
    @ResponseBody
    public Result<TSBaseUser> updatePassword(String password, String oldPassword){

        if (StringUtils.isEmpty(password) || StringUtils.isEmpty(oldPassword)){
            return Response.Error("原密码或新密码不能为空");
        }

        return baseUserService.updatePassword(password, oldPassword);
    }

}

