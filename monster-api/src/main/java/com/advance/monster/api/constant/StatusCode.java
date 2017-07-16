package com.advance.monster.api.constant;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum StatusCode {

	OK(200,"success","OK"),
	CLIENT_PARAMETER_ERROR(401,"error","参数错误"),
	SERVER_INTERNAL_ERROR(501,"error","系统错误"),
	SERVER_INTERNAL_EXCEPTION(502,"error","异常失败"),
	DB_RESULT_NULL(601,"error","未查询到对应结果"),
	ACCESS_TOKEN_NULL(602,"error","accessToken错误"),
	AUTH_ERROR(801,"error","授权错误");
	
	private int code;
	private String state;
	private String msg;
	
	
	private StatusCode(int code, String state,String msg) {
		this.code = code;
		this.state=state;
		this.msg = msg;
	}
	
	
	public int getCode(){
		return code;
	}
	
	public String getstates() {
		return state;
	}

	public String getMsg(){
		return msg;
	}
	
	
}
