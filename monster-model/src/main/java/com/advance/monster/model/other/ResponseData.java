package com.advance.monster.model.other;

import java.io.Serializable;

/**
 * controller层响应数据对象
 * @author Monster
 *
 */
public class ResponseData implements Serializable{
	
	private static final long serialVersionUID = 5961228549117696626L;

	/** 状态码 */
	private Integer statusCode;
	
	/** 简短信息 */
	private String message;
	
	/** 返回的json数据 */
	private String jsonData;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	
	

}
