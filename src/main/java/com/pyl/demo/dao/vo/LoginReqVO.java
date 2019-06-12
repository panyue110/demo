package com.pyl.demo.dao.vo;

import lombok.Data;

@Data
public class LoginReqVO {

    //用户名
    private String username;
    //密码
    private String password;
    //验证码
    private String vercode;
}
