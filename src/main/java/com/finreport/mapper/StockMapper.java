package com.finreport.mapper;

import com.finreport.model.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(String code);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
    
    int countBySymbol(String symbol);
}
