package com.pyl.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pyl.demo.dao.entity.TSUser;
import com.pyl.demo.dao.mapper.TSUserMapper;
import com.pyl.demo.service.TSUserService;
import com.pyl.demo.utils.RequestPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<TSUser> queryList(RequestPage rPage) {

        TSUser tuser=new TSUser();

        IPage<TSUser> page = userMapper.selectPage(new Page<>(1,10),null);
        List<TSUser>  list =  page.getRecords();
        return list;
    }
}
