package com.pyl.demo.sys.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@Controller
@RequestMapping("/sys/sysUser")
public class SysUserController {

    @GetMapping("/list")
    public String list() {

        return "sys/sysUser/list";
    }
}

