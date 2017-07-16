package com.advance.monster.mapper;

import com.ifaxin.api.po.UserPwd;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPwdMapper extends BaseMapper{
    int deleteByPrimaryKey(@Param("userName") String userName, @Param("applicationId") Integer applicationId);

    int insert(UserPwd record);

    UserPwd selectByPrimaryKey(@Param("userName") String userName, @Param("applicationId") Integer applicationId);

    List<UserPwd> selectAll();

    int updateByPrimaryKey(UserPwd record);
}