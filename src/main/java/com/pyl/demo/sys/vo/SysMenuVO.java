package com.pyl.demo.sys.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pyl.demo.sys.dao.entity.SysMenu;
import lombok.Data;
import org.springblade.core.tool.node.INode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@Data
public class SysMenuVO extends SysMenu {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 父节点ID
     */
    private Integer parentId;

    /**
     * 子孙节点
     */
    private List<SysMenuVO> children;


    /**
     * 上级菜单
     */
    private String parentName;

    /**
     * 菜单类型
     */
    private String categoryName;

    /**
     * 按钮功能
     */
    private String actionName;

    /**
     * 是否新窗口打开
     */
    private String isOpenName;

}
