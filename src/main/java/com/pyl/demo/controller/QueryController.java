package com.pyl.demo.controller;


import com.pyl.demo.dao.entity.TSBaseUser;
import com.pyl.demo.service.TSBaseUserService;
import com.pyl.demo.utils.Response;
import com.pyl.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private TSBaseUserService baseUserService;

    @RequestMapping("/list")
    public String passwordPage(){
        return "/query/list";
    }


}

