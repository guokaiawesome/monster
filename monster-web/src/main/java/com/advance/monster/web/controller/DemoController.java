package com.advance.monster.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * web模块中controller层要么跳转到视图页面，要么返回ResponseEntity<T>类型
 * 如果返回值是ResponseEntity的话就不需要加@ResponseBody注解
 * 
 * @author KaiGuo
 * @since 2017-02-17
 *
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController<DemoDo> {

	// 必须使用门面模式的日志框架，不得直接使用日志系统 （Log4j、Logback） 中的 API
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping(value = "/rest")
	public ResponseEntity<List<DemoDo>> demo() {
		List<DemoDo> list = new ArrayList<DemoDo>();

		
		ResponseEntity<List<DemoDo>> reponseEntity = new ResponseEntity<List<DemoDo>>(list, HttpStatus.OK);
		/* 线上环境这个如果配置日志级别高于debug的话这段代码就不会执行,但是如果不加判断,debug日志不会打印,但是debug()方法会执行,因为logger.debug("debug
		demo")里面会再进行一次日志级别判断,这样会影响性能,所以凡是debug日志必须加这个判断 */
		if (logger.isDebugEnabled()) {
			logger.debug("debug demo");
		}
		return reponseEntity;
	}

}
