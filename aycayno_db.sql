-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 24, 2019 at 05:23 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `registration`
--

-- --------------------------------------------------------

--
-- Table structure for table `accountable`
--

CREATE TABLE `accountable` (
  `FIRST_NAME` varchar(50) NOT NULL,
  `LAST_NAME` varchar(50) NOT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accountable`
--

INSERT INTO `accountable` (`FIRST_NAME`, `LAST_NAME`, `USERNAME`, `PASSWORD`) VALUES
('sheena', 'aycayno', 'xhie', '3c9c03d6008a5adf42c2a55dd4a1a9f2'),
('ruela', 'berio', 'wengweng', '665b8de3f921501c96c89c26e8e333bd'),
('ted', 'pahilanga', 'teddy', '962b2d2b8e72dc6771bca613d49b46fb'),
('ryan', 'tyr', 'ryan', '76f5d947149185d77a1fa1a114b3fb30'),
('jed', 'faf', 'jed', 'c4ca4238a0b923820dcc509a6f75849b'),
('xhie', 'aycayno', 'xhie123', 'c5bc315af58f99af341e69990b011abf'),
('she', 'ayc', 'shee123', '9eb0d040ef57f4a06759cf307b657918'),
('ryan', 'wong', 'wong', '21232f297a57a5a743894a0e4a801fc3'),
('Shena', 'Aycayno', 'shenaycayno', '25f9e794323b453885f5181f1b624d0b');

-- --------------------------------------------------------

--
-- Table structure for table `addproduct`
--

CREATE TABLE `addproduct` (
  `ID` int(11) NOT NULL,
  `PRODUCT_NAME` varchar(11) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `PRICE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addproduct`
--

INSERT INTO `addproduct` (`ID`, `PRODUCT_NAME`, `QUANTITY`, `PRICE`) VALUES
(1, 'milo', 3, 90);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addproduct`
--
ALTER TABLE `addproduct`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addproduct`
--
ALTER TABLE `addproduct`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
