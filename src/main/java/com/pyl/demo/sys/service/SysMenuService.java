package com.pyl.demo.sys.service;

import com.pyl.demo.sys.dao.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pyl.demo.sys.vo.SysMenuVO;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenuVO> loadMenun(List<Integer> roleIds);
}
