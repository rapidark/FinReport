package com.finreport.model;

public class IncStatement {
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

    private Double biztotinco;

    private Double bizinco;

    private Double inteinco;

    private Double earnprem;

    private Double pouninco;

    private Double realsale;

    private Double otherbizinco;

    private Double biztotincoitse;

    private Double biztotincoform;

    private Double biztotcost;

    private Double bizcost;

    private Double inteexpe;

    private Double pounexpe;

    private Double realsalecost;

    private Double deveexpe;

    private Double surrgold;

    private Double compnetexpe;

    private Double contress;

    private Double polidiviexpe;

    private Double reinexpe;

    private Double otherbizcost;

    private Double biztax;

    private Double salesexpe;

    private Double manaexpe;

    private Double finexpe;

    private Double asseimpaloss;

    private Double biztotcostitse;

    private Double biztotcostform;

    private Double valuechgloss;

    private Double inveinco;

    private Double assoinveprof;

    private Double exchggain;

    private Double futuloss;

    private Double custinco;

    private Double subsidyincome;

    private Double otherbizprof;

    private Double bizprofitse;

    private Double operprofform;

    private Double perprofit;

    private Double nonoreve;

    private Double nonoexpe;

    private Double noncassetsdisl;

    private Double proftotitse;

    private Double proftotform;

    private Double totprofit;

    private Double incotaxexpe;

    private Double unreinveloss;

    private Double netpro1itse;

    private Double netpro1form;

    private Double netprofit;

    private Double parenetp;

    private Double mergeformnetprof;

    private Double minysharrigh;

    private Double netpro2itse;

    private Double netpro2form;

    private Double basiceps;

    private Double dilutedeps;

    private Double othercompinco;

    private Double parecompinco;

    private Double minysharinco;

    private Double compincoamt;

    private Double parecompincoamt;

    private Double minysharincoamt;

    private Double earlyundiprof;

    private Double undisprofredu;

    private Double otherinto;

    private Double otherdistprof;

    private Double legalsurp;

    private Double welfare;

    private Double capitalreserve;

    private Double staffaward;

    private Double reservefund;

    private Double developfund;

    private Double profreturninvest;

    private Double supplycurcap;

    private Double avaidistshareprof;

    private Double preferredskdiv;

    private Double freesurplu;

    private Double dealwithdivi;

    private Double capitalizeddivi;

    private Double undisprofit;

    private Double selldepartgain;

    private Double natudisasterloss;

    private Double accpolicychg;

    private Double accestimatechg;

    private Double debtrestruloss;

    private Double othersupply;

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

    public Double getBiztotinco() {
        return biztotinco;
    }

    public void setBiztotinco(Double biztotinco) {
        this.biztotinco = biztotinco;
    }

    public Double getBizinco() {
        return bizinco;
    }

    public void setBizinco(Double bizinco) {
        this.bizinco = bizinco;
    }

    public Double getInteinco() {
        return inteinco;
    }

    public void setInteinco(Double inteinco) {
        this.inteinco = inteinco;
    }

    public Double getEarnprem() {
        return earnprem;
    }

    public void setEarnprem(Double earnprem) {
        this.earnprem = earnprem;
    }

    public Double getPouninco() {
        return pouninco;
    }

    public void setPouninco(Double pouninco) {
        this.pouninco = pouninco;
    }

    public Double getRealsale() {
        return realsale;
    }

    public void setRealsale(Double realsale) {
        this.realsale = realsale;
    }

    public Double getOtherbizinco() {
        return otherbizinco;
    }

    public void setOtherbizinco(Double otherbizinco) {
        this.otherbizinco = otherbizinco;
    }

    public Double getBiztotincoitse() {
        return biztotincoitse;
    }

    public void setBiztotincoitse(Double biztotincoitse) {
        this.biztotincoitse = biztotincoitse;
    }

    public Double getBiztotincoform() {
        return biztotincoform;
    }

    public void setBiztotincoform(Double biztotincoform) {
        this.biztotincoform = biztotincoform;
    }

    public Double getBiztotcost() {
        return biztotcost;
    }

    public void setBiztotcost(Double biztotcost) {
        this.biztotcost = biztotcost;
    }

    public Double getBizcost() {
        return bizcost;
    }

    public void setBizcost(Double bizcost) {
        this.bizcost = bizcost;
    }

