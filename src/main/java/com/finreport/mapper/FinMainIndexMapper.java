package com.finreport.mapper;

import com.finreport.model.FinMainIndex;

public interface FinMainIndexMapper {
    int deleteByPrimaryKey(String stockcode);

    int insert(FinMainIndex record);

    int insertSelective(FinMainIndex record);

    FinMainIndex selectByPrimaryKey(String stockcode);
}