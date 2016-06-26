package com.finreport.model;

public class CFStatement {
    private String stockcode;

    private Integer compcode;

    private Integer publishdate;

    private Integer begindate;

    private Integer enddate;

    private Integer reporttype;

    private String quarter;

    private Integer adjustdate;

    private Integer accstacode;

    private String accstaname;

    private Double laborgetcash;

    private Double deponetr;

    private Double bankloannetincr;

    private Double fininstnetr;

    private Double inspremcash;

    private Double insnetc;

    private Double savinetr;

    private Double disptradnetincr;

    private Double charintecash;

    private Double fdsborrnetr;

    private Double repnetincr;

    private Double taxrefd;

    private Double receotherbizcash;

    private Double bizinflitse;

    private Double bizinflform;

    private Double bizcashinfl;

    private Double labopayc;

    private Double loansnetr;

    private Double tradepaymnetr;

    private Double paycompgold;

    private Double payintecash;

    private Double paydivicash;

    private Double payworkcash;

    private Double paytax;

    private Double payacticash;

    private Double bizoutfitse;

    private Double bizoutfform;

    private Double bizcashoutf;

    private Double biznetitse;

    private Double biznetform;

    private Double mananetr;

    private Double withinvgetcash;

    private Double inveretugetcash;

    private Double fixedassetnetc;

    private Double subsnetc;

    private Double receinvcash;

    private Double reducashpled;

    private Double invinflitse;

    private Double invinffrom;

    private Double invcashinfl;

    private Double acquassetcash;

    private Double invpayc;

    private Double loannetr;

    private Double subspaynetcash;

    private Double payinvecash;

    private Double incrcashpled;

    private Double invoutfitse;

    private Double invoutfform;

    private Double invcashoutf;

    private Double netinvitse;

    private Double netinvform;

    private Double invnetcashflow;

    private Double invrececash;

    private Double subsrececash;

    private Double recefromloan;

    private Double issbdrececash;

    private Double recefincash;

    private Double fininflitse;

    private Double fininflform;

    private Double fincashinfl;

    private Double debtpaycash;

    private Double diviprofpaycash;

    private Double subspaydivid;

    private Double finrelacash;

    private Double finoutfitse;

    private Double finoutfform;

    private Double fincashoutf;

    private Double finnetitse;

    private Double finnetform;

    private Double finnetcflow;

    private Double chgexchgchgs;

    private Double netcashitse;

    private Double netcashform;

    private Double cashnetr;

    private Double inicashbala;

    private Double cashfinalitse;

    private Double cashfinalform;

    private Double finalcashbala;

    private Double netprofit;

    private Double minysharrigh;

    private Double unreinveloss;

    private Double asseimpa;

    private Double assedepr;

    private Double realestadep;

    private Double intaasseamor;

    private Double longdefeexpenamor;

    private Double prepexpedecr;

    private Double accrexpeincr;

    private Double dispfixedassetloss;

    private Double fixedassescraloss;

    private Double valuechgloss;

    private Double defeincoincr;

    private Double estidebts;

    private Double finexpe;

    private Double inveloss;

    private Double defetaxassetdecr;

    private Double defetaxliabincr;

    private Double inveredu;

    private Double receredu;

    private Double payaincr;

    private Double unseparachg;

    private Double unfiparachg;

    private Double other;

    private Double biznetscheitse;

    private Double biznetscheform;

    private Double biznetcflow;

    private Double debtintocapi;

    private Double expiconvbd;

    private Double finfixedasset;

    private Double cashfinalbala;

    private Double cashopenbala;

    private Double equfinalbala;

    private Double equopenbala;

    private Double netcashscheitse;

    private Double netcashscheform;

    private Double cashneti;

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

