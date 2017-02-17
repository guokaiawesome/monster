package com.advance.monster.model.DO;

import java.util.Date;

/**
 * 
 * @author KaiGuo
 * @since 2017-02-16
 * 对应数据库的表名
 * 所有表必备三字段： id,gmt_create,gmt_modified,建议加上remark字段
 * 所有的 POJO 类属性必须使用包装数据类型
 * 所有POJO 类必须写 toString 方法
 * Boolean类型变量不用用is开头
 * 定义 DO / DTO / VO 等 POJO 类时，不要设定任何属性默认值。
 *
 */
public class DemoDo {
	
	private Integer id;
	
	private String remark;
	
	private Date gmtCreate;
	
	private Date gmtModified;
	

	public DemoDo(Integer id, String remark, Date gmtCreate, Date gmtModified) {
		super();
		this.id = id;
		this.remark = remark;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "DemoDo [id=" + id + ", remark=" + remark + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified
				+ "]";
	}
	
	

}
