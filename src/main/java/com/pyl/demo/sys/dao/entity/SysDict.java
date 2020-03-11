package com.pyl.demo.sys.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
public class SysDict implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父主键
     */
    private Integer parentId;

    /**
     * 字典码
     */
    private String code;

    /**
     * 字典值
     */
    private Integer dictKey;

    /**
     * 字典名称
     */
    private String dictValue;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 字典备注
     */
    private String remark;

    /**
     * 是否已删除
     */
    private Integer isDeleted;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getDictKey() {
        return dictKey;
    }

    public void setDictKey(Integer dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "SysDict{" +
        "id=" + id +
        ", parentId=" + parentId +
        ", code=" + code +
        ", dictKey=" + dictKey +
        ", dictValue=" + dictValue +
        ", sort=" + sort +
        ", remark=" + remark +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
