package com.pyl.demo.sys.service;

import com.pyl.demo.sys.dao.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
public interface SysUserService extends IService<SysUser> {


    List<SysUser> loadUserByUsername(String username);
}