    public Double getInteexpe() {
        return inteexpe;
    }

    public void setInteexpe(Double inteexpe) {
        this.inteexpe = inteexpe;
    }

    public Double getPounexpe() {
        return pounexpe;
    }

    public void setPounexpe(Double pounexpe) {
        this.pounexpe = pounexpe;
    }

    public Double getRealsalecost() {
        return realsalecost;
    }

    public void setRealsalecost(Double realsalecost) {
        this.realsalecost = realsalecost;
    }

    public Double getDeveexpe() {
        return deveexpe;
    }

    public void setDeveexpe(Double deveexpe) {
        this.deveexpe = deveexpe;
    }

    public Double getSurrgold() {
        return surrgold;
    }

    public void setSurrgold(Double surrgold) {
        this.surrgold = surrgold;
    }

    public Double getCompnetexpe() {
        return compnetexpe;
    }

    public void setCompnetexpe(Double compnetexpe) {
        this.compnetexpe = compnetexpe;
    }

    public Double getContress() {
        return contress;
    }

    public void setContress(Double contress) {
        this.contress = contress;
    }

    public Double getPolidiviexpe() {
        return polidiviexpe;
    }

    public void setPolidiviexpe(Double polidiviexpe) {
        this.polidiviexpe = polidiviexpe;
    }

    public Double getReinexpe() {
        return reinexpe;
    }

    public void setReinexpe(Double reinexpe) {
        this.reinexpe = reinexpe;
    }

    public Double getOtherbizcost() {
        return otherbizcost;
    }

    public void setOtherbizcost(Double otherbizcost) {
        this.otherbizcost = otherbizcost;
    }

    public Double getBiztax() {
        return biztax;
    }

    public void setBiztax(Double biztax) {
        this.biztax = biztax;
    }

    public Double getSalesexpe() {
        return salesexpe;
    }

    public void setSalesexpe(Double salesexpe) {
        this.salesexpe = salesexpe;
    }

    public Double getManaexpe() {
        return manaexpe;
    }

    public void setManaexpe(Double manaexpe) {
        this.manaexpe = manaexpe;
    }

    public Double getFinexpe() {
        return finexpe;
    }

    public void setFinexpe(Double finexpe) {
        this.finexpe = finexpe;
    }

    public Double getAsseimpaloss() {
        return asseimpaloss;
    }

    public void setAsseimpaloss(Double asseimpaloss) {
        this.asseimpaloss = asseimpaloss;
    }

    public Double getBiztotcostitse() {
        return biztotcostitse;
    }

    public void setBiztotcostitse(Double biztotcostitse) {
        this.biztotcostitse = biztotcostitse;
    }

    public Double getBiztotcostform() {
        return biztotcostform;
    }

    public void setBiztotcostform(Double biztotcostform) {
        this.biztotcostform = biztotcostform;
    }

    public Double getValuechgloss() {
        return valuechgloss;
    }

    public void setValuechgloss(Double valuechgloss) {
        this.valuechgloss = valuechgloss;
    }

    public Double getInveinco() {
        return inveinco;
    }

    public void setInveinco(Double inveinco) {
        this.inveinco = inveinco;
    }

    public Double getAssoinveprof() {
        return assoinveprof;
    }

    public void setAssoinveprof(Double assoinveprof) {
        this.assoinveprof = assoinveprof;
    }

    public Double getExchggain() {
        return exchggain;
    }

    public void setExchggain(Double exchggain) {
        this.exchggain = exchggain;
    }

    public Double getFutuloss() {
        return futuloss;
    }

    public void setFutuloss(Double futuloss) {
        this.futuloss = futuloss;
    }

    public Double getCustinco() {
        return custinco;
    }

    public void setCustinco(Double custinco) {
        this.custinco = custinco;
    }

    public Double getSubsidyincome() {
        return subsidyincome;
    }

    public void setSubsidyincome(Double subsidyincome) {
        this.subsidyincome = subsidyincome;
    }

    public Double getOtherbizprof() {
        return otherbizprof;
    }

    public void setOtherbizprof(Double otherbizprof) {
        this.otherbizprof = otherbizprof;
    }

    public Double getBizprofitse() {
        return bizprofitse;
    }

    public void setBizprofitse(Double bizprofitse) {
        this.bizprofitse = bizprofitse;
    }

