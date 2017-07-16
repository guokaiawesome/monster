package com.advance.monster.model.po;

import java.util.Date;

public class UserPwd {
    private String userName;

    private Integer applicationId;

    private String password;

    private Date createTime;

    private Date updateTime;

    public UserPwd(String userName, Integer applicationId, String password, Date createTime, Date updateTime) {
        super();
        this.userName = userName;
        this.applicationId = applicationId;
        this.password = password;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public UserPwd() {
        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}