package com.advance.monster.model.po;

import java.util.Date;


public class UserInfo {
	private Integer userId;

	private String userName;

	private String passwd;

	private Integer accountType;

	private Integer userType;

	private Integer parentId;

	private String email;

	private String phone;
	private Integer emailVolumn;

	private Double reputation;

	private Double balance;

	private Date typeTime;

	private Integer billingPlanId;

	private Integer flowBillingPlanId;

	private Integer smsBillingPlanId;

	private Integer attachmentBillingPlanId;

	private Integer emailGradeBillingPlanId;

	private Date firstDepositTime;

	private Date gmtCreated;

	private Integer preAccountType;

	private Integer alertBalance;

	private Integer isVerify;

	private Integer markStatus;

	private Integer transactionRate;

	private Integer marketingRate;

	private Date firstSendTime;

	private Date smsFirstSendTime;

	private String exmail;

	private Date updateTime;

	public UserInfo(Integer userId, String userName, String passwd,
			Integer accountType, Integer userType, Integer parentId,
			String email, String phone, Integer emailVolumn, Double reputation,
			Double balance, Date typeTime, Integer billingPlanId,
			Integer flowBillingPlanId, Integer smsBillingPlanId,
			Integer attachmentBillingPlanId, Integer emailGradeBillingPlanId,
			Date firstDepositTime, Date gmtCreated, Integer preAccountType,
			Integer alertBalance, Integer isVerify, Integer markStatus,
			Integer transactionRate, Integer marketingRate, Date firstSendTime,
			Date smsFirstSendTime, String exmail, Date updateTime) {
		this.userId = userId;
		this.userName = userName;
		this.passwd = passwd;
		this.accountType = accountType;
		this.userType = userType;
		this.parentId = parentId;
		this.email = email;
		this.phone = phone;
		this.emailVolumn = emailVolumn;
		this.reputation = reputation;
		this.balance = balance;
		this.typeTime = typeTime;
		this.billingPlanId = billingPlanId;
		this.flowBillingPlanId = flowBillingPlanId;
		this.smsBillingPlanId = smsBillingPlanId;
		this.attachmentBillingPlanId = attachmentBillingPlanId;
		this.emailGradeBillingPlanId = emailGradeBillingPlanId;
		this.firstDepositTime = firstDepositTime;
		this.gmtCreated = gmtCreated;
		this.preAccountType = preAccountType;
		this.alertBalance = alertBalance;
		this.isVerify = isVerify;
		this.markStatus = markStatus;
		this.transactionRate = transactionRate;
		this.marketingRate = marketingRate;
		this.firstSendTime = firstSendTime;
		this.smsFirstSendTime = smsFirstSendTime;
		this.exmail = exmail;
		this.updateTime = updateTime;
	}

	public UserInfo() {
		super();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd == null ? null : passwd.trim();
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Integer getEmailVolumn() {
		return emailVolumn;
	}

	public void setEmailVolumn(Integer emailVolumn) {
		this.emailVolumn = emailVolumn;
	}

	public Double getReputation() {
		return reputation;
	}

	public void setReputation(Double reputation) {
		this.reputation = reputation;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getTypeTime() {
		return typeTime;
	}

	public void setTypeTime(Date typeTime) {
		this.typeTime = typeTime;
	}

	public Integer getBillingPlanId() {
		return billingPlanId;
	}

	public void setBillingPlanId(Integer billingPlanId) {
		this.billingPlanId = billingPlanId;
	}

	public Integer getFlowBillingPlanId() {
		return flowBillingPlanId;
	}

	public void setFlowBillingPlanId(Integer flowBillingPlanId) {
		this.flowBillingPlanId = flowBillingPlanId;
	}

	public Integer getSmsBillingPlanId() {
		return smsBillingPlanId;
	}

	public void setSmsBillingPlanId(Integer smsBillingPlanId) {
		this.smsBillingPlanId = smsBillingPlanId;
	}

	public Integer getAttachmentBillingPlanId() {
		return attachmentBillingPlanId;
	}

	public void setAttachmentBillingPlanId(Integer attachmentBillingPlanId) {
		this.attachmentBillingPlanId = attachmentBillingPlanId;
	}

	public Integer getEmailGradeBillingPlanId() {
		return emailGradeBillingPlanId;
	}

	public void setEmailGradeBillingPlanId(Integer emailGradeBillingPlanId) {
		this.emailGradeBillingPlanId = emailGradeBillingPlanId;
	}

	public Date getFirstDepositTime() {
		return firstDepositTime;
	}

	public void setFirstDepositTime(Date firstDepositTime) {
		this.firstDepositTime = firstDepositTime;
	}

	public Date getGmtCreated() {
		return gmtCreated;
	}

	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Integer getPreAccountType() {
		return preAccountType;
	}

	public void setPreAccountType(Integer preAccountType) {
		this.preAccountType = preAccountType;
	}

	public Integer getAlertBalance() {
		return alertBalance;
	}

	public void setAlertBalance(Integer alertBalance) {
		this.alertBalance = alertBalance;
	}

	public Integer getIsVerify() {
		return isVerify;
	}

	public void setIsVerify(Integer isVerify) {
		this.isVerify = isVerify;
	}

	public Integer getMarkStatus() {
		return markStatus;
	}

	public void setMarkStatus(Integer markStatus) {
		this.markStatus = markStatus;
	}

	public Integer getTransactionRate() {
		return transactionRate;
	}

	public void setTransactionRate(Integer transactionRate) {
		this.transactionRate = transactionRate;
	}

	public Integer getMarketingRate() {
		return marketingRate;
	}

	public void setMarketingRate(Integer marketingRate) {
		this.marketingRate = marketingRate;
	}

	public Date getFirstSendTime() {
		return firstSendTime;
	}

	public void setFirstSendTime(Date firstSendTime) {
		this.firstSendTime = firstSendTime;
	}

	public Date getSmsFirstSendTime() {
		return smsFirstSendTime;
	}

	public void setSmsFirstSendTime(Date smsFirstSendTime) {
		this.smsFirstSendTime = smsFirstSendTime;
	}

	public String getExmail() {
		return exmail;
	}

	public void setExmail(String exmail) {
		this.exmail = exmail == null ? null : exmail.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName
				+ ", passwd=" + passwd + ", accountType=" + accountType
				+ ", userType=" + userType + ", parentId=" + parentId
				+ ", email=" + email + ", phone=" + phone + ", emailVolumn="
				+ emailVolumn + ", reputation=" + reputation + ", balance="
				+ balance + ", typeTime=" + typeTime + ", billingPlanId="
				+ billingPlanId + ", flowBillingPlanId=" + flowBillingPlanId
				+ ", smsBillingPlanId=" + smsBillingPlanId
				+ ", attachmentBillingPlanId=" + attachmentBillingPlanId
				+ ", emailGradeBillingPlanId=" + emailGradeBillingPlanId
				+ ", firstDepositTime=" + firstDepositTime + ", gmtCreated="
				+ gmtCreated + ", preAccountType=" + preAccountType
				+ ", alertBalance=" + alertBalance + ", isVerify=" + isVerify
				+ ", markStatus=" + markStatus + ", transactionRate="
				+ transactionRate + ", marketingRate=" + marketingRate
				+ ", firstSendTime=" + firstSendTime + ", smsFirstSendTime="
				+ smsFirstSendTime + ", exmail=" + exmail + ", updateTime="
				+ updateTime + "]";
	}

}