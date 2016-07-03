package com.finreport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.finreport.model.BalSheet;
import com.finreport.model.CFStatement;
import com.finreport.model.FinMainIndex;
import com.finreport.model.IncStatement;
import com.finreport.model.ReducedFinStat;
import com.finreport.model.ReducedFinStatCriteria;
import com.finreport.service.FinStatementService;

@RestController
public class FinStatementController {
	
	 public static final String annualReport = "12";
	
	@Autowired
	FinStatementService finStatementService;
	
	@RequestMapping(value = "/cash", method = RequestMethod.GET)
	public List<CFStatement> getCashStatement(@RequestParam(value = "code") String code) {
		String[] codes = code.split(",");
		return finStatementService.getCFStatementByStockCodeAndQuarter(codes, annualReport);
	}
	
	@RequestMapping(value = "/income", method = RequestMethod.GET)
	public List<IncStatement> getIncomeStatement(@RequestParam(value = "code") String code) {
		String[] codes = code.split(",");
		return finStatementService.getIncStatementByStockCodeAndQuarter(codes, annualReport);
	}
	
	@RequestMapping(value = "/balance", method = RequestMethod.GET)
	public List<BalSheet> getBalanceStatement(@RequestParam(value = "code") String code) {
		String[] codes = code.split(",");
		return finStatementService.getBalSheetByStockCodeAndQuarter(codes, annualReport);
	}
	
	@RequestMapping(value = "/finindex", method = RequestMethod.GET)
	public List<FinMainIndex> getFinIndex(@RequestParam(value = "code") String code) {
		String[] codes = code.split(",");
		return finStatementService.getFinMainIndexByStockCodeAndQuarter(codes, annualReport);
	}
	
	@RequestMapping(value="/getSpecificFinStatement")
	public List<ReducedFinStat> getSpecificFinStatement(@RequestBody ReducedFinStatCriteria criteria) {
		finStatementService.getSpecificFinStatement(criteria.getCodes(), criteria.getFinStats(), annualReport);
		return null;
	}
}
