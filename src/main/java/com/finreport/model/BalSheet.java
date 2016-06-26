package com.finreport.model;

public class BalSheet {
    private String stockcode;

    private Integer compcode;

    private Integer publishdate;

    private Integer reportdate;

    private Integer reporttype;

    private String quarter;

    private Integer adjustdate;

    private Integer accstacode;

    private String accstaname;

    private Double curfds;

    private Double tradfinasset;

    private Double notesrece;

    private Double accorece;

    private Double prep;

    private Double premrece;

    private Double interece;

    private Double dividrece;

    private Double otherrece;

    private Double expotaxrebarece;

    private Double subsrece;

    private Double margrece;

    private Double intelrece;

    private Double inve;

    private Double prepexpe;

    private Double unseg;

    private Double expinoncurrasset;

    private Double othercurrasse;

    private Double currassetitse;

    private Double currasseform;

    private Double totcurrasset;

    private Double lendandloan;

    private Double avaisellasse;

    private Double holdinvedue;

    private Double longrece;

    private Double equiinve;

    private Double otherlonginve;

    private Double inveprop;

    private Double fixedasseimmo;

    private Double accudepr;

    private Double fixedassenetw;

    private Double fixedasseimpa;

    private Double fixedassenet;

    private Double consprog;

    private Double engimate;

    private Double fixedasseclea;

    private Double prodasse;

    private Double comasse;

    private Double hydrasset;

    private Double intaasset;

    private Double deveexpe;

    private Double goodwill;

    private Double logprepexpe;

    private Double tradshartrad;

    private Double defetaxasset;

    private Double othernoncasse;

    private Double noncasseitse;

    private Double noncasseform;

    private Double totalnoncassets;

    private Double totassetitse;

    private Double totalasseform;

    private Double totasset;

    private Double shorttermborr;

    private Double tradfinliab;

    private Double notespaya;

    private Double accopaya;

    private Double advapaym;

    private Double copeworkersal;

    private Double taxespaya;

    private Double intepaya;

    private Double divipaya;

    private Double otherfeepaya;

    private Double margrequ;

    private Double intelpay;

    private Double otherpay;

    private Double accrexpe;

    private Double expecurrliab;

    private Double copewithreinrece;

    private Double inteticksett;

    private Double dometicksett;

    private Double defereve;

    private Double shorttermbdspaya;

    private Double duenoncliab;

    private Double othercurreliabi;

    private Double currliabitse;

    private Double currliabform;

    private Double totalcurrliab;

    private Double longborr;

    private Double bdspaya;

    private Double longpaya;

    private Double specpaya;

    private Double expenoncliab;

    private Double longdefeinco;

    private Double defeincotaxliab;

    private Double othernoncliabi;

    private Double longliabitse;

    private Double longliabform;

    private Double totalnoncliab;

    private Double totliabitse;

    private Double totliabform;

    private Double totliab;

    private Double paidincapi;

    private Double capisurp;

    private Double treastk;

    private Double specrese;

    private Double rese;

    private Double generiskrese;

    private Double unreinveloss;

    private Double undiprof;

    private Double topaycashdivi;

    private Double curtrandiff;

    private Double sharrighitse;

    private Double sharrightform;

    private Double paresharrigh;

    private Double minysharrigh;

    private Double righaggritse;

    private Double rightaggrform;

    private Double righaggr;

    private Double rightotitse;

    private Double rightotform;

    private Double totliabsharequi;

    private Double settresedepo;

    private Double plac;

    private Double derifinaasset;

    private Double reinrece;

    private Double reincontrese;

    private Double purcresaasset;

    private Double cenbankborr;

    private Double deposit;

    private Double fdsborr;

    private Double deriliab;

    private Double sellrepasse;

    private Double copepoun;

    private Double insucontrese;

    private Double actitradsecu;

    private Double actiundesecu;

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

    public Integer getReportdate() {
        return reportdate;
    }

    public void setReportdate(Integer reportdate) {
        this.reportdate = reportdate;
    }

    public Integer getReporttype() {
        return reporttype;
    }

    public void setReporttype(Integer reporttype) {
        this.reporttype = reporttype;
    }

