package com.advance.monster.model.other;

/**
 * 参照HttpStatus类的状态
 * 大类2代表成功(SUCCESS)
 * 大类3代表重定向(REDIRECT)
 * 大类4代表客户端错误(CLIENT)
 * 大类5代表服务器端错误(SERVER)
 * API_CLIENT_AUTH_ERROR说明：SERVER表示大类，AUTH表示模块(后面还可以加子模块)
 * 
 * @author KaiGuo
 * @since 2017-02-17
 *
 */
public enum StatusCode {
	API_SUCCESS_OK(200,"success","OK"),
	API_SUCCESS_(201,"success","创建成功"),
	API_CLIENT_AUTH_ERROR(40001,"error","XX参数错误"),
	API_SERVER_INTERNAL_ERROR(500,"error","服务器内部错误");
	
	private int code;
	private String statu;
	private String message;
	
	
	
	private StatusCode(int code, String statu,String message) {
		this.code = code;
		this.statu=statu;
		this.message = message;
	}
	
	
	public int getCode(){
		return code;
	}
	
	public String getStatus() {
		return statu;
	}

	public String getMessage(){
		return message;
	}
	
}
