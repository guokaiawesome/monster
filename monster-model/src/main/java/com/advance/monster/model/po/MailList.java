package com.advance.monster.model.po;

import java.util.Date;

public class MailList {
    private Integer id;

    private Integer userId;

    private String address;

    private String name;

    private Integer listType;

    private String customField;

    private String fieldType;

    private Integer isShow;

    private String description;

    private Date gmtCreated;

    private Date gmtModified;

    private Short isGrade;

    public MailList(Integer id, Integer userId, String address, String name, Integer listType, String customField, String fieldType, Integer isShow, String description, Date gmtCreated, Date gmtModified, Short isGrade) {
        this.id = id;
        this.userId = userId;
        this.address = address;
        this.name = name;
        this.listType = listType;
        this.customField = customField;
        this.fieldType = fieldType;
        this.isShow = isShow;
        this.description = description;
        this.gmtCreated = gmtCreated;
        this.gmtModified = gmtModified;
        this.isGrade = isGrade;
    }

    public MailList() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getListType() {
        return listType;
    }

    public void setListType(Integer listType) {
        this.listType = listType;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField == null ? null : customField.trim();
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType == null ? null : fieldType.trim();
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Short getIsGrade() {
        return isGrade;
    }

    public void setIsGrade(Short isGrade) {
        this.isGrade = isGrade;
    }
}