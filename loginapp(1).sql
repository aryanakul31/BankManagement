-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 05, 2019 at 10:31 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `loginapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `newaccount`
--

CREATE TABLE `newaccount` (
  `First_Name` varchar(20) NOT NULL,
  `Last_Name` varchar(20) NOT NULL,
  `Age` int(20) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Contact_Number` bigint(40) NOT NULL,
  `Password` varchar(40) NOT NULL,
  `User_id` varchar(20) NOT NULL,
  `Amount` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `newaccount`
--

INSERT INTO `newaccount` (`First_Name`, `Last_Name`, `Age`, `Email`, `Gender`, `Contact_Number`, `Password`, `User_id`, `Amount`) VALUES
('Nakul', 'Arya', 20, 'aryanakul31@gmail.com', 'MALE', 8872203232, 'a7170bcb15cdbcc8345bcfab65543c61', 'nakul_31', 6000);

-- --------------------------------------------------------

--
-- Table structure for table `transcations`
--

CREATE TABLE `transcations` (
  `user_id` varchar(20) NOT NULL,
  `transaction_id` int(11) NOT NULL,
  `amount` int(20) NOT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transcations`
--

INSERT INTO `transcations` (`user_id`, `transaction_id`, `amount`, `type`) VALUES
('nakul_31', 1, 100, 'WITHDRAW'),
('nakul_31', 3, 100, 'WITHDRAW'),
('nakul', 9, 100, 'WITHD'),
('nakul_31', 95, 1000, 'WITHDRAW'),
('nakul_31', 176, 1000, 'DEPOSIT'),
('nakul_31', 231, 999, 'WITHDRAW'),
('nakul_31', 367, 200, 'WITHDRAW'),
('nakul_31', 371, 300, 'DEPOSIT'),
('nakul_31', 427, 1000, 'WITHDRAW'),
('nakul_31', 450, 500, 'DEPOSIT'),
('nakul_31', 560, 1000, 'DEPOSIT'),
('nakul_31', 671, 500, 'DEPOSIT'),
('nakul_31', 702, 5999, 'DEPOSIT'),
('nakul_31', 843, 500, 'WITHDRAW'),
('nakul_31', 987, 500, 'WITHDRAW');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `newaccount`
--
ALTER TABLE `newaccount`
  ADD UNIQUE KEY `User_id` (`User_id`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- Indexes for table `transcations`
--
ALTER TABLE `transcations`
  ADD PRIMARY KEY (`transaction_id`),
  ADD UNIQUE KEY `transaction_id` (`transaction_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transcations`
--
ALTER TABLE `transcations`
  MODIFY `transaction_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=988;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
