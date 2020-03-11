package com.pyl.demo.sys.service.impl;

import com.pyl.demo.sys.dao.entity.SysUser;
import com.pyl.demo.sys.dao.mapper.SysUserMapper;
import com.pyl.demo.sys.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public List<SysUser> loadUserByUsername(String username) {
        return baseMapper.loadUserByUsername(username);
    }
}
