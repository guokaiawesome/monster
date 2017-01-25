package com.advance.monster.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * RequestMapping中的value写法为/项目模块/小模块/方法
 * @author Monster
 *
 */

@Controller
@RequestMapping(value="/web/test")
public class TestController {
	
	/**
	 * 書上說一個controller中只要有一個方法加了@ExceptionHandler(value=Exception.class)註解其他方法不用加，這個controller裡面的所有方法的異常都可以捕獲
	 * 自己試驗一下
	 */
	@RequestMapping(value="/exception",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public void testException(){
		Integer.parseInt("a");
		
		
	}

}
