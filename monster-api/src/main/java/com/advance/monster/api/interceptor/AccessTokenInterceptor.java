package com.advance.monster.api.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ifaxin.api.constant.RedisKey;
import com.ifaxin.api.service.RedisObjectService;
import com.ifaxin.api.service.RedisStringService;

/**
 * 通用access_token校验拦截器
 * @author KaiGuo
 *
 */
public class AccessTokenInterceptor extends HandlerInterceptorAdapter{
	
	
	@Autowired
	RedisObjectService redisObjectService;
	
	private static final Logger logger=LoggerFactory.getLogger(AccessTokenInterceptor.class);
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//生成token的接口直接放过,这个在拦截器里面已经配置了
		//request.getRequestURI();
		
		//其他接口,跳转到某一个指定controller,给用户返回错误信息,不过这里再跳转接口不知道还会不会被拦截，需要实验一下
		//String s=IOUtils.toString(request.getInputStream(),"UTF-8");
		/*if(request.getMethod().equalsIgnoreCase("OPTIONS")){
			return true;
		}*/
		
		String accessToken=request.getParameter("access_token");
		if(StringUtils.isBlank(accessToken)){
			response.sendRedirect("/error/accesstoken");
			return false;
		}
		
		//String userIdStr=redisStringService.valueOpsGet(RedisKey.COMMON_TOKEN_ACCESS.getKey()+accessToken);
		Integer userId=(Integer) redisObjectService.valueOpsGet(RedisKey.COMMON_TOKEN_ACCESS.getKey()+accessToken);
		if(userId==null){
			response.sendRedirect("/error/accesstoken");
			return false;
		}
		
		//将userId放入request
		request.setAttribute("userId", userId);
		logger.info("拦截器往request里面放入参数userId="+userId);
		
		//记录接口调用时间
		
		return true;
	}

}
