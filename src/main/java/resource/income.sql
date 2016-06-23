CREATE TABLE `income` (
  `stockcode` int(11) NOT NULL,
  `compcode` int(11) NOT NULL,
  `publishdate` int(11) NOT NULL,
  `begindate` int(11) NOT NULL,
  `enddate` int(11) NOT NULL,
  `reporttype` int(11) NOT NULL,
  `quarter` varchar(4) NOT NULL,
  `adjustdate` int(11) NOT NULL,
  `accstacode` int(11) NOT NULL,
  `accstaname` varchar(10) NOT NULL,
  `biztotinco` double NOT NULL DEFAULT '0',
  `bizinco` double NOT NULL DEFAULT '0',
  `inteinco` double NOT NULL DEFAULT '0',
  `earnprem` double NOT NULL DEFAULT '0',
  `pouninco` double NOT NULL DEFAULT '0',
  `realsale` double NOT NULL DEFAULT '0',
  `otherbizinco` double NOT NULL DEFAULT '0',
  `biztotincoitse` double NOT NULL DEFAULT '0',
  `biztotincoform` double NOT NULL DEFAULT '0',
  `biztotcost` double NOT NULL DEFAULT '0',
  `bizcost` double NOT NULL DEFAULT '0',
  `inteexpe` double NOT NULL DEFAULT '0',
  `pounexpe` double NOT NULL DEFAULT '0',
  `realsalecost` double NOT NULL DEFAULT '0',
  `deveexpe` double NOT NULL DEFAULT '0',
  `surrgold` double NOT NULL DEFAULT '0',
  `compnetexpe` double NOT NULL DEFAULT '0',
  `contress` double NOT NULL DEFAULT '0',
  `polidiviexpe` double NOT NULL DEFAULT '0',
  `reinexpe` double NOT NULL DEFAULT '0',
  `otherbizcost` double NOT NULL DEFAULT '0',
  `biztax` double NOT NULL DEFAULT '0',
  `salesexpe` double NOT NULL DEFAULT '0',
  `manaexpe` double NOT NULL DEFAULT '0',
  `finexpe` double NOT NULL DEFAULT '0',
  `asseimpaloss` double NOT NULL DEFAULT '0',
  `biztotcostitse` double NOT NULL DEFAULT '0',
  `biztotcostform` double NOT NULL DEFAULT '0',
  `valuechgloss` double NOT NULL DEFAULT '0',
  `inveinco` double NOT NULL DEFAULT '0',
  `assoinveprof` double NOT NULL DEFAULT '0',
  `exchggain` double NOT NULL DEFAULT '0',
  `futuloss` double NOT NULL DEFAULT '0',
  `custinco` double NOT NULL DEFAULT '0',
  `subsidyincome` double NOT NULL DEFAULT '0',
  `otherbizprof` double NOT NULL DEFAULT '0',
  `bizprofitse` double NOT NULL DEFAULT '0',
  `operprofform` double NOT NULL DEFAULT '0',
  `perprofit` double NOT NULL DEFAULT '0',
  `nonoreve` double NOT NULL DEFAULT '0',
  `nonoexpe` double NOT NULL DEFAULT '0',
  `noncassetsdisl` double NOT NULL DEFAULT '0',
  `proftotitse` double NOT NULL DEFAULT '0',
  `proftotform` double NOT NULL DEFAULT '0',
  `totprofit` double NOT NULL DEFAULT '0',
  `incotaxexpe` double NOT NULL DEFAULT '0',
  `unreinveloss` double NOT NULL DEFAULT '0',
  `netpro1itse` double NOT NULL DEFAULT '0',
  `netpro1form` double NOT NULL DEFAULT '0',
  `netprofit` double NOT NULL DEFAULT '0',
  `parenetp` double NOT NULL DEFAULT '0',
  `mergeformnetprof` double NOT NULL DEFAULT '0',
  `minysharrigh` double NOT NULL DEFAULT '0',
  `netpro2itse` double NOT NULL DEFAULT '0',
  `netpro2form` double NOT NULL DEFAULT '0',
  `basiceps` double NOT NULL DEFAULT '0',
  `dilutedeps` double NOT NULL DEFAULT '0',
  `othercompinco` double NOT NULL DEFAULT '0',
  `parecompinco` double NOT NULL DEFAULT '0',
  `minysharinco` double NOT NULL DEFAULT '0',
  `compincoamt` double NOT NULL DEFAULT '0',
  `parecompincoamt` double NOT NULL DEFAULT '0',
  `minysharincoamt` double NOT NULL DEFAULT '0',
  `earlyundiprof` double NOT NULL DEFAULT '0',
  `undisprofredu` double NOT NULL DEFAULT '0',
  `otherinto` double NOT NULL DEFAULT '0',
  `otherdistprof` double NOT NULL DEFAULT '0',
  `legalsurp` double NOT NULL DEFAULT '0',
  `welfare` double NOT NULL DEFAULT '0',
  `capitalreserve` double NOT NULL DEFAULT '0',
  `staffaward` double NOT NULL DEFAULT '0',
  `reservefund` double NOT NULL DEFAULT '0',
  `developfund` double NOT NULL DEFAULT '0',
  `profreturninvest` double NOT NULL DEFAULT '0',
  `supplycurcap` double NOT NULL DEFAULT '0',
  `avaidistshareprof` double NOT NULL DEFAULT '0',
  `preferredskdiv` double NOT NULL DEFAULT '0',
  `freesurplu` double NOT NULL DEFAULT '0',
  `dealwithdivi` double NOT NULL DEFAULT '0',
  `capitalizeddivi` double NOT NULL DEFAULT '0',
  `undisprofit` double NOT NULL DEFAULT '0',
  `selldepartgain` double NOT NULL DEFAULT '0',
  `natudisasterloss` double NOT NULL DEFAULT '0',
  `accpolicychg` double NOT NULL DEFAULT '0',
  `accestimatechg` double NOT NULL DEFAULT '0',
  `debtrestruloss` double NOT NULL DEFAULT '0',
  `othersupply` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`stockcode`),
  KEY `date_type_index` (`compcode`,`enddate`,`quarter`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
