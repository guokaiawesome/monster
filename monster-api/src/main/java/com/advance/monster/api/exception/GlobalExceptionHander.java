package com.advance.monster.api.exception;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.ifaxin.api.constant.StatusCode;

/**
 * 目前先将所有异常统一返回错误码未知错误，并记录日志，后面再优化细分
 * @author Administrator
 *
 */
public class GlobalExceptionHander implements  HandlerExceptionResolver {
	
	private static final Logger logger=LoggerFactory.getLogger(GlobalExceptionHander.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		logger.error("捕获全局异常", ex);
		ModelAndView mav=new ModelAndView();
		
		Map<String, Object> map=new HashMap<>();
		
		//sql exception的sql尽量不暴露给用户
		if(ex instanceof SQLException){
			map.put("subMsg", "SQL Exception");
		}else{
			map.put("subMsg", ex.getMessage());
		}
		
		map.put("data", null);
		map.put("statusCode", StatusCode.SERVER_INTERNAL_EXCEPTION);
		MappingJackson2JsonView view=new MappingJackson2JsonView();
		view.setAttributesMap(map);
		mav.setView(view);
		return mav;
	}


}
