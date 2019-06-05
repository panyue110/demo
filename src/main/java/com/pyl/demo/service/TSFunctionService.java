package com.pyl.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pyl.demo.dao.entity.TSFunction;
import com.pyl.demo.dao.vo.TSFunctionVo;

import java.util.List;

/**
 * <p>
 *  功能菜单服务类
 * </p>
 *
 * @author panyue
 * @since 2019-05-24
 */
public interface TSFunctionService extends IService<TSFunction> {

    /**
     * 查询菜单列表
     * @param functionlevel 菜单等级
     * @return
     */
    List<TSFunctionVo> selectMenus(String functionlevel, String parentfunctionid);
}
