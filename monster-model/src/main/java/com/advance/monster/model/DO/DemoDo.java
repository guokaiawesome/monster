package com.advance.monster.model.DO;

import java.util.Date;

/**
 * 
 * @author KaiGuo
 * @since 2017-02-16
 * 对应数据库的表名
 * 所有表必备三字段： id,gmt_create,gmt_modified,建议加上remark字段
 * 任何字段如果为非负数，必须是 unsigned
 * 表达是与否概念的字段,必须使用 is_xxx的方式命名,数据类型是 unsigned tinyint(1表示是,0表示否)
 * 唯一索引名为 uk _字段名 ； 普通索引名则为 idx _字段名
 * 小数类型为 decimal ，禁止使用 float 和 double
 * 如果存储的字符串长度几乎相等，使用 char 定长字符串类型
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