    public Double getOperprofform() {
        return operprofform;
    }

    public void setOperprofform(Double operprofform) {
        this.operprofform = operprofform;
    }

    public Double getPerprofit() {
        return perprofit;
    }

    public void setPerprofit(Double perprofit) {
        this.perprofit = perprofit;
    }

    public Double getNonoreve() {
        return nonoreve;
    }

    public void setNonoreve(Double nonoreve) {
        this.nonoreve = nonoreve;
    }

    public Double getNonoexpe() {
        return nonoexpe;
    }

    public void setNonoexpe(Double nonoexpe) {
        this.nonoexpe = nonoexpe;
    }

    public Double getNoncassetsdisl() {
        return noncassetsdisl;
    }

    public void setNoncassetsdisl(Double noncassetsdisl) {
        this.noncassetsdisl = noncassetsdisl;
    }

    public Double getProftotitse() {
        return proftotitse;
    }

    public void setProftotitse(Double proftotitse) {
        this.proftotitse = proftotitse;
    }

    public Double getProftotform() {
        return proftotform;
    }

    public void setProftotform(Double proftotform) {
        this.proftotform = proftotform;
    }

    public Double getTotprofit() {
        return totprofit;
    }

    public void setTotprofit(Double totprofit) {
        this.totprofit = totprofit;
    }

    public Double getIncotaxexpe() {
        return incotaxexpe;
    }

    public void setIncotaxexpe(Double incotaxexpe) {
        this.incotaxexpe = incotaxexpe;
    }

    public Double getUnreinveloss() {
        return unreinveloss;
    }

    public void setUnreinveloss(Double unreinveloss) {
        this.unreinveloss = unreinveloss;
    }

    public Double getNetpro1itse() {
        return netpro1itse;
    }

    public void setNetpro1itse(Double netpro1itse) {
        this.netpro1itse = netpro1itse;
    }

    public Double getNetpro1form() {
        return netpro1form;
    }

    public void setNetpro1form(Double netpro1form) {
        this.netpro1form = netpro1form;
    }

    public Double getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(Double netprofit) {
        this.netprofit = netprofit;
    }

    public Double getParenetp() {
        return parenetp;
    }

    public void setParenetp(Double parenetp) {
        this.parenetp = parenetp;
    }

    public Double getMergeformnetprof() {
        return mergeformnetprof;
    }

    public void setMergeformnetprof(Double mergeformnetprof) {
        this.mergeformnetprof = mergeformnetprof;
    }

    public Double getMinysharrigh() {
        return minysharrigh;
    }

    public void setMinysharrigh(Double minysharrigh) {
        this.minysharrigh = minysharrigh;
    }

    public Double getNetpro2itse() {
        return netpro2itse;
    }

    public void setNetpro2itse(Double netpro2itse) {
        this.netpro2itse = netpro2itse;
    }

    public Double getNetpro2form() {
        return netpro2form;
    }

    public void setNetpro2form(Double netpro2form) {
        this.netpro2form = netpro2form;
    }

    public Double getBasiceps() {
        return basiceps;
    }

    public void setBasiceps(Double basiceps) {
        this.basiceps = basiceps;
    }

    public Double getDilutedeps() {
        return dilutedeps;
    }

    public void setDilutedeps(Double dilutedeps) {
        this.dilutedeps = dilutedeps;
    }

    public Double getOthercompinco() {
        return othercompinco;
    }

    public void setOthercompinco(Double othercompinco) {
        this.othercompinco = othercompinco;
    }

    public Double getParecompinco() {
        return parecompinco;
    }

    public void setParecompinco(Double parecompinco) {
        this.parecompinco = parecompinco;
    }

    public Double getMinysharinco() {
        return minysharinco;
    }

    public void setMinysharinco(Double minysharinco) {
        this.minysharinco = minysharinco;
    }

    public Double getCompincoamt() {
        return compincoamt;
    }

    public void setCompincoamt(Double compincoamt) {
        this.compincoamt = compincoamt;
    }

    public Double getParecompincoamt() {
        return parecompincoamt;
    }

    public void setParecompincoamt(Double parecompincoamt) {
        this.parecompincoamt = parecompincoamt;
    }

    public Double getMinysharincoamt() {
        return minysharincoamt;
    }

