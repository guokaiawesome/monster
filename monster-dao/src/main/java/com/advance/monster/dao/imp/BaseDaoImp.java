package com.advance.monster.dao.imp;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

/**
 * 創建sqlSessionTemplate
 * @author Monster
 *
 */
public class BaseDaoImp {
	
	/** 为每个语句的执行创建一个新的预处理语句  */
	@Resource(name="sqlSessionSimple")
	private SqlSession sqlSessionSimple;
	
	/** 批量执行所有更新语句  */
	@Resource(name="sqlSessionBatch")
	private SqlSession sqlSessionBatch;

	public SqlSession getSqlSessionSimple() {
		return sqlSessionSimple;
	}

	public SqlSession getSqlSessionBatch() {
		return sqlSessionBatch;
	}

	
	
	
}
