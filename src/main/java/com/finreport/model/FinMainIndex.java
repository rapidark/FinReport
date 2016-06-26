package com.finreport.model;

public class FinMainIndex {
    private String stockcode;

    private Integer compcode;

    private Integer reportdate;

    private String quarter;

    private Double basiceps;

    private Double epsdiluted;

    private Double epsweighted;

    private Double naps;

    private Double opercashpershare;

    private Double peropecashpershare;

    private Double netassgrowrate;

    private Double dilutedroe;

    private Double weightedroe;

    private Double mainbusincgrowrate;

    private Double netincgrowrate;

    private Double totassgrowrate;

    private Double salegrossprofitrto;

    private Double mainbusiincome;

    private Double mainbusiprofit;

    private Double totprofit;

    private Double netprofit;

    private Double totalassets;

    private Double totalliab;

    private Double totsharequi;

    private Double operrevenue;

    private Double invnetcashflow;

    private Double finnetcflow;

    private Double chgexchgchgs;

    private Double cashnetr;

    private Double cashequfinbal;

    private Double symbol;

    private Double name;

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode;
    }

    public Integer getCompcode() {
        return compcode;
    }

    public void setCompcode(Integer compcode) {
        this.compcode = compcode;
    }

    public Integer getReportdate() {
        return reportdate;
    }

    public void setReportdate(Integer reportdate) {
        this.reportdate = reportdate;
    }

    public String getQuarter() {
        return reportdate.toString().substring(4, 6);
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public Double getBasiceps() {
        return basiceps;
    }

    public void setBasiceps(Double basiceps) {
        this.basiceps = basiceps;
    }

    public Double getEpsdiluted() {
        return epsdiluted;
    }

    public void setEpsdiluted(Double epsdiluted) {
        this.epsdiluted = epsdiluted;
    }

    public Double getEpsweighted() {
        return epsweighted;
    }

    public void setEpsweighted(Double epsweighted) {
        this.epsweighted = epsweighted;
    }

    public Double getNaps() {
        return naps;
    }

    public void setNaps(Double naps) {
        this.naps = naps;
    }

    public Double getOpercashpershare() {
        return opercashpershare;
    }

    public void setOpercashpershare(Double opercashpershare) {
        this.opercashpershare = opercashpershare;
    }

    public Double getPeropecashpershare() {
        return peropecashpershare;
    }

    public void setPeropecashpershare(Double peropecashpershare) {
        this.peropecashpershare = peropecashpershare;
    }

    public Double getNetassgrowrate() {
        return netassgrowrate;
    }

    public void setNetassgrowrate(Double netassgrowrate) {
        this.netassgrowrate = netassgrowrate;
    }

    public Double getDilutedroe() {
        return dilutedroe;
    }

    public void setDilutedroe(Double dilutedroe) {
        this.dilutedroe = dilutedroe;
    }

    public Double getWeightedroe() {
        return weightedroe;
    }

    public void setWeightedroe(Double weightedroe) {
        this.weightedroe = weightedroe;
    }

    public Double getMainbusincgrowrate() {
        return mainbusincgrowrate;
    }

    public void setMainbusincgrowrate(Double mainbusincgrowrate) {
        this.mainbusincgrowrate = mainbusincgrowrate;
    }

    public Double getNetincgrowrate() {
        return netincgrowrate;
    }

    public void setNetincgrowrate(Double netincgrowrate) {
        this.netincgrowrate = netincgrowrate;
    }

    public Double getTotassgrowrate() {
        return totassgrowrate;
    }

    public void setTotassgrowrate(Double totassgrowrate) {
        this.totassgrowrate = totassgrowrate;
    }

    public Double getSalegrossprofitrto() {
        return salegrossprofitrto;
    }

    public void setSalegrossprofitrto(Double salegrossprofitrto) {
        this.salegrossprofitrto = salegrossprofitrto;
    }

    public Double getMainbusiincome() {
        return mainbusiincome;
    }

    public void setMainbusiincome(Double mainbusiincome) {
        this.mainbusiincome = mainbusiincome;
    }

    public Double getMainbusiprofit() {
        return mainbusiprofit;
    }

    public void setMainbusiprofit(Double mainbusiprofit) {
        this.mainbusiprofit = mainbusiprofit;
    }

    public Double getTotprofit() {
        return totprofit;
    }

    public void setTotprofit(Double totprofit) {
        this.totprofit = totprofit;
    }

    public Double getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(Double netprofit) {
        this.netprofit = netprofit;
    }

    public Double getTotalassets() {
        return totalassets;
    }

    public void setTotalassets(Double totalassets) {
        this.totalassets = totalassets;
    }

    public Double getTotalliab() {
        return totalliab;
    }

    public void setTotalliab(Double totalliab) {
        this.totalliab = totalliab;
    }

    public Double getTotsharequi() {
        return totsharequi;
    }

    public void setTotsharequi(Double totsharequi) {
        this.totsharequi = totsharequi;
    }

    public Double getOperrevenue() {
        return operrevenue;
    }

    public void setOperrevenue(Double operrevenue) {
        this.operrevenue = operrevenue;
    }

    public Double getInvnetcashflow() {
        return invnetcashflow;
    }

    public void setInvnetcashflow(Double invnetcashflow) {
        this.invnetcashflow = invnetcashflow;
    }

    public Double getFinnetcflow() {
        return finnetcflow;
    }

    public void setFinnetcflow(Double finnetcflow) {
        this.finnetcflow = finnetcflow;
    }

    public Double getChgexchgchgs() {
        return chgexchgchgs;
    }

    public void setChgexchgchgs(Double chgexchgchgs) {
        this.chgexchgchgs = chgexchgchgs;
    }

    public Double getCashnetr() {
        return cashnetr;
    }

    public void setCashnetr(Double cashnetr) {
        this.cashnetr = cashnetr;
    }

    public Double getCashequfinbal() {
        return cashequfinbal;
    }

    public void setCashequfinbal(Double cashequfinbal) {
        this.cashequfinbal = cashequfinbal;
    }

    public Double getSymbol() {
        return symbol;
    }

    public void setSymbol(Double symbol) {
        this.symbol = symbol;
    }

    public Double getName() {
        return name;
    }

    public void setName(Double name) {
        this.name = name;
    }
}