    public void setMinysharincoamt(Double minysharincoamt) {
        this.minysharincoamt = minysharincoamt;
    }

    public Double getEarlyundiprof() {
        return earlyundiprof;
    }

    public void setEarlyundiprof(Double earlyundiprof) {
        this.earlyundiprof = earlyundiprof;
    }

    public Double getUndisprofredu() {
        return undisprofredu;
    }

    public void setUndisprofredu(Double undisprofredu) {
        this.undisprofredu = undisprofredu;
    }

    public Double getOtherinto() {
        return otherinto;
    }

    public void setOtherinto(Double otherinto) {
        this.otherinto = otherinto;
    }

    public Double getOtherdistprof() {
        return otherdistprof;
    }

    public void setOtherdistprof(Double otherdistprof) {
        this.otherdistprof = otherdistprof;
    }

    public Double getLegalsurp() {
        return legalsurp;
    }

    public void setLegalsurp(Double legalsurp) {
        this.legalsurp = legalsurp;
    }

    public Double getWelfare() {
        return welfare;
    }

    public void setWelfare(Double welfare) {
        this.welfare = welfare;
    }

    public Double getCapitalreserve() {
        return capitalreserve;
    }

    public void setCapitalreserve(Double capitalreserve) {
        this.capitalreserve = capitalreserve;
    }

    public Double getStaffaward() {
        return staffaward;
    }

    public void setStaffaward(Double staffaward) {
        this.staffaward = staffaward;
    }

    public Double getReservefund() {
        return reservefund;
    }

    public void setReservefund(Double reservefund) {
        this.reservefund = reservefund;
    }

    public Double getDevelopfund() {
        return developfund;
    }

    public void setDevelopfund(Double developfund) {
        this.developfund = developfund;
    }

    public Double getProfreturninvest() {
        return profreturninvest;
    }

    public void setProfreturninvest(Double profreturninvest) {
        this.profreturninvest = profreturninvest;
    }

    public Double getSupplycurcap() {
        return supplycurcap;
    }

    public void setSupplycurcap(Double supplycurcap) {
        this.supplycurcap = supplycurcap;
    }

    public Double getAvaidistshareprof() {
        return avaidistshareprof;
    }

    public void setAvaidistshareprof(Double avaidistshareprof) {
        this.avaidistshareprof = avaidistshareprof;
    }

    public Double getPreferredskdiv() {
        return preferredskdiv;
    }

    public void setPreferredskdiv(Double preferredskdiv) {
        this.preferredskdiv = preferredskdiv;
    }

    public Double getFreesurplu() {
        return freesurplu;
    }

    public void setFreesurplu(Double freesurplu) {
        this.freesurplu = freesurplu;
    }

    public Double getDealwithdivi() {
        return dealwithdivi;
    }

    public void setDealwithdivi(Double dealwithdivi) {
        this.dealwithdivi = dealwithdivi;
    }

    public Double getCapitalizeddivi() {
        return capitalizeddivi;
    }

    public void setCapitalizeddivi(Double capitalizeddivi) {
        this.capitalizeddivi = capitalizeddivi;
    }

    public Double getUndisprofit() {
        return undisprofit;
    }

    public void setUndisprofit(Double undisprofit) {
        this.undisprofit = undisprofit;
    }

    public Double getSelldepartgain() {
        return selldepartgain;
    }

    public void setSelldepartgain(Double selldepartgain) {
        this.selldepartgain = selldepartgain;
    }

    public Double getNatudisasterloss() {
        return natudisasterloss;
    }

    public void setNatudisasterloss(Double natudisasterloss) {
        this.natudisasterloss = natudisasterloss;
    }

    public Double getAccpolicychg() {
        return accpolicychg;
    }

    public void setAccpolicychg(Double accpolicychg) {
        this.accpolicychg = accpolicychg;
    }

    public Double getAccestimatechg() {
        return accestimatechg;
    }

    public void setAccestimatechg(Double accestimatechg) {
        this.accestimatechg = accestimatechg;
    }

    public Double getDebtrestruloss() {
        return debtrestruloss;
    }

    public void setDebtrestruloss(Double debtrestruloss) {
        this.debtrestruloss = debtrestruloss;
    }

    public Double getOthersupply() {
        return othersupply;
    }

    public void setOthersupply(Double othersupply) {
        this.othersupply = othersupply;
    }
}