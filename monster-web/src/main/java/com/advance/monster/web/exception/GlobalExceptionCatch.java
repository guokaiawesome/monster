package com.advance.monster.web.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局异常捕获
 * 用于捕获controller层抛出的异常,方便定位排错
 * @author Monster
 *
 */
@ControllerAdvice(basePackages="com.advance.monster.web.controller")
public class GlobalExceptionCatch {
	
	@ExceptionHandler(value=Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public void handleRuntimeException(HttpServletRequest request, Exception ex){
		
	}
}
