package com.finreport.mapper;

import com.finreport.model.BalSheet;

public interface BalSheetMapper {
	int deleteByPrimaryKey(String stockcode);

    int insert(BalSheet record);

    int insertSelective(BalSheet record);

    BalSheet selectByPrimaryKey(String stockcode);
}
