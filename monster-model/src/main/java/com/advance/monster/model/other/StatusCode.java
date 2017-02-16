package com.advance.monster.model.other;

public enum StatusCode {
	API_V1_ADD_SUCCESS(2001,"添加成功"),
	API_V1_UPDATE_SUCCESS(2000,"更新成功");
	
	private int code;
	private String message;
	
	
	private StatusCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
	public int getCode(){
		return code;
	}
	
	public String getMessage(){
		return message;
	}
	
}
