DROP TABLE IF EXISTS `finstatement`.`stock`;
CREATE TABLE  `finstatement`.`stock` (
  `symbol` char(8) NOT NULL,
  `code` char(6) NOT NULL,
  `name` varchar(6) NOT NULL,
  `current` float NOT NULL DEFAULT '0',
  `percent` float NOT NULL DEFAULT '0',
  `change` float NOT NULL DEFAULT '0',
  `high` float NOT NULL DEFAULT '0',
  `low` float NOT NULL DEFAULT '0',
  `high52w` float NOT NULL DEFAULT '0',
  `low52w` float NOT NULL DEFAULT '0',
  `marketcapital` double NOT NULL DEFAULT '0',
  `amount` double NOT NULL DEFAULT '0',
  `pettm` float NOT NULL DEFAULT '0',
  `volume` double NOT NULL DEFAULT '0',
  `hasexist` tinyint(1) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;