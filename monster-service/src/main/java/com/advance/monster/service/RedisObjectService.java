package com.advance.monster.service;

import java.util.concurrent.TimeUnit;

/**
 * 用于操作除了String类型之外的其他java对象
 * value/set/zset/hash/list  五种类型的操作
 * @author KaiGuo
 *
 */
public interface RedisObjectService {
	
	void valueOpsSet(String key, Object value, long timeout, TimeUnit unit);
	
	Object valueOpsGet(String key);
	
	void hashOpsPut(String key,String hashKey,Object value, long timeout, TimeUnit unit);
	
	Object hashOpsGet(String key,String hashKey);

}
