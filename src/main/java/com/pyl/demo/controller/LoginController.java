package com.pyl.demo.controller;

import com.pyl.demo.dao.vo.LoginReqVO;
import com.pyl.demo.utils.ResponseUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginController {

    @RequestMapping(value = "/login")
    public String login()  {
        return "login";
    }
    @RequestMapping(value = "/loginForm")
    public ResponseUtils loginForm(LoginReqVO login)  {

        if (login == null) {
           return ResponseUtils.FAIL("用户名或密码不能为空");
        }
        if (StringUtils.isEmpty(login.getUsername())) {
            return ResponseUtils.FAIL("用户名或密码不能为空");
        }
        if (StringUtils.isEmpty(login.getPassword())) {
            return ResponseUtils.FAIL("用户名或密码不能为空");
        }
        if (StringUtils.isEmpty(login.getVercode())) {
            return ResponseUtils.FAIL("验证码不能为空");
        }

        return  ResponseUtils.Success();
    }
}
