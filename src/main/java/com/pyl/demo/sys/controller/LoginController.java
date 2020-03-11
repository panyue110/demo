package com.pyl.demo.sys.controller;


import com.pyl.demo.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@Controller
public class LoginController {

    @GetMapping("/loginPage")
    public String loginPage() {

        return "user/login";
    }
}

