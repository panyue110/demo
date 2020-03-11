package com.pyl.demo.sys.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@Data
public class SysMenu implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父级菜单
     */
    private Integer parentId;

    /**
     * 菜单编号
     */
    private String code;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单别名
     */
    private String alias;

    /**
     * 请求地址
     */
    private String path;

    /**
     * 菜单资源
     */
    private String source;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 菜单类型
     */
    private Integer category;

    /**
     * 操作按钮类型
     */
    private Integer action;

    /**
     * 是否打开新页面
     */
    private Integer isOpen;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否已删除
     */
    private Integer isDeleted;


    @Override
    public String toString() {
        return "SysMenuVO{" +
        "id=" + id +
        ", parentId=" + parentId +
        ", code=" + code +
        ", name=" + name +
        ", alias=" + alias +
        ", path=" + path +
        ", source=" + source +
        ", sort=" + sort +
        ", category=" + category +
        ", action=" + action +
        ", isOpen=" + isOpen +
        ", remark=" + remark +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
