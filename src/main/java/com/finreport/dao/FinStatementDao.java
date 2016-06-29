package com.finreport.dao;

import java.util.List;

import com.finreport.model.BalSheet;
import com.finreport.model.CFStatement;
import com.finreport.model.FinMainIndex;
import com.finreport.model.IncStatement;
import com.finreport.model.Stock;

public interface FinStatementDao {
	public BalSheet getBalanceByStockCode(String stockcode);
	
	public Boolean addBalanceStatement(BalSheet balSheet);
	
	public boolean isBalanceStatementExist(String stockcode, Integer reportDate);
	
	public Boolean addCFStatement(CFStatement cfStatement);
	
	public boolean isCFStatementExist(String stockcode, Integer reportDate);
	
	public Boolean addFinMainIndex(FinMainIndex finMainIndex);
	
	public boolean isFinMainIndexExist(String stockcode, Integer reportDate);
	
	public Boolean addIncStatement(IncStatement incStatement);
	
	public boolean isIncStatementExist(String stockcode, Integer reportDate);
	
	public Boolean addStock(Stock stock);
	
	public Boolean updateStock(Stock stock) ;
	
	public void deleteStock(String code);
	
	public Boolean isStockExist(String symbol);
	
	public void batchAddBalStatement(List<BalSheet> balSheets);
	
	public void batchAddIncStatement(List<IncStatement> incStatements);
	
	public void batchAddCFStatement(List<CFStatement> cfStatements);
	
	public void batchAddFinMainIndex(List<FinMainIndex> finIndexs);
	
	public void batchAddFinancialReport(List<BalSheet> balSheets, List<IncStatement> incStatements, List<CFStatement> cfStatements, List<FinMainIndex> finIndexs);
	
	public List<String> getNonfinancialReport();
}
