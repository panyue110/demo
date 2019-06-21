package com.pyl.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

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

    @RequestMapping("/passwordPage")
    public String passwordPage(){
        return "/user/password";
    }

}

