package com.pyl.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pyl.demo.dao.entity.TSUser;
import com.pyl.demo.dao.mapper.TSUserMapper;
import com.pyl.demo.service.TSUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
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
public class TSUserServiceImpl extends ServiceImpl<TSUserMapper, TSUser> implements TSUserService {

    @Autowired
    private TSUserMapper userMapper;

}
