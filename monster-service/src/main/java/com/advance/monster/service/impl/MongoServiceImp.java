package com.advance.monster.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.CommandResult;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

@Service
public class MongoServiceImp implements MongoService{
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	/** 插入单个对象 */
	@Override
	public  void insert(Object object,String collectionName){
		mongoTemplate.insert(object, collectionName);
	}
	
	/** 此方法用于查询mongo中存放的文档格式固定，可以封装成对应的pojo类  invariant */
	@Override
	public <T> List<T>  queryForInvarDoc(Query query, Class<T> entityClass, String collectionName){
		List<T> list=mongoTemplate.find(query, entityClass, collectionName);
		return list;
	}
	
	/** 此方法用于查询mongo中存放的文档格式不固定，不可以封装成对应的pojo类  variable */
	@Override
	public CommandResult queryForVarDoc(DBObject dbo){
		CommandResult ret=mongoTemplate.executeCommand(dbo);
		return ret;
	}
	
	@Override
	public WriteResult updateFirst(Query query,Update update,String collectionName){
		WriteResult  ret=mongoTemplate.updateFirst(query, update, collectionName);
		return ret;
	}
	
	@Override
	public WriteResult updateMulti(Query query,Update update,String collectionName){
		WriteResult  ret=mongoTemplate.updateMulti(query, update, collectionName);
		return ret;
	}
	
	@Override
	public WriteResult delete(Query query,String collectionName){
		WriteResult  ret=mongoTemplate.remove(query, collectionName);
		return ret;
	}

	@Override
	public <T> T queryForInvarDocById(String objectId, Class<T> entityClass, String collectionName) {
		T ret= mongoTemplate.findById(objectId, entityClass, collectionName);
		return ret;
	}

	@Override
	public <T> T findAndModify(Query query, Update update, Class<T> entityClass, String collectionName) {
		//T ret=mongoTemplate.findAndModify(query, update, entityClass, collectionName);
		T ret=mongoTemplate.findAndModify(query, update, FindAndModifyOptions.options().returnNew(true), entityClass, collectionName);
		return ret;
	}

	@Override
	public <T> T findAndRemove(Query query, Class<T> entityClass, String collectionName) {
		T ret=mongoTemplate.findAndRemove(query, entityClass, collectionName);
		return ret;
	}

	@Override
	public long count(Query query, String collectionName) {
		long count=mongoTemplate.count(query, collectionName);
		return count;
	}

	

}
