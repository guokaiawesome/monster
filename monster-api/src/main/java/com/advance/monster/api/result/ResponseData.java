package com.advance.monster.api.result;

import java.io.Serializable;
import java.util.Map;

import com.ifaxin.api.constant.StatusCode;

/**
 * 关于subMsg参考了阿里的开放接口
 * 阿里另外还有subCode,不过并不是数字，而是字符串,英文表示
 * @author KaiGuo
 *
 */
public class ResponseData implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/** 对状态码的补充描述,参考了阿里接口 */
	private String subMsg;
	
	/** 状态码只描述大的分类 */
	private StatusCode statusCode;
	
	/** 返回的业务数据 */
	private  Map<String,Object> data;
	
	
	public ResponseData() {
		super();
	}


	public String getSubMsg() {
		return subMsg;
	}


	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}


	public StatusCode getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}


	public Map<String, Object> getData() {
		return data;
	}


	public void setData(Map<String, Object> data) {
		this.data = data;
	}



	

	
	
}
