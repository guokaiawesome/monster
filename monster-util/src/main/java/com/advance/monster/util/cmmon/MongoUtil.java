package com.advance.monster.util.cmmon;

import org.springframework.beans.factory.annotation.Value;

/**
 * mongo工具類
 * @author Monster
 *
 */
public class MongoUtil {
	
	@Value(value = "${mongo.username}")
	private String mongoUserName;
	
	@Value(value = "mongo.password")
	private String mongoPassWord;
	
	@Value(value = "mongo.password")
	private String mongoAddress;
	
	@Value(value = "mongo.password")
	private String mongoPort;

	//構造器私有化,不讓創造對象
	private MongoUtil() {
		super();
	}
	
	
	

}
