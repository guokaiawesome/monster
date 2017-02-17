package com.advance.monster.model.other;


public class ResponseData<T> {
	
	private StatusCode statusCode;
	
	private T body;
	
	
	public ResponseData(StatusCode statusCode, T body) {
		super();
		this.statusCode = statusCode;
		this.body = body;
	}

	public StatusCode getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}
	
	
}
