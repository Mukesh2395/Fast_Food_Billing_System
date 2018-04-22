-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2018 at 04:48 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fastfoodbilling`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_coffee_table`
--

CREATE TABLE `admin_coffee_table` (
  `brown_coffee` varchar(100) NOT NULL,
  `latte_coffee` varchar(100) NOT NULL,
  `americano_coffee` varchar(100) NOT NULL,
  `cappachino_coffee` varchar(100) NOT NULL,
  `hocha_coffee` varchar(100) NOT NULL,
  `black_coffee` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_coffee_table`
--

INSERT INTO `admin_coffee_table` (`brown_coffee`, `latte_coffee`, `americano_coffee`, `cappachino_coffee`, `hocha_coffee`, `black_coffee`) VALUES
('60', '70', '80', '78', '85', '68');

-- --------------------------------------------------------

--
-- Table structure for table `admin_desrt_table`
--

CREATE TABLE `admin_desrt_table` (
  `admin_id` int(10) NOT NULL,
  `DessertName` varchar(100) NOT NULL,
  `quantity` int(10) NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_desrt_table`
--

INSERT INTO `admin_desrt_table` (`admin_id`, `DessertName`, `quantity`, `price`) VALUES
(1, 'burfi', 50, 20),
(2, 'rasgulla', 50, 10),
(3, 'gulab jamun', 80, 20);

-- --------------------------------------------------------

--
-- Table structure for table `admin_drink_table`
--

CREATE TABLE `admin_drink_table` (
  `coco_cola` varchar(100) NOT NULL,
  `pepsi` varchar(100) NOT NULL,
  `diet_cock` varchar(50) NOT NULL,
  `mountain_dew` varchar(50) NOT NULL,
  `fanta` varchar(50) NOT NULL,
  `maza` varchar(50) NOT NULL,
  `redbull` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_drink_table`
--

INSERT INTO `admin_drink_table` (`coco_cola`, `pepsi`, `diet_cock`, `mountain_dew`, `fanta`, `maza`, `redbull`) VALUES
('60', '70', '80', '32', '50', '45', '78');

-- --------------------------------------------------------

--
-- Table structure for table `admin_meal_table`
--

CREATE TABLE `admin_meal_table` (
  `fries` int(20) NOT NULL,
  `salad` int(20) NOT NULL,
  `hamburger` int(20) NOT NULL,
  `onion_rings` int(20) NOT NULL,
  `chicken_salad` int(20) NOT NULL,
  `fish_sandwich` int(20) NOT NULL,
  `cheese_sandwich` int(20) NOT NULL,
  `chicken_sandwich` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_meal_table`
--

INSERT INTO `admin_meal_table` (`fries`, `salad`, `hamburger`, `onion_rings`, `chicken_salad`, `fish_sandwich`, `cheese_sandwich`, `chicken_sandwich`) VALUES
(60, 50, 80, 60, 80, 60, 40, 60),
(80, 60, 70, 80, 60, 80, 80, 68);

-- --------------------------------------------------------

--
-- Table structure for table `admin_table`
--

CREATE TABLE `admin_table` (
  `admin_id` int(10) NOT NULL,
  `admin_user` varchar(100) NOT NULL,
  `admin_password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_table`
--

INSERT INTO `admin_table` (`admin_id`, `admin_user`, `admin_password`) VALUES
(1, 'mukesh', '341304');

-- --------------------------------------------------------

--
-- Table structure for table `admin_tea_table`
--

CREATE TABLE `admin_tea_table` (
  `brown_tea` varchar(50) NOT NULL,
  `green_tea` varchar(50) NOT NULL,
  `black_tea` varchar(50) NOT NULL,
  `lemon_tea` varchar(50) NOT NULL,
  `Ginger_tea` varchar(50) NOT NULL,
  `Ice_tea` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_tea_table`
--

INSERT INTO `admin_tea_table` (`brown_tea`, `green_tea`, `black_tea`, `lemon_tea`, `Ginger_tea`, `Ice_tea`) VALUES
('60', '60', '40', '50', '80', '30');

-- --------------------------------------------------------

--
-- Table structure for table `record_customer_table`
--

CREATE TABLE `record_customer_table` (
  `name` varchar(50) NOT NULL,
  `mobileno` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cost_drink` int(50) NOT NULL,
  `cost_tea` int(50) NOT NULL,
  `cost_coffee` int(50) NOT NULL,
  `cost_dessert` int(50) NOT NULL,
  `tax` int(50) DEFAULT NULL,
  `subtotal` int(50) DEFAULT NULL,
  `total` int(50) DEFAULT NULL,
  `cost_meal` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `record_customer_table`
--

INSERT INTO `record_customer_table` (`name`, `mobileno`, `email`, `cost_drink`, `cost_tea`, `cost_coffee`, `cost_dessert`, `tax`, `subtotal`, `total`, `cost_meal`) VALUES
('mukesh', '96029163', 'mukesh.prajapat@gmail.com', 80, 50, 80, 90, 9, 45, 85, 78);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_desrt_table`
--
ALTER TABLE `admin_desrt_table`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `admin_table`
--
ALTER TABLE `admin_table`
  ADD PRIMARY KEY (`admin_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_desrt_table`
--
ALTER TABLE `admin_desrt_table`
  MODIFY `admin_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `admin_table`
--
ALTER TABLE `admin_table`
  MODIFY `admin_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
