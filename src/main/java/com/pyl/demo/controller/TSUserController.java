package com.pyl.demo.controller;


import com.pyl.demo.dao.entity.TSUser;
import com.pyl.demo.service.TSUserService;
import com.pyl.demo.utils.RequestPage;
import com.pyl.demo.utils.Response;
import com.pyl.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @Autowired
    private TSUserService tsUserService;

    @RequestMapping("/userInfo")
    public String index(){
        return "/user/userInfo";
    }


    @RequestMapping("/userList")
    public String userList(){
        return "/user/userList";
    }
    @RequestMapping("/query")
    @ResponseBody
    public Result<List<TSUser>> query(RequestPage page){

        List<TSUser> list = tsUserService.queryList(page);
        return Response.Page(list,list.size());
    }
}

