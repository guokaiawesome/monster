package com.advance.monster.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advance.monster.model.DO.DemoDo;
import com.advance.monster.model.other.ResponseData;
import com.advance.monster.model.other.StatusCode;

/**
 * 如果使用了RestController注解不需要加@ResponseBody注解
 * Api模块尽量都采用RestController注解,返回值都用ResponseData<T>
 * 
 * @author KaiGuo
 * @since 20167-02-16
 *
 */
@RestController
@RequestMapping(value="/demo")
public class DemoController {
	
	//必须使用门面模式的日志框架，不得直接使用日志系统 （Log4j、Logback） 中的 API
	private static final Logger logger =LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping(value="/rest/{id}")
	public ResponseData<List<DemoDo>> demo(@PathVariable Integer id){
		List<DemoDo> list=new ArrayList<DemoDo>();
		
		ResponseData<List<DemoDo>> reponseEntity=new ResponseData<List<DemoDo>>(StatusCode.API_SUCCESS_OK, list);
		/* 线上环境这个如果配置日志级别高于debug的话这段代码就不会执行,但是如果不加判断,debug日志不会打印,但是debug()方法会执行,因为logger.debug("debug
		demo")里面会再进行一次日志级别判断,这样会影响性能,所以凡是debug日志必须加这个判断 */
		if(logger.isDebugEnabled()){
			//打印的日志字符串里面可以使用占位符，不一定要使用字符串拼接
			logger.debug("debug demo with id: {}",id);
		}
		return reponseEntity;
	}

}
