package com.finreport.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finreport.mapper.BalSheetMapper;
import com.finreport.mapper.CFStatementMapper;
import com.finreport.mapper.FinMainIndexMapper;
import com.finreport.mapper.IncStatementMapper;
import com.finreport.mapper.StockMapper;
import com.finreport.model.BalSheet;
import com.finreport.model.CFStatement;
import com.finreport.model.FinMainIndex;
import com.finreport.model.IncStatement;
import com.finreport.model.Stock;
import com.sun.org.apache.bcel.internal.generic.RETURN;

@Component
public class FinStatementDaoImpl implements FinStatementDao {
	@Autowired
	private BalSheetMapper balSheetMapper;
	
	@Autowired 
	private CFStatementMapper cfStatementMapper;
	
	@Autowired
	private FinMainIndexMapper finMainIndexMapper;
	
	@Autowired
	private IncStatementMapper incStatementMapper;
	
	@Autowired
	private StockMapper stockMapper;
	
	public BalSheet getBalanceByStockCode(String stockcode) {
		return balSheetMapper.selectByPrimaryKey(stockcode);
	}
	
	public Boolean addBalanceStatement(BalSheet balSheet) {
		int result = balSheetMapper.insertSelective(balSheet);
		return result > 0;
	}
	
	public Boolean addCFStatement(CFStatement cfStatement) {
		int result = cfStatementMapper.insertSelective(cfStatement);
		return result > 0;
	}
	
	public Boolean addFinMainIndex(FinMainIndex finMainIndex) {
		int result = finMainIndexMapper.insertSelective(finMainIndex);
		return result > 0;
	}
	
	public Boolean addIncStatement(IncStatement incStatement) {
		int result = incStatementMapper.insertSelective(incStatement);
		return result > 0;
	}
	
	public Boolean addStock(Stock stock) {
		int result = stockMapper.insertSelective(stock);
		return result > 0;
	}
}
