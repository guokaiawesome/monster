package com.advance.monster.mapper;

import java.util.List;

import com.ifaxin.api.dto.IfxApiAppDto;
import com.ifaxin.api.po.IfxApiApp;
import com.ifaxin.api.result.db.IfxApiAppDbRet;

public interface IfxApiAppMapper extends BaseMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(IfxApiApp record);

    int insertSelective(IfxApiApp record);

    IfxApiAppDbRet selectByPrimaryKey(Integer id);
    
    List<IfxApiAppDbRet> selectByDto(IfxApiAppDto dto);

    int updateByPrimaryKeySelective(IfxApiApp record);

    int updateByPrimaryKey(IfxApiApp record);
}