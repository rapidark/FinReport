package com.finreport.dao;

import com.finreport.model.BalSheet;
import com.finreport.model.CFStatement;
import com.finreport.model.FinMainIndex;
import com.finreport.model.IncStatement;
import com.finreport.model.Stock;

public interface FinStatementDao {
	public BalSheet getBalanceByStockCode(String stockcode);
	
	public Boolean addBalanceStatement(BalSheet balSheet);
	
	public Boolean addCFStatement(CFStatement cfStatement);
	
	public Boolean addFinMainIndex(FinMainIndex finMainIndex);
	
	public Boolean addIncStatement(IncStatement incStatement);
	
	public Boolean addStock(Stock stock);
}
