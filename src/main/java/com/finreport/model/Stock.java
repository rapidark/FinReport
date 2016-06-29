package com.finreport.model;

public class Stock {
    private String code;

    private String symbol;

    private String name;

    private Float current;

    private Float percent;

    private Float change;

    private Float high;

    private Float low;

    private Float high52w;

    private Float low52w;

    private Double marketcapital;

    private Double amount;

    private Float pettm;

    private Double volume;

    private Boolean hasexist;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCurrent() {
        return current;
    }

    public void setCurrent(Float current) {
        this.current = current;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public Float getChange() {
        return change;
    }

    public void setChange(Float change) {
        this.change = change;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    public Float getHigh52w() {
        return high52w;
    }

    public void setHigh52w(Float high52w) {
        this.high52w = high52w;
    }

    public Float getLow52w() {
        return low52w;
    }

    public void setLow52w(Float low52w) {
        this.low52w = low52w;
    }

    public Double getMarketcapital() {
        return marketcapital;
    }

    public void setMarketcapital(Double marketcapital) {
        this.marketcapital = marketcapital;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Float getPettm() {
        return pettm;
    }

    public void setPettm(Float pettm) {
        this.pettm = pettm;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Boolean getHasexist() {
        return hasexist;
    }

    public void setHasexist(Boolean hasexist) {
        this.hasexist = hasexist;
    }

	@Override
	public String toString() {
		return "Stock [code=" + code + ", symbol=" + symbol + ", name=" + name + ", current=" + current + ", percent=" + percent + ", change=" + change + ", high=" + high + ", low=" + low
				+ ", high52w=" + high52w + ", low52w=" + low52w + ", marketcapital=" + marketcapital + ", amount=" + amount + ", pettm=" + pettm + ", volume=" + volume + ", hasexist=" + hasexist
				+ "]";
	}
}
