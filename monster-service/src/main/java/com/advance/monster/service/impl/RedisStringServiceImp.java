package com.advance.monster.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;


/**
 * 适用于字符串存取，根据需要自行扩展实现
 * 
 * @author KaiGuo
 *
 */
@Service
public class RedisStringServiceImp implements RedisStringService{
	
	@Autowired(required=true)
	StringRedisTemplate stringRedisTemplate;
	
	@Override
	public void valueOpsSet(String key, String value, long timeout, TimeUnit unit){
		stringRedisTemplate.opsForValue().set(key, value, timeout, unit);
	}
	
	@Override
	public String valueOpsGet(String key){
		String value=stringRedisTemplate.opsForValue().get(key);
		return value;
	}
	
	

}
