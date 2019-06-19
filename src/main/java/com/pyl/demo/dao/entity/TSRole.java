package com.pyl.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yux
 * @since 2019-06-17
 */
public class TSRole implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 角色编码
     */
    private String rolecode;

    /**
     * 角色名字
     */
    private String rolename;

    /**
     * 部门权限组ID
     */
    private String departAgId;

    /**
     * 类型1部门角色/0系统角色
     */
    private String roleType;

    /**
     * 修改人
     */
    private String updateName;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 修改人id
     */
    private String updateBy;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 创建人id
     */
    private String createBy;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDepartAgId() {
        return departAgId;
    }

    public void setDepartAgId(String departAgId) {
        this.departAgId = departAgId;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "TSRole{" +
        "id=" + id +
        ", rolecode=" + rolecode +
        ", rolename=" + rolename +
        ", departAgId=" + departAgId +
        ", roleType=" + roleType +
        ", updateName=" + updateName +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        ", createName=" + createName +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        "}";
    }
}
