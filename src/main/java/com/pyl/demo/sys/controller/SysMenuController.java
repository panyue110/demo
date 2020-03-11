package com.pyl.demo.sys.controller;


import com.pyl.demo.sys.dao.entity.LoginUser;
import com.pyl.demo.sys.service.SysMenuService;
import com.pyl.demo.sys.vo.SysMenuVO;
import com.pyl.demo.utils.LoignUserUtil;
import com.pyl.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;
    /**
     * 加载用户菜单
     * @return
     */
    @GetMapping("/loadMenun")
    public R loadMenun() {

        LoginUser userInfo = LoignUserUtil.getUserInfo();
        List<SysMenuVO> list = sysMenuService.loadMenun(userInfo.getRoleIds());
        return R.data(list);

    }
}

