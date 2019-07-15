package com.pyl.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pyl.demo.dao.entity.TSUser;
import com.pyl.demo.dao.mapper.TSUserMapper;
import com.pyl.demo.service.TSUserService;
import com.pyl.demo.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    @Override
    public List<TSUser> queryList(Page page) {

        List<TSUser>  list  =userMapper.selectList(null);
        return list;
    }
}
