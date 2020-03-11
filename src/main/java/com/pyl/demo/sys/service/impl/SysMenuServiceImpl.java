package com.pyl.demo.sys.service.impl;

import com.pyl.demo.sys.dao.entity.SysMenu;
import com.pyl.demo.sys.dao.mapper.SysMenuMapper;
import com.pyl.demo.sys.service.SysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pyl.demo.sys.vo.SysMenuVO;
import com.pyl.demo.sys.wrapper.MenuWrapper;
import org.springblade.core.tool.utils.Func;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Override
    public List<SysMenuVO> loadMenun(List<Integer> roleIds) {

        //List<SysMenu> roleMenus = baseMapper.roleMenu(roleIds);
        List<SysMenu> roleMenus = baseMapper.allMenu();
        roleMenus.sort(Comparator.comparing(SysMenu::getSort));

        MenuWrapper menuWrapper = new MenuWrapper();
        List<SysMenuVO> list = roleMenus.stream().map(roleMenu -> menuWrapper.entityVO(roleMenu)).collect(Collectors.toList());

        List<SysMenuVO> rootList = list.stream().filter(sysMenuVO -> sysMenuVO.getParentId().intValue() == 0).collect(Collectors.toList());

        for (SysMenuVO entity : rootList) {
            entity.setChildren(getChildNodes(entity.getId(), list));
        }
        return rootList;
    }

    private List<SysMenuVO> getChildNodes(Integer id, List<SysMenuVO> rootList)  {
        List<SysMenuVO> childList = new ArrayList<>();
        for (SysMenuVO sysMenuVO : rootList) {
            if (Func.isNotEmpty(sysMenuVO.getParentId())) {
                if (id.intValue() == sysMenuVO.getParentId().intValue()) {
                    childList.add(sysMenuVO);
                }
            }
        }
        if (childList.size() == 0) {
            return null;
        }

        for (SysMenuVO entity : childList) {
            entity.setChildren(getChildNodes(entity.getId(), rootList));
        }
        return childList;
    }

}
