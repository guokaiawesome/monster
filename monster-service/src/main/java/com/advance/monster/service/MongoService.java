package com.advance.monster.service;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.CommandResult;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public interface MongoService {

	void insert(Object object,String collectionName);
	
	<T> T queryForInvarDocById(String objectId, Class<T> entityClass, String collectionName);
	
	<T> List<T>  queryForInvarDoc(Query query, Class<T> entityClass, String collectionName);
	
	CommandResult queryForVarDoc(DBObject dbo);
	
	WriteResult updateFirst(Query query,Update update,String collectionName);
	
	WriteResult updateMulti(Query query,Update update,String collectionName);
	
	WriteResult delete(Query query,String collectionName);
	
	<T> T findAndModify(Query query,Update update, Class<T> entityClass,String collectionName);
	
	<T> T findAndRemove(Query query, Class<T> entityClass,String collectionName);
	
	long count(Query query,String collectionName);
	
}
