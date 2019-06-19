package com.pyl.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author panyue
 * @since 2019-06-17
 */
@Controller
@RequestMapping("/tSUser")
public class TSUserController {

    @RequestMapping("/userInfo")
    public String index(){
        return "/user/userInfo";
    }
}

