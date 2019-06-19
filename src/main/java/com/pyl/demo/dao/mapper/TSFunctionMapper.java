package com.pyl.demo.dao.mapper;

import com.pyl.demo.dao.entity.TSFunction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author panyue
 * @since 2019-05-24
 */
public interface TSFunctionMapper extends BaseMapper<TSFunction> {

    /**
     * 查询菜单
     * @param functionlevel 菜单等级
     * @param parentfunctionid 父级id
     * @param username 登录 用户名
     * @return
     */
    List<TSFunction> selectMenus (String functionlevel, String parentfunctionid, String username);
}