    public Integer getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Integer publishdate) {
        this.publishdate = publishdate;
    }

    public Integer getBegindate() {
        return begindate;
    }

    public void setBegindate(Integer begindate) {
        this.begindate = begindate;
    }

    public Integer getEnddate() {
        return enddate;
    }

    public void setEnddate(Integer enddate) {
        this.enddate = enddate;
    }

    public Integer getReporttype() {
        return reporttype;
    }

    public void setReporttype(Integer reporttype) {
        this.reporttype = reporttype;
    }

    public String getQuarter() {
        return enddate.toString().substring(4, 6);
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public Integer getAdjustdate() {
        return adjustdate;
    }

    public void setAdjustdate(Integer adjustdate) {
        this.adjustdate = adjustdate;
    }

    public Integer getAccstacode() {
        return accstacode;
    }

    public void setAccstacode(Integer accstacode) {
        this.accstacode = accstacode;
    }

    public String getAccstaname() {
        return accstaname;
    }

    public void setAccstaname(String accstaname) {
        this.accstaname = accstaname;
    }

    public Double getLaborgetcash() {
        return laborgetcash;
    }

    public void setLaborgetcash(Double laborgetcash) {
        this.laborgetcash = laborgetcash;
    }

    public Double getDeponetr() {
        return deponetr;
    }

    public void setDeponetr(Double deponetr) {
        this.deponetr = deponetr;
    }

    public Double getBankloannetincr() {
        return bankloannetincr;
    }

    public void setBankloannetincr(Double bankloannetincr) {
        this.bankloannetincr = bankloannetincr;
    }

    public Double getFininstnetr() {
        return fininstnetr;
    }

    public void setFininstnetr(Double fininstnetr) {
        this.fininstnetr = fininstnetr;
    }

    public Double getInspremcash() {
        return inspremcash;
    }

    public void setInspremcash(Double inspremcash) {
        this.inspremcash = inspremcash;
    }

    public Double getInsnetc() {
        return insnetc;
    }

    public void setInsnetc(Double insnetc) {
        this.insnetc = insnetc;
    }

    public Double getSavinetr() {
        return savinetr;
    }

    public void setSavinetr(Double savinetr) {
        this.savinetr = savinetr;
    }

    public Double getDisptradnetincr() {
        return disptradnetincr;
    }

    public void setDisptradnetincr(Double disptradnetincr) {
        this.disptradnetincr = disptradnetincr;
    }

    public Double getCharintecash() {
        return charintecash;
    }

    public void setCharintecash(Double charintecash) {
        this.charintecash = charintecash;
    }

    public Double getFdsborrnetr() {
        return fdsborrnetr;
    }

    public void setFdsborrnetr(Double fdsborrnetr) {
        this.fdsborrnetr = fdsborrnetr;
    }

    public Double getRepnetincr() {
        return repnetincr;
    }

    public void setRepnetincr(Double repnetincr) {
        this.repnetincr = repnetincr;
    }

    public Double getTaxrefd() {
        return taxrefd;
    }

    public void setTaxrefd(Double taxrefd) {
        this.taxrefd = taxrefd;
    }

    public Double getReceotherbizcash() {
        return receotherbizcash;
    }

    public void setReceotherbizcash(Double receotherbizcash) {
        this.receotherbizcash = receotherbizcash;
    }

    public Double getBizinflitse() {
        return bizinflitse;
    }

    public void setBizinflitse(Double bizinflitse) {
        this.bizinflitse = bizinflitse;
    }

    public Double getBizinflform() {
        return bizinflform;
    }

    public void setBizinflform(Double bizinflform) {
        this.bizinflform = bizinflform;
    }

    public Double getBizcashinfl() {
        return bizcashinfl;
    }

    public void setBizcashinfl(Double bizcashinfl) {
        this.bizcashinfl = bizcashinfl;
    }

    public Double getLabopayc() {
        return labopayc;
    }

    public void setLabopayc(Double labopayc) {
        this.labopayc = labopayc;
    }

    public Double getLoansnetr() {
        return loansnetr;
    }

    public void setLoansnetr(Double loansnetr) {
        this.loansnetr = loansnetr;
    }

    public Double getTradepaymnetr() {
        return tradepaymnetr;
    }

    public void setTradepaymnetr(Double tradepaymnetr) {
        this.tradepaymnetr = tradepaymnetr;
    }

    public Double getPaycompgold() {
        return paycompgold;
    }

    public void setPaycompgold(Double paycompgold) {
        this.paycompgold = paycompgold;
    }

    public Double getPayintecash() {
        return payintecash;
    }

    public void setPayintecash(Double payintecash) {
        this.payintecash = payintecash;
    }

    public Double getPaydivicash() {
        return paydivicash;
    }

    public void setPaydivicash(Double paydivicash) {
        this.paydivicash = paydivicash;
    }

    public Double getPayworkcash() {
        return payworkcash;
    }

    public void setPayworkcash(Double payworkcash) {
        this.payworkcash = payworkcash;
    }

    public Double getPaytax() {
        return paytax;
    }

    public void setPaytax(Double paytax) {
        this.paytax = paytax;
    }

    public Double getPayacticash() {
        return payacticash;
    }

    public void setPayacticash(Double payacticash) {
        this.payacticash = payacticash;
    }

    public Double getBizoutfitse() {
        return bizoutfitse;
    }

    public void setBizoutfitse(Double bizoutfitse) {
        this.bizoutfitse = bizoutfitse;
    }

    public Double getBizoutfform() {
        return bizoutfform;
    }

    public void setBizoutfform(Double bizoutfform) {
        this.bizoutfform = bizoutfform;
    }

    public Double getBizcashoutf() {
        return bizcashoutf;
    }

    public void setBizcashoutf(Double bizcashoutf) {
        this.bizcashoutf = bizcashoutf;
    }

    public Double getBiznetitse() {
        return biznetitse;
    }

    public void setBiznetitse(Double biznetitse) {
        this.biznetitse = biznetitse;
    }

    public Double getBiznetform() {
        return biznetform;
    }

    public void setBiznetform(Double biznetform) {
        this.biznetform = biznetform;
    }

    public Double getMananetr() {
        return mananetr;
    }

    public void setMananetr(Double mananetr) {
        this.mananetr = mananetr;
    }

    public Double getWithinvgetcash() {
        return withinvgetcash;
    }

    public void setWithinvgetcash(Double withinvgetcash) {
        this.withinvgetcash = withinvgetcash;
    }

    public Double getInveretugetcash() {
        return inveretugetcash;
    }

    public void setInveretugetcash(Double inveretugetcash) {
        this.inveretugetcash = inveretugetcash;
    }

    public Double getFixedassetnetc() {
        return fixedassetnetc;
    }

    public void setFixedassetnetc(Double fixedassetnetc) {
        this.fixedassetnetc = fixedassetnetc;
    }

    public Double getSubsnetc() {
        return subsnetc;
    }

    public void setSubsnetc(Double subsnetc) {
        this.subsnetc = subsnetc;
    }

    public Double getReceinvcash() {
        return receinvcash;
    }

    public void setReceinvcash(Double receinvcash) {
        this.receinvcash = receinvcash;
    }

    public Double getReducashpled() {
        return reducashpled;
    }

    public void setReducashpled(Double reducashpled) {
        this.reducashpled = reducashpled;
    }

    public Double getInvinflitse() {
        return invinflitse;
    }

    public void setInvinflitse(Double invinflitse) {
        this.invinflitse = invinflitse;
    }

    public Double getInvinffrom() {
        return invinffrom;
    }

    public void setInvinffrom(Double invinffrom) {
        this.invinffrom = invinffrom;
    }

    public Double getInvcashinfl() {
        return invcashinfl;
    }

    public void setInvcashinfl(Double invcashinfl) {
        this.invcashinfl = invcashinfl;
    }

    public Double getAcquassetcash() {
        return acquassetcash;
    }

    public void setAcquassetcash(Double acquassetcash) {
        this.acquassetcash = acquassetcash;
    }

    public Double getInvpayc() {
        return invpayc;
    }

    public void setInvpayc(Double invpayc) {
        this.invpayc = invpayc;
    }

    public Double getLoannetr() {
        return loannetr;
    }

    public void setLoannetr(Double loannetr) {
        this.loannetr = loannetr;
    }

    public Double getSubspaynetcash() {
        return subspaynetcash;
    }

    public void setSubspaynetcash(Double subspaynetcash) {
        this.subspaynetcash = subspaynetcash;
    }

    public Double getPayinvecash() {
        return payinvecash;
    }

    public void setPayinvecash(Double payinvecash) {
        this.payinvecash = payinvecash;
    }

    public Double getIncrcashpled() {
        return incrcashpled;
    }

    public void setIncrcashpled(Double incrcashpled) {
        this.incrcashpled = incrcashpled;
    }

    public Double getInvoutfitse() {
        return invoutfitse;
    }

    public void setInvoutfitse(Double invoutfitse) {
        this.invoutfitse = invoutfitse;
    }

    public Double getInvoutfform() {
        return invoutfform;
    }

    public void setInvoutfform(Double invoutfform) {
        this.invoutfform = invoutfform;
    }

    public Double getInvcashoutf() {
        return invcashoutf;
    }

    public void setInvcashoutf(Double invcashoutf) {
        this.invcashoutf = invcashoutf;
    }

    public Double getNetinvitse() {
        return netinvitse;
    }

    public void setNetinvitse(Double netinvitse) {
        this.netinvitse = netinvitse;
    }

    public Double getNetinvform() {
        return netinvform;
    }

    public void setNetinvform(Double netinvform) {
        this.netinvform = netinvform;
    }

    public Double getInvnetcashflow() {
        return invnetcashflow;
    }

    public void setInvnetcashflow(Double invnetcashflow) {
        this.invnetcashflow = invnetcashflow;
    }

    public Double getInvrececash() {
        return invrececash;
    }

    public void setInvrececash(Double invrececash) {
        this.invrececash = invrececash;
    }

    public Double getSubsrececash() {
        return subsrececash;
    }

    public void setSubsrececash(Double subsrececash) {
        this.subsrececash = subsrececash;
    }

    public Double getRecefromloan() {
        return recefromloan;
    }

    public void setRecefromloan(Double recefromloan) {
        this.recefromloan = recefromloan;
    }

    public Double getIssbdrececash() {
        return issbdrececash;
    }

    public void setIssbdrececash(Double issbdrececash) {
        this.issbdrececash = issbdrececash;
    }

    public Double getRecefincash() {
        return recefincash;
    }

    public void setRecefincash(Double recefincash) {
        this.recefincash = recefincash;
    }

    public Double getFininflitse() {
        return fininflitse;
    }

    public void setFininflitse(Double fininflitse) {
        this.fininflitse = fininflitse;
    }

    public Double getFininflform() {
        return fininflform;
    }

    public void setFininflform(Double fininflform) {
        this.fininflform = fininflform;
    }

    public Double getFincashinfl() {
        return fincashinfl;
    }

    public void setFincashinfl(Double fincashinfl) {
        this.fincashinfl = fincashinfl;
    }

    public Double getDebtpaycash() {
        return debtpaycash;
    }

    public void setDebtpaycash(Double debtpaycash) {
        this.debtpaycash = debtpaycash;
    }

    public Double getDiviprofpaycash() {
        return diviprofpaycash;
    }

    public void setDiviprofpaycash(Double diviprofpaycash) {
        this.diviprofpaycash = diviprofpaycash;
    }

    public Double getSubspaydivid() {
        return subspaydivid;
    }

    public void setSubspaydivid(Double subspaydivid) {
        this.subspaydivid = subspaydivid;
    }

    public Double getFinrelacash() {
        return finrelacash;
    }

    public void setFinrelacash(Double finrelacash) {
        this.finrelacash = finrelacash;
    }

    public Double getFinoutfitse() {
        return finoutfitse;
    }

    public void setFinoutfitse(Double finoutfitse) {
        this.finoutfitse = finoutfitse;
    }

    public Double getFinoutfform() {
        return finoutfform;
    }

    public void setFinoutfform(Double finoutfform) {
        this.finoutfform = finoutfform;
    }

    public Double getFincashoutf() {
        return fincashoutf;
    }

    public void setFincashoutf(Double fincashoutf) {
        this.fincashoutf = fincashoutf;
    }

    public Double getFinnetitse() {
        return finnetitse;
    }

    public void setFinnetitse(Double finnetitse) {
        this.finnetitse = finnetitse;
    }

    public Double getFinnetform() {
        return finnetform;
    }

    public void setFinnetform(Double finnetform) {
        this.finnetform = finnetform;
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

    public Double getNetcashitse() {
        return netcashitse;
    }

    public void setNetcashitse(Double netcashitse) {
        this.netcashitse = netcashitse;
    }

    public Double getNetcashform() {
        return netcashform;
    }

    public void setNetcashform(Double netcashform) {
        this.netcashform = netcashform;
    }

    public Double getCashnetr() {
        return cashnetr;
    }

    public void setCashnetr(Double cashnetr) {
        this.cashnetr = cashnetr;
    }

    public Double getInicashbala() {
        return inicashbala;
    }

    public void setInicashbala(Double inicashbala) {
        this.inicashbala = inicashbala;
    }

    public Double getCashfinalitse() {
        return cashfinalitse;
    }

    public void setCashfinalitse(Double cashfinalitse) {
        this.cashfinalitse = cashfinalitse;
    }

    public Double getCashfinalform() {
        return cashfinalform;
    }

    public void setCashfinalform(Double cashfinalform) {
        this.cashfinalform = cashfinalform;
    }

    public Double getFinalcashbala() {
        return finalcashbala;
    }

    public void setFinalcashbala(Double finalcashbala) {
        this.finalcashbala = finalcashbala;
    }

    public Double getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(Double netprofit) {
        this.netprofit = netprofit;
    }

    public Double getMinysharrigh() {
        return minysharrigh;
    }

    public void setMinysharrigh(Double minysharrigh) {
        this.minysharrigh = minysharrigh;
    }

    public Double getUnreinveloss() {
        return unreinveloss;
    }

    public void setUnreinveloss(Double unreinveloss) {
        this.unreinveloss = unreinveloss;
    }

    public Double getAsseimpa() {
        return asseimpa;
    }

    public void setAsseimpa(Double asseimpa) {
        this.asseimpa = asseimpa;
    }

    public Double getAssedepr() {
        return assedepr;
    }

    public void setAssedepr(Double assedepr) {
        this.assedepr = assedepr;
    }

    public Double getRealestadep() {
        return realestadep;
    }

    public void setRealestadep(Double realestadep) {
        this.realestadep = realestadep;
    }

    public Double getIntaasseamor() {
        return intaasseamor;
    }

    public void setIntaasseamor(Double intaasseamor) {
        this.intaasseamor = intaasseamor;
    }

    public Double getLongdefeexpenamor() {
        return longdefeexpenamor;
    }

    public void setLongdefeexpenamor(Double longdefeexpenamor) {
        this.longdefeexpenamor = longdefeexpenamor;
    }

    public Double getPrepexpedecr() {
        return prepexpedecr;
    }

    public void setPrepexpedecr(Double prepexpedecr) {
        this.prepexpedecr = prepexpedecr;
    }

    public Double getAccrexpeincr() {
        return accrexpeincr;
    }

    public void setAccrexpeincr(Double accrexpeincr) {
        this.accrexpeincr = accrexpeincr;
    }

    public Double getDispfixedassetloss() {
        return dispfixedassetloss;
    }

    public void setDispfixedassetloss(Double dispfixedassetloss) {
        this.dispfixedassetloss = dispfixedassetloss;
    }

    public Double getFixedassescraloss() {
        return fixedassescraloss;
    }

    public void setFixedassescraloss(Double fixedassescraloss) {
        this.fixedassescraloss = fixedassescraloss;
    }

    public Double getValuechgloss() {
        return valuechgloss;
    }

    public void setValuechgloss(Double valuechgloss) {
        this.valuechgloss = valuechgloss;
    }

    public Double getDefeincoincr() {
        return defeincoincr;
    }

    public void setDefeincoincr(Double defeincoincr) {
        this.defeincoincr = defeincoincr;
    }

    public Double getEstidebts() {
        return estidebts;
    }

    public void setEstidebts(Double estidebts) {
        this.estidebts = estidebts;
    }

    public Double getFinexpe() {
        return finexpe;
    }

    public void setFinexpe(Double finexpe) {
        this.finexpe = finexpe;
    }

    public Double getInveloss() {
        return inveloss;
    }

    public void setInveloss(Double inveloss) {
        this.inveloss = inveloss;
    }

    public Double getDefetaxassetdecr() {
        return defetaxassetdecr;
    }

    public void setDefetaxassetdecr(Double defetaxassetdecr) {
        this.defetaxassetdecr = defetaxassetdecr;
    }

    public Double getDefetaxliabincr() {
        return defetaxliabincr;
    }

    public void setDefetaxliabincr(Double defetaxliabincr) {
        this.defetaxliabincr = defetaxliabincr;
    }

    public Double getInveredu() {
        return inveredu;
    }

    public void setInveredu(Double inveredu) {
        this.inveredu = inveredu;
    }

    public Double getReceredu() {
        return receredu;
    }

    public void setReceredu(Double receredu) {
        this.receredu = receredu;
    }

    public Double getPayaincr() {
        return payaincr;
    }

    public void setPayaincr(Double payaincr) {
        this.payaincr = payaincr;
    }

    public Double getUnseparachg() {
        return unseparachg;
    }

    public void setUnseparachg(Double unseparachg) {
        this.unseparachg = unseparachg;
    }

    public Double getUnfiparachg() {
        return unfiparachg;
    }

    public void setUnfiparachg(Double unfiparachg) {
        this.unfiparachg = unfiparachg;
    }

    public Double getOther() {
        return other;
    }

    public void setOther(Double other) {
        this.other = other;
    }

    public Double getBiznetscheitse() {
        return biznetscheitse;
    }

    public void setBiznetscheitse(Double biznetscheitse) {
        this.biznetscheitse = biznetscheitse;
    }

    public Double getBiznetscheform() {
        return biznetscheform;
    }

    public void setBiznetscheform(Double biznetscheform) {
        this.biznetscheform = biznetscheform;
    }

    public Double getBiznetcflow() {
        return biznetcflow;
    }

    public void setBiznetcflow(Double biznetcflow) {
        this.biznetcflow = biznetcflow;
    }

    public Double getDebtintocapi() {
        return debtintocapi;
    }

    public void setDebtintocapi(Double debtintocapi) {
        this.debtintocapi = debtintocapi;
    }

    public Double getExpiconvbd() {
        return expiconvbd;
    }

    public void setExpiconvbd(Double expiconvbd) {
        this.expiconvbd = expiconvbd;
    }

    public Double getFinfixedasset() {
        return finfixedasset;
    }

    public void setFinfixedasset(Double finfixedasset) {
        this.finfixedasset = finfixedasset;
    }

    public Double getCashfinalbala() {
        return cashfinalbala;
    }

    public void setCashfinalbala(Double cashfinalbala) {
        this.cashfinalbala = cashfinalbala;
    }

    public Double getCashopenbala() {
        return cashopenbala;
    }

    public void setCashopenbala(Double cashopenbala) {
        this.cashopenbala = cashopenbala;
    }

    public Double getEqufinalbala() {
        return equfinalbala;
    }

    public void setEqufinalbala(Double equfinalbala) {
        this.equfinalbala = equfinalbala;
    }

    public Double getEquopenbala() {
        return equopenbala;
    }

    public void setEquopenbala(Double equopenbala) {
        this.equopenbala = equopenbala;
    }

    public Double getNetcashscheitse() {
        return netcashscheitse;
    }

    public void setNetcashscheitse(Double netcashscheitse) {
        this.netcashscheitse = netcashscheitse;
    }

    public Double getNetcashscheform() {
        return netcashscheform;
    }

    public void setNetcashscheform(Double netcashscheform) {
        this.netcashscheform = netcashscheform;
    }

    public Double getCashneti() {
        return cashneti;
    }

    public void setCashneti(Double cashneti) {
        this.cashneti = cashneti;
    }
}