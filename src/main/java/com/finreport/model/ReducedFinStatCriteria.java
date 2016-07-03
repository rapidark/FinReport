package com.finreport.model;

import java.util.List;

public class ReducedFinStatCriteria {
	String[] codes;
	
	List<ReducedFinStat> finStats;

	public String[] getCodes() {
		return codes;
	}

	public void setCodes(String[] codes) {
		this.codes = codes;
	}

	public List<ReducedFinStat> getFinStats() {
		return finStats;
	}

	public void setFinStats(List<ReducedFinStat> finStats) {
		this.finStats = finStats;
	}
}