    public String getQuarter() {
        return reportdate.toString().substring(4, 6);
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

    public Double getCurfds() {
        return curfds;
    }

    public void setCurfds(Double curfds) {
        this.curfds = curfds;
    }

    public Double getTradfinasset() {
        return tradfinasset;
    }

    public void setTradfinasset(Double tradfinasset) {
        this.tradfinasset = tradfinasset;
    }

    public Double getNotesrece() {
        return notesrece;
    }

    public void setNotesrece(Double notesrece) {
        this.notesrece = notesrece;
    }

    public Double getAccorece() {
        return accorece;
    }

    public void setAccorece(Double accorece) {
        this.accorece = accorece;
    }

    public Double getPrep() {
        return prep;
    }

    public void setPrep(Double prep) {
        this.prep = prep;
    }

    public Double getPremrece() {
        return premrece;
    }

    public void setPremrece(Double premrece) {
        this.premrece = premrece;
    }

    public Double getInterece() {
        return interece;
    }

    public void setInterece(Double interece) {
        this.interece = interece;
    }

    public Double getDividrece() {
        return dividrece;
    }

    public void setDividrece(Double dividrece) {
        this.dividrece = dividrece;
    }

    public Double getOtherrece() {
        return otherrece;
    }

    public void setOtherrece(Double otherrece) {
        this.otherrece = otherrece;
    }

    public Double getExpotaxrebarece() {
        return expotaxrebarece;
    }

    public void setExpotaxrebarece(Double expotaxrebarece) {
        this.expotaxrebarece = expotaxrebarece;
    }

    public Double getSubsrece() {
        return subsrece;
    }

    public void setSubsrece(Double subsrece) {
        this.subsrece = subsrece;
    }

    public Double getMargrece() {
        return margrece;
    }

    public void setMargrece(Double margrece) {
        this.margrece = margrece;
    }

    public Double getIntelrece() {
        return intelrece;
    }

    public void setIntelrece(Double intelrece) {
        this.intelrece = intelrece;
    }

    public Double getInve() {
        return inve;
    }

    public void setInve(Double inve) {
        this.inve = inve;
    }

    public Double getPrepexpe() {
        return prepexpe;
    }

    public void setPrepexpe(Double prepexpe) {
        this.prepexpe = prepexpe;
    }

    public Double getUnseg() {
        return unseg;
    }

    public void setUnseg(Double unseg) {
        this.unseg = unseg;
    }

    public Double getExpinoncurrasset() {
        return expinoncurrasset;
    }

    public void setExpinoncurrasset(Double expinoncurrasset) {
        this.expinoncurrasset = expinoncurrasset;
    }

    public Double getOthercurrasse() {
        return othercurrasse;
    }

    public void setOthercurrasse(Double othercurrasse) {
        this.othercurrasse = othercurrasse;
    }

    public Double getCurrassetitse() {
        return currassetitse;
    }

    public void setCurrassetitse(Double currassetitse) {
        this.currassetitse = currassetitse;
    }

    public Double getCurrasseform() {
        return currasseform;
    }

    public void setCurrasseform(Double currasseform) {
        this.currasseform = currasseform;
    }

    public Double getTotcurrasset() {
        return totcurrasset;
    }

    public void setTotcurrasset(Double totcurrasset) {
        this.totcurrasset = totcurrasset;
    }

    public Double getLendandloan() {
        return lendandloan;
    }

    public void setLendandloan(Double lendandloan) {
        this.lendandloan = lendandloan;
    }

    public Double getAvaisellasse() {
        return avaisellasse;
    }

    public void setAvaisellasse(Double avaisellasse) {
        this.avaisellasse = avaisellasse;
    }

    public Double getHoldinvedue() {
        return holdinvedue;
    }

    public void setHoldinvedue(Double holdinvedue) {
        this.holdinvedue = holdinvedue;
    }

    public Double getLongrece() {
        return longrece;
    }

    public void setLongrece(Double longrece) {
        this.longrece = longrece;
    }

    public Double getEquiinve() {
        return equiinve;
    }

    public void setEquiinve(Double equiinve) {
        this.equiinve = equiinve;
    }

    public Double getOtherlonginve() {
        return otherlonginve;
    }

    public void setOtherlonginve(Double otherlonginve) {
        this.otherlonginve = otherlonginve;
    }

    public Double getInveprop() {
        return inveprop;
    }

    public void setInveprop(Double inveprop) {
        this.inveprop = inveprop;
    }

    public Double getFixedasseimmo() {
        return fixedasseimmo;
    }

    public void setFixedasseimmo(Double fixedasseimmo) {
        this.fixedasseimmo = fixedasseimmo;
    }

    public Double getAccudepr() {
        return accudepr;
    }

    public void setAccudepr(Double accudepr) {
        this.accudepr = accudepr;
    }

    public Double getFixedassenetw() {
        return fixedassenetw;
    }

    public void setFixedassenetw(Double fixedassenetw) {
        this.fixedassenetw = fixedassenetw;
    }

    public Double getFixedasseimpa() {
        return fixedasseimpa;
    }

    public void setFixedasseimpa(Double fixedasseimpa) {
        this.fixedasseimpa = fixedasseimpa;
    }

    public Double getFixedassenet() {
        return fixedassenet;
    }

    public void setFixedassenet(Double fixedassenet) {
        this.fixedassenet = fixedassenet;
    }

    public Double getConsprog() {
        return consprog;
    }

    public void setConsprog(Double consprog) {
        this.consprog = consprog;
    }

    public Double getEngimate() {
        return engimate;
    }

    public void setEngimate(Double engimate) {
        this.engimate = engimate;
    }

    public Double getFixedasseclea() {
        return fixedasseclea;
    }

    public void setFixedasseclea(Double fixedasseclea) {
        this.fixedasseclea = fixedasseclea;
    }

    public Double getProdasse() {
        return prodasse;
    }

    public void setProdasse(Double prodasse) {
        this.prodasse = prodasse;
    }

    public Double getComasse() {
        return comasse;
    }

    public void setComasse(Double comasse) {
        this.comasse = comasse;
    }

    public Double getHydrasset() {
        return hydrasset;
    }

    public void setHydrasset(Double hydrasset) {
        this.hydrasset = hydrasset;
    }

    public Double getIntaasset() {
        return intaasset;
    }

    public void setIntaasset(Double intaasset) {
        this.intaasset = intaasset;
    }

    public Double getDeveexpe() {
        return deveexpe;
    }

    public void setDeveexpe(Double deveexpe) {
        this.deveexpe = deveexpe;
    }

    public Double getGoodwill() {
        return goodwill;
    }

    public void setGoodwill(Double goodwill) {
        this.goodwill = goodwill;
    }

    public Double getLogprepexpe() {
        return logprepexpe;
    }

    public void setLogprepexpe(Double logprepexpe) {
        this.logprepexpe = logprepexpe;
    }

    public Double getTradshartrad() {
        return tradshartrad;
    }

    public void setTradshartrad(Double tradshartrad) {
        this.tradshartrad = tradshartrad;
    }

    public Double getDefetaxasset() {
        return defetaxasset;
    }

    public void setDefetaxasset(Double defetaxasset) {
        this.defetaxasset = defetaxasset;
    }

    public Double getOthernoncasse() {
        return othernoncasse;
    }

    public void setOthernoncasse(Double othernoncasse) {
        this.othernoncasse = othernoncasse;
    }

    public Double getNoncasseitse() {
        return noncasseitse;
    }

    public void setNoncasseitse(Double noncasseitse) {
        this.noncasseitse = noncasseitse;
    }

    public Double getNoncasseform() {
        return noncasseform;
    }

    public void setNoncasseform(Double noncasseform) {
        this.noncasseform = noncasseform;
    }

    public Double getTotalnoncassets() {
        return totalnoncassets;
    }

    public void setTotalnoncassets(Double totalnoncassets) {
        this.totalnoncassets = totalnoncassets;
    }

    public Double getTotassetitse() {
        return totassetitse;
    }

    public void setTotassetitse(Double totassetitse) {
        this.totassetitse = totassetitse;
    }

    public Double getTotalasseform() {
        return totalasseform;
    }

    public void setTotalasseform(Double totalasseform) {
        this.totalasseform = totalasseform;
    }

    public Double getTotasset() {
        return totasset;
    }

    public void setTotasset(Double totasset) {
        this.totasset = totasset;
    }

    public Double getShorttermborr() {
        return shorttermborr;
    }

    public void setShorttermborr(Double shorttermborr) {
        this.shorttermborr = shorttermborr;
    }

    public Double getTradfinliab() {
        return tradfinliab;
    }

    public void setTradfinliab(Double tradfinliab) {
        this.tradfinliab = tradfinliab;
    }

    public Double getNotespaya() {
        return notespaya;
    }

    public void setNotespaya(Double notespaya) {
        this.notespaya = notespaya;
    }

    public Double getAccopaya() {
        return accopaya;
    }

    public void setAccopaya(Double accopaya) {
        this.accopaya = accopaya;
    }

    public Double getAdvapaym() {
        return advapaym;
    }

    public void setAdvapaym(Double advapaym) {
        this.advapaym = advapaym;
    }

    public Double getCopeworkersal() {
        return copeworkersal;
    }

    public void setCopeworkersal(Double copeworkersal) {
        this.copeworkersal = copeworkersal;
    }

    public Double getTaxespaya() {
        return taxespaya;
    }

    public void setTaxespaya(Double taxespaya) {
        this.taxespaya = taxespaya;
    }

    public Double getIntepaya() {
        return intepaya;
    }

    public void setIntepaya(Double intepaya) {
        this.intepaya = intepaya;
    }

    public Double getDivipaya() {
        return divipaya;
    }

    public void setDivipaya(Double divipaya) {
        this.divipaya = divipaya;
    }

    public Double getOtherfeepaya() {
        return otherfeepaya;
    }

    public void setOtherfeepaya(Double otherfeepaya) {
        this.otherfeepaya = otherfeepaya;
    }

    public Double getMargrequ() {
        return margrequ;
    }

    public void setMargrequ(Double margrequ) {
        this.margrequ = margrequ;
    }

    public Double getIntelpay() {
        return intelpay;
    }

    public void setIntelpay(Double intelpay) {
        this.intelpay = intelpay;
    }

    public Double getOtherpay() {
        return otherpay;
    }

    public void setOtherpay(Double otherpay) {
        this.otherpay = otherpay;
    }

    public Double getAccrexpe() {
        return accrexpe;
    }

    public void setAccrexpe(Double accrexpe) {
        this.accrexpe = accrexpe;
    }

    public Double getExpecurrliab() {
        return expecurrliab;
    }

    public void setExpecurrliab(Double expecurrliab) {
        this.expecurrliab = expecurrliab;
    }

    public Double getCopewithreinrece() {
        return copewithreinrece;
    }

    public void setCopewithreinrece(Double copewithreinrece) {
        this.copewithreinrece = copewithreinrece;
    }

    public Double getInteticksett() {
        return inteticksett;
    }

    public void setInteticksett(Double inteticksett) {
        this.inteticksett = inteticksett;
    }

    public Double getDometicksett() {
        return dometicksett;
    }

    public void setDometicksett(Double dometicksett) {
        this.dometicksett = dometicksett;
    }

    public Double getDefereve() {
        return defereve;
    }

    public void setDefereve(Double defereve) {
        this.defereve = defereve;
    }

    public Double getShorttermbdspaya() {
        return shorttermbdspaya;
    }

    public void setShorttermbdspaya(Double shorttermbdspaya) {
        this.shorttermbdspaya = shorttermbdspaya;
    }

    public Double getDuenoncliab() {
        return duenoncliab;
    }

    public void setDuenoncliab(Double duenoncliab) {
        this.duenoncliab = duenoncliab;
    }

    public Double getOthercurreliabi() {
        return othercurreliabi;
    }

    public void setOthercurreliabi(Double othercurreliabi) {
        this.othercurreliabi = othercurreliabi;
    }

    public Double getCurrliabitse() {
        return currliabitse;
    }

    public void setCurrliabitse(Double currliabitse) {
        this.currliabitse = currliabitse;
    }

    public Double getCurrliabform() {
        return currliabform;
    }

    public void setCurrliabform(Double currliabform) {
        this.currliabform = currliabform;
    }

    public Double getTotalcurrliab() {
        return totalcurrliab;
    }

    public void setTotalcurrliab(Double totalcurrliab) {
        this.totalcurrliab = totalcurrliab;
    }

    public Double getLongborr() {
        return longborr;
    }

    public void setLongborr(Double longborr) {
        this.longborr = longborr;
    }

    public Double getBdspaya() {
        return bdspaya;
    }

    public void setBdspaya(Double bdspaya) {
        this.bdspaya = bdspaya;
    }

    public Double getLongpaya() {
        return longpaya;
    }

    public void setLongpaya(Double longpaya) {
        this.longpaya = longpaya;
    }

    public Double getSpecpaya() {
        return specpaya;
    }

    public void setSpecpaya(Double specpaya) {
        this.specpaya = specpaya;
    }

    public Double getExpenoncliab() {
        return expenoncliab;
    }

    public void setExpenoncliab(Double expenoncliab) {
        this.expenoncliab = expenoncliab;
    }

    public Double getLongdefeinco() {
        return longdefeinco;
    }

    public void setLongdefeinco(Double longdefeinco) {
        this.longdefeinco = longdefeinco;
    }

    public Double getDefeincotaxliab() {
        return defeincotaxliab;
    }

    public void setDefeincotaxliab(Double defeincotaxliab) {
        this.defeincotaxliab = defeincotaxliab;
    }

    public Double getOthernoncliabi() {
        return othernoncliabi;
    }

    public void setOthernoncliabi(Double othernoncliabi) {
        this.othernoncliabi = othernoncliabi;
    }

    public Double getLongliabitse() {
        return longliabitse;
    }

    public void setLongliabitse(Double longliabitse) {
        this.longliabitse = longliabitse;
    }

    public Double getLongliabform() {
        return longliabform;
    }

    public void setLongliabform(Double longliabform) {
        this.longliabform = longliabform;
    }

    public Double getTotalnoncliab() {
        return totalnoncliab;
    }

    public void setTotalnoncliab(Double totalnoncliab) {
        this.totalnoncliab = totalnoncliab;
    }

    public Double getTotliabitse() {
        return totliabitse;
    }

    public void setTotliabitse(Double totliabitse) {
        this.totliabitse = totliabitse;
    }

    public Double getTotliabform() {
        return totliabform;
    }

    public void setTotliabform(Double totliabform) {
        this.totliabform = totliabform;
    }

    public Double getTotliab() {
        return totliab;
    }

    public void setTotliab(Double totliab) {
        this.totliab = totliab;
    }

    public Double getPaidincapi() {
        return paidincapi;
    }

    public void setPaidincapi(Double paidincapi) {
        this.paidincapi = paidincapi;
    }

    public Double getCapisurp() {
        return capisurp;
    }

    public void setCapisurp(Double capisurp) {
        this.capisurp = capisurp;
    }

    public Double getTreastk() {
        return treastk;
    }

    public void setTreastk(Double treastk) {
        this.treastk = treastk;
    }

    public Double getSpecrese() {
        return specrese;
    }

    public void setSpecrese(Double specrese) {
        this.specrese = specrese;
    }

    public Double getRese() {
        return rese;
    }

    public void setRese(Double rese) {
        this.rese = rese;
    }

    public Double getGeneriskrese() {
        return generiskrese;
    }

    public void setGeneriskrese(Double generiskrese) {
        this.generiskrese = generiskrese;
    }

    public Double getUnreinveloss() {
        return unreinveloss;
    }

    public void setUnreinveloss(Double unreinveloss) {
        this.unreinveloss = unreinveloss;
    }

    public Double getUndiprof() {
        return undiprof;
    }

    public void setUndiprof(Double undiprof) {
        this.undiprof = undiprof;
    }

    public Double getTopaycashdivi() {
        return topaycashdivi;
    }

    public void setTopaycashdivi(Double topaycashdivi) {
        this.topaycashdivi = topaycashdivi;
    }

    public Double getCurtrandiff() {
        return curtrandiff;
    }

    public void setCurtrandiff(Double curtrandiff) {
        this.curtrandiff = curtrandiff;
    }

    public Double getSharrighitse() {
        return sharrighitse;
    }

    public void setSharrighitse(Double sharrighitse) {
        this.sharrighitse = sharrighitse;
    }

    public Double getSharrightform() {
        return sharrightform;
    }

    public void setSharrightform(Double sharrightform) {
        this.sharrightform = sharrightform;
    }

    public Double getParesharrigh() {
        return paresharrigh;
    }

    public void setParesharrigh(Double paresharrigh) {
        this.paresharrigh = paresharrigh;
    }

    public Double getMinysharrigh() {
        return minysharrigh;
    }

    public void setMinysharrigh(Double minysharrigh) {
        this.minysharrigh = minysharrigh;
    }

    public Double getRighaggritse() {
        return righaggritse;
    }

    public void setRighaggritse(Double righaggritse) {
        this.righaggritse = righaggritse;
    }

    public Double getRightaggrform() {
        return rightaggrform;
    }

    public void setRightaggrform(Double rightaggrform) {
        this.rightaggrform = rightaggrform;
    }

    public Double getRighaggr() {
        return righaggr;
    }

    public void setRighaggr(Double righaggr) {
        this.righaggr = righaggr;
    }

    public Double getRightotitse() {
        return rightotitse;
    }

    public void setRightotitse(Double rightotitse) {
        this.rightotitse = rightotitse;
    }

    public Double getRightotform() {
        return rightotform;
    }

    public void setRightotform(Double rightotform) {
        this.rightotform = rightotform;
    }

    public Double getTotliabsharequi() {
        return totliabsharequi;
    }

    public void setTotliabsharequi(Double totliabsharequi) {
        this.totliabsharequi = totliabsharequi;
    }

    public Double getSettresedepo() {
        return settresedepo;
    }

    public void setSettresedepo(Double settresedepo) {
        this.settresedepo = settresedepo;
    }

    public Double getPlac() {
        return plac;
    }

    public void setPlac(Double plac) {
        this.plac = plac;
    }

    public Double getDerifinaasset() {
        return derifinaasset;
    }

    public void setDerifinaasset(Double derifinaasset) {
        this.derifinaasset = derifinaasset;
    }

    public Double getReinrece() {
        return reinrece;
    }

    public void setReinrece(Double reinrece) {
        this.reinrece = reinrece;
    }

    public Double getReincontrese() {
        return reincontrese;
    }

    public void setReincontrese(Double reincontrese) {
        this.reincontrese = reincontrese;
    }

    public Double getPurcresaasset() {
        return purcresaasset;
    }

    public void setPurcresaasset(Double purcresaasset) {
        this.purcresaasset = purcresaasset;
    }

    public Double getCenbankborr() {
        return cenbankborr;
    }

    public void setCenbankborr(Double cenbankborr) {
        this.cenbankborr = cenbankborr;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getFdsborr() {
        return fdsborr;
    }

    public void setFdsborr(Double fdsborr) {
        this.fdsborr = fdsborr;
    }

    public Double getDeriliab() {
        return deriliab;
    }

    public void setDeriliab(Double deriliab) {
        this.deriliab = deriliab;
    }

    public Double getSellrepasse() {
        return sellrepasse;
    }

    public void setSellrepasse(Double sellrepasse) {
        this.sellrepasse = sellrepasse;
    }

    public Double getCopepoun() {
        return copepoun;
    }

    public void setCopepoun(Double copepoun) {
        this.copepoun = copepoun;
    }

    public Double getInsucontrese() {
        return insucontrese;
    }

    public void setInsucontrese(Double insucontrese) {
        this.insucontrese = insucontrese;
    }

    public Double getActitradsecu() {
        return actitradsecu;
    }

    public void setActitradsecu(Double actitradsecu) {
        this.actitradsecu = actitradsecu;
    }

    public Double getActiundesecu() {
        return actiundesecu;
    }

    public void setActiundesecu(Double actiundesecu) {
        this.actiundesecu = actiundesecu;
    }
}
