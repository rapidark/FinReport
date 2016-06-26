package com.finreport.mapper;

import com.finreport.model.IncStatement;

public interface IncStatementMapper {
    int deleteByPrimaryKey(String stockcode);

    int insert(IncStatement record);

    int insertSelective(IncStatement record);

    IncStatement selectByPrimaryKey(String stockcode);
}