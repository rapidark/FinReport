package com.finreport.mapper;

import com.finreport.model.CFStatement;

public interface CFStatementMapper {
    int deleteByPrimaryKey(String stockcode);

    int insert(CFStatement record);

    int insertSelective(CFStatement record);

    CFStatement selectByPrimaryKey(String stockcode);
}