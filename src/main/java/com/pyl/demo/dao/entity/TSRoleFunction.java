package com.pyl.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yux
 * @since 2019-06-17
 */
public class TSRoleFunction implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 页面控件权限编码
     */
    private String operation;

    /**
     * 菜单ID
     */
    private String functionid;

    /**
     * 角色ID
     */
    private String roleid;

    /**
     * 数据权限规则ID
     */
    private String datarule;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getFunctionid() {
        return functionid;
    }

    public void setFunctionid(String functionid) {
        this.functionid = functionid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getDatarule() {
        return datarule;
    }

    public void setDatarule(String datarule) {
        this.datarule = datarule;
    }

    @Override
    public String toString() {
        return "TSRoleFunction{" +
        "id=" + id +
        ", operation=" + operation +
        ", functionid=" + functionid +
        ", roleid=" + roleid +
        ", datarule=" + datarule +
        "}";
    }
}
