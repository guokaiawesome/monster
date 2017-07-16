package com.advance.monster.mapper;

import java.util.List;

import com.ifaxin.api.dto.MailListDto;
import com.ifaxin.api.po.MailList;

public interface MailListMapper extends BaseMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(MailList record);

    int insertSelective(MailList record);

    MailList selectByPrimaryKey(Integer id);
    
    List<MailList> selectByDto(MailListDto dto);
    
    List<MailList> selectWithPageByDto(MailListDto dto);

    int updateByPrimaryKeySelective(MailList record);

    int updateByPrimaryKey(MailList record);
    
    int countByDto(MailListDto dto);
}