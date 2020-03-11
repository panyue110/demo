package com.pyl.demo.sys.dao.mapper;

import com.pyl.demo.sys.dao.entity.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<SysMenu> allMenu();

    List<SysMenu> roleMenu(List<Integer> roleIds);
}
