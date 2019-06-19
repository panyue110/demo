package com.pyl.demo.dao.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yux
 * @since 2019-06-17
 */
public class TSUser implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * id
     */
    private String id;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    @TableField("mobilePhone")
    private String mobilePhone;

    /**
     * 办公座机
     */
    @TableField("officePhone")
    private String officePhone;

    /**
     * 签名文件
     */
    @TableField("signatureFile")
    private String signatureFile;

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

    private String portrait;

    private String imsign;

    /**
     * 开发权限标志
     */
    private String devFlag;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 人员类型
     */
    private String personType;

    /**
     * 性别
     */
    private String sex;

    /**
     * 工号
     */
    private String empNo;

    /**
     * 身份证号
     */
    private String citizenNo;

    /**
     * 传真
     */
    private String fax;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 邮编
     */
    private String post;

    /**
     * 备注
     */
    private String memo;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getSignatureFile() {
        return signatureFile;
    }

    public void setSignatureFile(String signatureFile) {
        this.signatureFile = signatureFile;
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

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getImsign() {
        return imsign;
    }

    public void setImsign(String imsign) {
        this.imsign = imsign;
    }

    public String getDevFlag() {
        return devFlag;
    }

    public void setDevFlag(String devFlag) {
        this.devFlag = devFlag;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getCitizenNo() {
        return citizenNo;
    }

    public void setCitizenNo(String citizenNo) {
        this.citizenNo = citizenNo;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "TSUser{" +
        "id=" + id +
        ", email=" + email +
        ", mobilePhone=" + mobilePhone +
        ", officePhone=" + officePhone +
        ", signatureFile=" + signatureFile +
        ", updateName=" + updateName +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        ", createName=" + createName +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", portrait=" + portrait +
        ", imsign=" + imsign +
        ", devFlag=" + devFlag +
        ", userType=" + userType +
        ", personType=" + personType +
        ", sex=" + sex +
        ", empNo=" + empNo +
        ", citizenNo=" + citizenNo +
        ", fax=" + fax +
        ", address=" + address +
        ", post=" + post +
        ", memo=" + memo +
        "}";
    }
}
