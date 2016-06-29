package com.finreport.generator.mapper;

import com.finreport.generator.model.Stock;
import com.finreport.generator.model.StockExample;

public interface StockMapper {
    int countByExample(StockExample example);

    int deleteByPrimaryKey(String code);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}
