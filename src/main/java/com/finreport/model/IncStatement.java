package com.finreport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IncStatement {
	private float compcode;
	private float publishdate;
	private float begindate;
	private float enddate;
	private float reporttype;
	private float adjustdate;
	private float accstacode;
	private String accstaname;
	private float biztotinco;
	private float bizinco;
	private float inteinco;
	private float earnprem;
	private float pouninco;
	private float realsale;
	private float otherbizinco;
	private float biztotincoitse;
	private float biztotincoform;
	private float biztotcost;
	private float bizcost;
	private float inteexpe;
	private float pounexpe;
	private float realsalecost;
	private float deveexpe;
	private float surrgold;
	private float compnetexpe;
	private float contress;
	private float polidiviexpe;
	private float reinexpe;
	private float otherbizcost;
	private float biztax;
	private float salesexpe;
	private float manaexpe;
	private float finexpe;
	private float asseimpaloss;
	private float biztotcostitse;
	private float biztotcostform;
	private float valuechgloss;
	private float inveinco;
	private float assoinveprof;
	private float exchggain;
	private float futuloss;
	private float custinco;
	private float subsidyincome;
	private float otherbizprof;
	private float bizprofitse;
	private float operprofform;
	private float perprofit;
	private float nonoreve;
	private float nonoexpe;
	private float noncassetsdisl;
	private float proftotitse;
	private float proftotform;
	private float totprofit;
	private float incotaxexpe;
	private float unreinveloss;
	private float netpro1itse;
	private float netpro1form;
	private float netprofit;
	private float parenetp;
	private float mergeformnetprof;
	private float minysharrigh;
	private float netpro2itse;
	private float netpro2form;
	private float basiceps;
	private float dilutedeps;
	private float othercompinco;
	private float parecompinco;
	private float minysharinco;
	private float compincoamt;
	private float parecompincoamt;
	private float minysharincoamt;
	private float earlyundiprof;
	private float undisprofredu;
	private float otherinto;
	private float otherdistprof;
	private float legalsurp;
	private float welfare;
	private float capitalreserve;
	private float staffaward;
	private float reservefund;
	private float developfund;
	private float profreturninvest;
	private float supplycurcap;
	private float avaidistshareprof;
	private float preferredskdiv;
	private float freesurplu;
	private float dealwithdivi;
	private float capitalizeddivi;
	private float undisprofit;
	private float selldepartgain;
	private float natudisasterloss;
	private float accpolicychg;
	private float accestimatechg;
	private float debtrestruloss;
	private float othersupply;
	public float getCompcode() {
		return compcode;
	}
	public void setCompcode(float compcode) {
		this.compcode = compcode;
	}
	public float getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(float publishdate) {
		this.publishdate = publishdate;
	}
	public float getBegindate() {
		return begindate;
	}
	public void setBegindate(float begindate) {
		this.begindate = begindate;
	}
	public float getEnddate() {
		return enddate;
	}
	public void setEnddate(float enddate) {
		this.enddate = enddate;
	}
	public float getReporttype() {
		return reporttype;
	}
	public void setReporttype(float reporttype) {
		this.reporttype = reporttype;
	}
	public float getAdjustdate() {
		return adjustdate;
	}
	public void setAdjustdate(float adjustdate) {
		this.adjustdate = adjustdate;
	}
	public float getAccstacode() {
		return accstacode;
	}
	public void setAccstacode(float accstacode) {
		this.accstacode = accstacode;
	}
	public String getAccstaname() {
		return accstaname;
	}
	public void setAccstaname(String accstaname) {
		this.accstaname = accstaname;
	}
	public float getBiztotinco() {
		return biztotinco;
	}
	public void setBiztotinco(float biztotinco) {
		this.biztotinco = biztotinco;
	}
	public float getBizinco() {
		return bizinco;
	}
	public void setBizinco(float bizinco) {
		this.bizinco = bizinco;
	}
	public float getInteinco() {
		return inteinco;
	}
	public void setInteinco(float inteinco) {
		this.inteinco = inteinco;
	}
	public float getEarnprem() {
		return earnprem;
	}
	public void setEarnprem(float earnprem) {
		this.earnprem = earnprem;
	}
	public float getPouninco() {
		return pouninco;
	}
	public void setPouninco(float pouninco) {
		this.pouninco = pouninco;
	}
	public float getRealsale() {
		return realsale;
	}
	public void setRealsale(float realsale) {
		this.realsale = realsale;
	}
	public float getOtherbizinco() {
		return otherbizinco;
	}
	public void setOtherbizinco(float otherbizinco) {
		this.otherbizinco = otherbizinco;
	}
	public float getBiztotincoitse() {
		return biztotincoitse;
	}
	public void setBiztotincoitse(float biztotincoitse) {
		this.biztotincoitse = biztotincoitse;
	}
	public float getBiztotincoform() {
		return biztotincoform;
	}
	public void setBiztotincoform(float biztotincoform) {
		this.biztotincoform = biztotincoform;
	}
	public float getBiztotcost() {
		return biztotcost;
	}
	public void setBiztotcost(float biztotcost) {
		this.biztotcost = biztotcost;
	}
	public float getBizcost() {
		return bizcost;
	}
	public void setBizcost(float bizcost) {
		this.bizcost = bizcost;
	}
	public float getInteexpe() {
		return inteexpe;
	}
	public void setInteexpe(float inteexpe) {
		this.inteexpe = inteexpe;
	}
	public float getPounexpe() {
		return pounexpe;
	}
	public void setPounexpe(float pounexpe) {
		this.pounexpe = pounexpe;
	}
	public float getRealsalecost() {
		return realsalecost;
	}
	public void setRealsalecost(float realsalecost) {
		this.realsalecost = realsalecost;
	}
	public float getDeveexpe() {
		return deveexpe;
	}
	public void setDeveexpe(float deveexpe) {
		this.deveexpe = deveexpe;
	}
	public float getSurrgold() {
		return surrgold;
	}
	public void setSurrgold(float surrgold) {
		this.surrgold = surrgold;
	}
	public float getCompnetexpe() {
		return compnetexpe;
	}
	public void setCompnetexpe(float compnetexpe) {
		this.compnetexpe = compnetexpe;
	}
	public float getContress() {
		return contress;
	}
	public void setContress(float contress) {
		this.contress = contress;
	}
	public float getPolidiviexpe() {
		return polidiviexpe;
	}
	public void setPolidiviexpe(float polidiviexpe) {
		this.polidiviexpe = polidiviexpe;
	}
	public float getReinexpe() {
		return reinexpe;
	}
	public void setReinexpe(float reinexpe) {
		this.reinexpe = reinexpe;
	}
	public float getOtherbizcost() {
		return otherbizcost;
	}
	public void setOtherbizcost(float otherbizcost) {
		this.otherbizcost = otherbizcost;
	}
	public float getBiztax() {
		return biztax;
	}
	public void setBiztax(float biztax) {
		this.biztax = biztax;
	}
	public float getSalesexpe() {
		return salesexpe;
	}
	public void setSalesexpe(float salesexpe) {
		this.salesexpe = salesexpe;
	}
	public float getManaexpe() {
		return manaexpe;
	}
	public void setManaexpe(float manaexpe) {
		this.manaexpe = manaexpe;
	}
	public float getFinexpe() {
		return finexpe;
	}
	public void setFinexpe(float finexpe) {
		this.finexpe = finexpe;
	}
	public float getAsseimpaloss() {
		return asseimpaloss;
	}
	public void setAsseimpaloss(float asseimpaloss) {
		this.asseimpaloss = asseimpaloss;
	}
	public float getBiztotcostitse() {
		return biztotcostitse;
	}
	public void setBiztotcostitse(float biztotcostitse) {
		this.biztotcostitse = biztotcostitse;
	}
	public float getBiztotcostform() {
		return biztotcostform;
	}
	public void setBiztotcostform(float biztotcostform) {
		this.biztotcostform = biztotcostform;
	}
	public float getValuechgloss() {
		return valuechgloss;
	}
	public void setValuechgloss(float valuechgloss) {
		this.valuechgloss = valuechgloss;
	}
	public float getInveinco() {
		return inveinco;
	}
	public void setInveinco(float inveinco) {
		this.inveinco = inveinco;
	}
	public float getAssoinveprof() {
		return assoinveprof;
	}
	public void setAssoinveprof(float assoinveprof) {
		this.assoinveprof = assoinveprof;
	}
	public float getExchggain() {
		return exchggain;
	}
	public void setExchggain(float exchggain) {
		this.exchggain = exchggain;
	}
	public float getFutuloss() {
		return futuloss;
	}
	public void setFutuloss(float futuloss) {
		this.futuloss = futuloss;
	}
	public float getCustinco() {
		return custinco;
	}
	public void setCustinco(float custinco) {
		this.custinco = custinco;
	}
	public float getSubsidyincome() {
		return subsidyincome;
	}
	public void setSubsidyincome(float subsidyincome) {
		this.subsidyincome = subsidyincome;
	}
	public float getOtherbizprof() {
		return otherbizprof;
	}
	public void setOtherbizprof(float otherbizprof) {
		this.otherbizprof = otherbizprof;
	}
	public float getBizprofitse() {
		return bizprofitse;
	}
	public void setBizprofitse(float bizprofitse) {
		this.bizprofitse = bizprofitse;
	}
	public float getOperprofform() {
		return operprofform;
	}
	public void setOperprofform(float operprofform) {
		this.operprofform = operprofform;
	}
	public float getPerprofit() {
		return perprofit;
	}
	public void setPerprofit(float perprofit) {
		this.perprofit = perprofit;
	}
	public float getNonoreve() {
		return nonoreve;
	}
	public void setNonoreve(float nonoreve) {
		this.nonoreve = nonoreve;
	}
	public float getNonoexpe() {
		return nonoexpe;
	}
	public void setNonoexpe(float nonoexpe) {
		this.nonoexpe = nonoexpe;
	}
	public float getNoncassetsdisl() {
		return noncassetsdisl;
	}
	public void setNoncassetsdisl(float noncassetsdisl) {
		this.noncassetsdisl = noncassetsdisl;
	}
	public float getProftotitse() {
		return proftotitse;
	}
	public void setProftotitse(float proftotitse) {
		this.proftotitse = proftotitse;
	}
	public float getProftotform() {
		return proftotform;
	}
	public void setProftotform(float proftotform) {
		this.proftotform = proftotform;
	}
	public float getTotprofit() {
		return totprofit;
	}
	public void setTotprofit(float totprofit) {
		this.totprofit = totprofit;
	}
	public float getIncotaxexpe() {
		return incotaxexpe;
	}
	public void setIncotaxexpe(float incotaxexpe) {
		this.incotaxexpe = incotaxexpe;
	}
	public float getUnreinveloss() {
		return unreinveloss;
	}
	public void setUnreinveloss(float unreinveloss) {
		this.unreinveloss = unreinveloss;
	}
	public float getNetpro1itse() {
		return netpro1itse;
	}
	public void setNetpro1itse(float netpro1itse) {
		this.netpro1itse = netpro1itse;
	}
	public float getNetpro1form() {
		return netpro1form;
	}
	public void setNetpro1form(float netpro1form) {
		this.netpro1form = netpro1form;
	}
	public float getNetprofit() {
		return netprofit;
	}
	public void setNetprofit(float netprofit) {
		this.netprofit = netprofit;
	}
	public float getParenetp() {
		return parenetp;
	}
	public void setParenetp(float parenetp) {
		this.parenetp = parenetp;
	}
	public float getMergeformnetprof() {
		return mergeformnetprof;
	}
	public void setMergeformnetprof(float mergeformnetprof) {
		this.mergeformnetprof = mergeformnetprof;
	}
	public float getMinysharrigh() {
		return minysharrigh;
	}
	public void setMinysharrigh(float minysharrigh) {
		this.minysharrigh = minysharrigh;
	}
	public float getNetpro2itse() {
		return netpro2itse;
	}
	public void setNetpro2itse(float netpro2itse) {
		this.netpro2itse = netpro2itse;
	}
	public float getNetpro2form() {
		return netpro2form;
	}
	public void setNetpro2form(float netpro2form) {
		this.netpro2form = netpro2form;
	}
	public float getBasiceps() {
		return basiceps;
	}
	public void setBasiceps(float basiceps) {
		this.basiceps = basiceps;
	}
	public float getDilutedeps() {
		return dilutedeps;
	}
	public void setDilutedeps(float dilutedeps) {
		this.dilutedeps = dilutedeps;
	}
	public float getOthercompinco() {
		return othercompinco;
	}
	public void setOthercompinco(float othercompinco) {
		this.othercompinco = othercompinco;
	}
	public float getParecompinco() {
		return parecompinco;
	}
	public void setParecompinco(float parecompinco) {
		this.parecompinco = parecompinco;
	}
	public float getMinysharinco() {
		return minysharinco;
	}
	public void setMinysharinco(float minysharinco) {
		this.minysharinco = minysharinco;
	}
	public float getCompincoamt() {
		return compincoamt;
	}
	public void setCompincoamt(float compincoamt) {
		this.compincoamt = compincoamt;
	}
	public float getParecompincoamt() {
		return parecompincoamt;
	}
	public void setParecompincoamt(float parecompincoamt) {
		this.parecompincoamt = parecompincoamt;
	}
	public float getMinysharincoamt() {
		return minysharincoamt;
	}
	public void setMinysharincoamt(float minysharincoamt) {
		this.minysharincoamt = minysharincoamt;
	}
	public float getEarlyundiprof() {
		return earlyundiprof;
	}
	public void setEarlyundiprof(float earlyundiprof) {
		this.earlyundiprof = earlyundiprof;
	}
	public float getUndisprofredu() {
		return undisprofredu;
	}
	public void setUndisprofredu(float undisprofredu) {
		this.undisprofredu = undisprofredu;
	}
	public float getOtherinto() {
		return otherinto;
	}
	public void setOtherinto(float otherinto) {
		this.otherinto = otherinto;
	}
	public float getOtherdistprof() {
		return otherdistprof;
	}
	public void setOtherdistprof(float otherdistprof) {
		this.otherdistprof = otherdistprof;
	}
	public float getLegalsurp() {
		return legalsurp;
	}
	public void setLegalsurp(float legalsurp) {
		this.legalsurp = legalsurp;
	}
	public float getWelfare() {
		return welfare;
	}
	public void setWelfare(float welfare) {
		this.welfare = welfare;
	}
	public float getCapitalreserve() {
		return capitalreserve;
	}
	public void setCapitalreserve(float capitalreserve) {
		this.capitalreserve = capitalreserve;
	}
	public float getStaffaward() {
		return staffaward;
	}
	public void setStaffaward(float staffaward) {
		this.staffaward = staffaward;
	}
	public float getReservefund() {
		return reservefund;
	}
	public void setReservefund(float reservefund) {
		this.reservefund = reservefund;
	}
	public float getDevelopfund() {
		return developfund;
	}
	public void setDevelopfund(float developfund) {
		this.developfund = developfund;
	}
	public float getProfreturninvest() {
		return profreturninvest;
	}
	public void setProfreturninvest(float profreturninvest) {
		this.profreturninvest = profreturninvest;
	}
	public float getSupplycurcap() {
		return supplycurcap;
	}
	public void setSupplycurcap(float supplycurcap) {
		this.supplycurcap = supplycurcap;
	}
	public float getAvaidistshareprof() {
		return avaidistshareprof;
	}
	public void setAvaidistshareprof(float avaidistshareprof) {
		this.avaidistshareprof = avaidistshareprof;
	}
	public float getPreferredskdiv() {
		return preferredskdiv;
	}
	public void setPreferredskdiv(float preferredskdiv) {
		this.preferredskdiv = preferredskdiv;
	}
	public float getFreesurplu() {
		return freesurplu;
	}
	public void setFreesurplu(float freesurplu) {
		this.freesurplu = freesurplu;
	}
	public float getDealwithdivi() {
		return dealwithdivi;
	}
	public void setDealwithdivi(float dealwithdivi) {
		this.dealwithdivi = dealwithdivi;
	}
	public float getCapitalizeddivi() {
		return capitalizeddivi;
	}
	public void setCapitalizeddivi(float capitalizeddivi) {
		this.capitalizeddivi = capitalizeddivi;
	}
	public float getUndisprofit() {
		return undisprofit;
	}
	public void setUndisprofit(float undisprofit) {
		this.undisprofit = undisprofit;
	}
	public float getSelldepartgain() {
		return selldepartgain;
	}
	public void setSelldepartgain(float selldepartgain) {
		this.selldepartgain = selldepartgain;
	}
	public float getNatudisasterloss() {
		return natudisasterloss;
	}
	public void setNatudisasterloss(float natudisasterloss) {
		this.natudisasterloss = natudisasterloss;
	}
	public float getAccpolicychg() {
		return accpolicychg;
	}
	public void setAccpolicychg(float accpolicychg) {
		this.accpolicychg = accpolicychg;
	}
	public float getAccestimatechg() {
		return accestimatechg;
	}
	public void setAccestimatechg(float accestimatechg) {
		this.accestimatechg = accestimatechg;
	}
	public float getDebtrestruloss() {
		return debtrestruloss;
	}
	public void setDebtrestruloss(float debtrestruloss) {
		this.debtrestruloss = debtrestruloss;
	}
	public float getOthersupply() {
		return othersupply;
	}
	public void setOthersupply(float othersupply) {
		this.othersupply = othersupply;
	}
	
	@Override
	public String toString() {
		return "IncStatement [compcode=" + compcode + ", publishdate=" + publishdate + ", begindate=" + begindate + ", enddate=" + enddate + ", reporttype=" + reporttype + ", adjustdate="
				+ adjustdate + ", accstacode=" + accstacode + ", accstaname=" + accstaname + ", biztotinco=" + biztotinco + ", bizinco=" + bizinco + ", inteinco=" + inteinco + ", earnprem="
				+ earnprem + ", pouninco=" + pouninco + ", realsale=" + realsale + ", otherbizinco=" + otherbizinco + ", biztotincoitse=" + biztotincoitse + ", biztotincoform=" + biztotincoform
				+ ", biztotcost=" + biztotcost + ", bizcost=" + bizcost + ", inteexpe=" + inteexpe + ", pounexpe=" + pounexpe + ", realsalecost=" + realsalecost + ", deveexpe=" + deveexpe
				+ ", surrgold=" + surrgold + ", compnetexpe=" + compnetexpe + ", contress=" + contress + ", polidiviexpe=" + polidiviexpe + ", reinexpe=" + reinexpe + ", otherbizcost=" + otherbizcost
				+ ", biztax=" + biztax + ", salesexpe=" + salesexpe + ", manaexpe=" + manaexpe + ", finexpe=" + finexpe + ", asseimpaloss=" + asseimpaloss + ", biztotcostitse=" + biztotcostitse
				+ ", biztotcostform=" + biztotcostform + ", valuechgloss=" + valuechgloss + ", inveinco=" + inveinco + ", assoinveprof=" + assoinveprof + ", exchggain=" + exchggain + ", futuloss="
				+ futuloss + ", custinco=" + custinco + ", subsidyincome=" + subsidyincome + ", otherbizprof=" + otherbizprof + ", bizprofitse=" + bizprofitse + ", operprofform=" + operprofform
				+ ", perprofit=" + perprofit + ", nonoreve=" + nonoreve + ", nonoexpe=" + nonoexpe + ", noncassetsdisl=" + noncassetsdisl + ", proftotitse=" + proftotitse + ", proftotform="
				+ proftotform + ", totprofit=" + totprofit + ", incotaxexpe=" + incotaxexpe + ", unreinveloss=" + unreinveloss + ", netpro1itse=" + netpro1itse + ", netpro1form=" + netpro1form
				+ ", netprofit=" + netprofit + ", parenetp=" + parenetp + ", mergeformnetprof=" + mergeformnetprof + ", minysharrigh=" + minysharrigh + ", netpro2itse=" + netpro2itse
				+ ", netpro2form=" + netpro2form + ", basiceps=" + basiceps + ", dilutedeps=" + dilutedeps + ", othercompinco=" + othercompinco + ", parecompinco=" + parecompinco + ", minysharinco="
				+ minysharinco + ", compincoamt=" + compincoamt + ", parecompincoamt=" + parecompincoamt + ", minysharincoamt=" + minysharincoamt + ", earlyundiprof=" + earlyundiprof
				+ ", undisprofredu=" + undisprofredu + ", otherinto=" + otherinto + ", otherdistprof=" + otherdistprof + ", legalsurp=" + legalsurp + ", welfare=" + welfare + ", capitalreserve="
				+ capitalreserve + ", staffaward=" + staffaward + ", reservefund=" + reservefund + ", developfund=" + developfund + ", profreturninvest=" + profreturninvest + ", supplycurcap="
				+ supplycurcap + ", avaidistshareprof=" + avaidistshareprof + ", preferredskdiv=" + preferredskdiv + ", freesurplu=" + freesurplu + ", dealwithdivi=" + dealwithdivi
				+ ", capitalizeddivi=" + capitalizeddivi + ", undisprofit=" + undisprofit + ", selldepartgain=" + selldepartgain + ", natudisasterloss=" + natudisasterloss + ", accpolicychg="
				+ accpolicychg + ", accestimatechg=" + accestimatechg + ", debtrestruloss=" + debtrestruloss + ", othersupply=" + othersupply + "]";
	}
}
