package com.finreport.mapper;

import java.util.List;
import java.util.Map;

import com.finreport.model.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(String code);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
    
    int countBySymbol(String symbol);
    
    int countByCode(String code);
    
    List<String> getNonFinancialStock();
    
    List<Stock> getMinMartetCapitial();
    
    List<Map<String, Object>> getMinPb();
}
