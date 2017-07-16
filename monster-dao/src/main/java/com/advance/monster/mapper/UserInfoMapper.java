package com.advance.monster.mapper;

import com.ifaxin.api.po.UserInfo;

public interface UserInfoMapper extends BaseMapper{
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);
    
    int selectUserIdByUserName(String userName);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}