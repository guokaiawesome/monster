package com.advance.monster.dao.imp;

import com.advance.monster.dao.TestDao;

public class TestDaoImp extends BaseDaoImp implements TestDao {

	@Override
	public void get() {
		this.getSqlSessionSimple().insert("", "");
	}

	
}
