package com.advance.monster.mapper;

import java.util.List;

import com.ifaxin.api.dto.EmailGradeTaskDto;
import com.ifaxin.api.po.EmailGradeTask;

public interface EmailGradeTaskMapper extends BaseMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(EmailGradeTask record);

    int insertSelective(EmailGradeTask record);

    EmailGradeTask selectByPrimaryKey(Integer id);
    
    List<EmailGradeTask> selectByDto(EmailGradeTaskDto dto);

    int updateByPrimaryKeySelective(EmailGradeTask record);

    int updateByPrimaryKey(EmailGradeTask record);
}