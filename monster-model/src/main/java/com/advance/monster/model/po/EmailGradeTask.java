package com.advance.monster.model.po;

import java.util.Date;

public class EmailGradeTask {
    private Integer id;

    private Integer userId;

    private Integer userType;

    private String name;

    private String mailListIds;

    private Integer condType;

    private Integer status;

    private String returnMessage;

    private Integer billingStatus;

    private Integer emailCount;

    private Double money;

    private Integer isRetry;

    private String operateMachine;

    private Byte isDelete;

    private Date createTime;

    private Date updateTime;

    public EmailGradeTask(Integer id, Integer userId, Integer userType, String name, String mailListIds, Integer condType, Integer status, String returnMessage, Integer billingStatus, Integer emailCount, Double money, Integer isRetry, String operateMachine, Byte isDelete, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.userType = userType;
        this.name = name;
        this.mailListIds = mailListIds;
        this.condType = condType;
        this.status = status;
        this.returnMessage = returnMessage;
        this.billingStatus = billingStatus;
        this.emailCount = emailCount;
        this.money = money;
        this.isRetry = isRetry;
        this.operateMachine = operateMachine;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public EmailGradeTask() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMailListIds() {
        return mailListIds;
    }

    public void setMailListIds(String mailListIds) {
        this.mailListIds = mailListIds == null ? null : mailListIds.trim();
    }

    public Integer getCondType() {
        return condType;
    }

    public void setCondType(Integer condType) {
        this.condType = condType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage == null ? null : returnMessage.trim();
    }

    public Integer getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(Integer billingStatus) {
        this.billingStatus = billingStatus;
    }

    public Integer getEmailCount() {
        return emailCount;
    }

    public void setEmailCount(Integer emailCount) {
        this.emailCount = emailCount;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getIsRetry() {
        return isRetry;
    }

    public void setIsRetry(Integer isRetry) {
        this.isRetry = isRetry;
    }

    public String getOperateMachine() {
        return operateMachine;
    }

    public void setOperateMachine(String operateMachine) {
        this.operateMachine = operateMachine == null ? null : operateMachine.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
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