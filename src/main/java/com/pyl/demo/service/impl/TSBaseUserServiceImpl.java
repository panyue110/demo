package com.pyl.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pyl.demo.dao.entity.MyUserDetails;
import com.pyl.demo.dao.entity.TSBaseUser;
import com.pyl.demo.dao.mapper.TSBaseUserMapper;
import com.pyl.demo.service.TSBaseUserService;
import com.pyl.demo.utils.MD5Util;
import com.pyl.demo.utils.Response;
import com.pyl.demo.utils.Result;
import com.pyl.demo.utils.UserUtilis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author panyue
 * @since 2019-06-17
 */
@Service
public class TSBaseUserServiceImpl extends ServiceImpl<TSBaseUserMapper, TSBaseUser> implements TSBaseUserService {

    @Autowired
    private TSBaseUserMapper baseUserMapper;
    /**
     * 根据用户名查询用户账户信息
     *
     * @param username
     * @return
     */
    @Override
    public TSBaseUser loadUserByUserName(String username) {
        QueryWrapper<TSBaseUser> userWrapper = new QueryWrapper<TSBaseUser>();
        userWrapper.eq("username",username);
        TSBaseUser tsBaseUser = baseUserMapper.selectOne(userWrapper);
        return tsBaseUser;
    }

    /**
     * 修改密码
     *
     * @param password    新密码
     * @param oldPassword 原密码
     * @return
     */
    @Override
    public Result<TSBaseUser> updatePassword(String password, String oldPassword) {


        String passwordMD5 = MD5Util.encode(password);
        String oldPasswordMD5 = MD5Util.encode(oldPassword);

        MyUserDetails userInfo = UserUtilis.getUserInfo();
        QueryWrapper<TSBaseUser> userWrapper = new QueryWrapper<TSBaseUser>();
        userWrapper.eq("username",userInfo.getUsername());
        TSBaseUser tsBaseUser = baseUserMapper.selectOne(userWrapper);
        if (tsBaseUser == null) {
            return  Response.Error("用户不存在。");
        }
        if (!tsBaseUser.getPassword().equals(oldPasswordMD5)){
            return   Response.Error("原密码错误。");
        }
        tsBaseUser.setPassword(passwordMD5);
        baseUserMapper.updateById(tsBaseUser);
        return Response.Success();
    }
}
