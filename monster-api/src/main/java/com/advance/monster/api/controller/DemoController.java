package com.advance.monster.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.advance.monster.model.DO.DemoDo;

/**
 * 
 * @author KaiGuo
 * @since 20167-02-16
 * 如果返回值是ResponseEntity的话就不需要加@ResponseBody注解
 * 如果使用了RestController注解也不需要加@ResponseBody注解
 *
 */
@Controller
@RequestMapping(value="/demo")
public class DemoController {
	
	@RequestMapping(value="/rest")
	public ResponseEntity<List<DemoDo>> demo(){
		List<DemoDo> list=new ArrayList<DemoDo>();
		
		ResponseEntity<List<DemoDo>> reponseEntity=new ResponseEntity<List<DemoDo>>(list, HttpStatus.NOT_FOUND);
		return reponseEntity;
	}

}
