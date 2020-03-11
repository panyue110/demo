package com.pyl.demo.sys.dao.mapper;

import com.pyl.demo.sys.dao.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> loadUserByUsername(String username);
}
