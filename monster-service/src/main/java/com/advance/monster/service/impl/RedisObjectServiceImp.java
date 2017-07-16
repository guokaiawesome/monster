package com.advance.monster.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;



/**
 * 适用于所有类型存取,string类型数据建议使用RedisStringServiceImp
 * 根据需要自行扩展实现
 * @author Administrator
 *
 */
@Service
public class RedisObjectServiceImp implements RedisObjectService{
	
	@Autowired(required=true)
	RedisTemplate<String,Object> redisTemplate;

	@Override
	public void valueOpsSet(String key, Object value, long timeout, TimeUnit unit) {
		redisTemplate.opsForValue().set(key, value, timeout, unit);
		
	}

	@Override
	public Object valueOpsGet(String key) {
		Object obj=redisTemplate.opsForValue().get(key);
		return obj;
	}

	@Override
	public void hashOpsPut(String key, String hashKey, Object value, long timeout, TimeUnit unit) {
		redisTemplate.opsForHash().put(key, hashKey, value);
		redisTemplate.expire(hashKey, timeout, unit);
	}

	@Override
	public Object hashOpsGet(String key,String hashKey) {
		Object obj=redisTemplate.opsForHash().get(key, hashKey);
		return obj;
	}
	
	
}
