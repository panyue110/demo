package com.pyl.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pyl.demo.dao.entity.TSBaseUser;
import com.pyl.demo.dao.mapper.TSBaseUserMapper;
import com.pyl.demo.service.TSBaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yux
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
}
