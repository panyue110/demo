package com.pyl.demo.service;

import com.pyl.demo.dao.entity.TSBaseUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pyl.demo.utils.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yux
 * @since 2019-06-17
 */
public interface TSBaseUserService extends IService<TSBaseUser> {

    /**
     * 根据用户名查询用户账户信息
     * @param username
     * @return
     */
    TSBaseUser loadUserByUserName(String username);

    /**
     * 修改密码
     * @param password 新密码
     * @param oldPassword 原密码
     * @return
     */
    Result<TSBaseUser> updatePassword(String password, String oldPassword);
}
