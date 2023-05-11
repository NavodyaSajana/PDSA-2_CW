-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 11, 2023 at 05:55 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_fitos_game`
--
CREATE DATABASE IF NOT EXISTS `db_fitos_game` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `db_fitos_game`;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_e8_gameplay`
--
-- Creation: May 11, 2023 at 05:53 PM
-- Last update: May 11, 2023 at 05:53 PM
-- Last check: May 11, 2023 at 05:53 PM
--

DROP TABLE IF EXISTS `tbl_e8_gameplay`;
CREATE TABLE IF NOT EXISTS `tbl_e8_gameplay` (
  `player_id` int(11) NOT NULL,
  `player_name` varchar(15) NOT NULL,
  `pattern_id` int(11) NOT NULL,
  PRIMARY KEY (`player_id`),
  KEY `FK_Pattern_id` (`pattern_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pattern`
--
-- Creation: May 11, 2023 at 05:43 PM
-- Last update: May 11, 2023 at 05:43 PM
--

DROP TABLE IF EXISTS `tbl_pattern`;
CREATE TABLE IF NOT EXISTS `tbl_pattern` (
  `pattern_id` int(11) NOT NULL,
  `pattern` varchar(64) NOT NULL,
  PRIMARY KEY (`pattern_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

-- -------------------------------------------------------
ALTER TABLE tbl_e8_gameplay ADD CONSTRAINT FK_Pattern_id FOREIGN KEY (pattern_id) REFERENCES tbl_pattern(pattern_id);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
