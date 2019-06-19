package com.pyl.demo.controller;

import com.pyl.demo.dao.entity.MyUserDetails;
import com.pyl.demo.dao.entity.TSFunction;
import com.pyl.demo.dao.vo.TSFunctionVo;
import com.pyl.demo.service.TSFunctionService;
import com.pyl.demo.utils.UserUtilis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TSFunctionController {

    @Autowired
    private TSFunctionService tSFunctionService;

    @RequestMapping(value = "/selectMenus")
    public List<TSFunctionVo> selectMenus(String functionlevel){



        List<TSFunctionVo> list = tSFunctionService.selectMenus(null,null);
        return list;
    }

}