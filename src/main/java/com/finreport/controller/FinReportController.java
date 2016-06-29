package com.finreport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finStatement")
public class FinReportController {
	@RequestMapping("/cash")
	public void getCashStatement() {
		
	}
	
	@RequestMapping(name = "/income", method = RequestMethod.GET)
	public void getIncomeStatement(@RequestParam(value = "code") String code) {
		
	}
	
	@RequestMapping(name = "/balance", method = RequestMethod.GET)
	public void getBalanceStatement(@RequestParam(value = "code") String code) {
		
	}
	
	@RequestMapping("/finindex")
	public void getFinIndex(@RequestParam(value = "code") String code) {
		
	}
}
