package com.advance.monster.service;

import java.util.concurrent.TimeUnit;

/**
 * 用于操作String类型的对象
 * value/set/zset/hash/list  五种类型的操作
 * 编码者根据业务需要自行扩展
 * @author KaiGuo
 *
 */
public interface RedisStringService {
	
	void valueOpsSet(String key, String value, long timeout, TimeUnit unit);
	
	String valueOpsGet(String key);
	

}
