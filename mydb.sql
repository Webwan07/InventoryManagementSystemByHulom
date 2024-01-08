-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2024 at 04:50 PM
-- Server version: 8.1.0
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `apptable`
--

CREATE TABLE `apptable` (
  `appID` int NOT NULL,
  `currentUser` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `apptable`
--

INSERT INTO `apptable` (`appID`, `currentUser`) VALUES
(1, 'superuser.wan');

-- --------------------------------------------------------

--
-- Table structure for table `categorytable`
--

CREATE TABLE `categorytable` (
  `categoryID` int NOT NULL,
  `categoryName` varchar(45) NOT NULL,
  `dateCreated` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `categorytable`
--

INSERT INTO `categorytable` (`categoryID`, `categoryName`, `dateCreated`) VALUES
(1, 'Home Consoles', '2024-01-07'),
(2, 'Portable Consoles', '2024-01-07'),
(3, 'Desktop PCs', '2024-01-07'),
(4, 'Laptops', '2024-01-07'),
(5, 'Components (for DIY builds)', '2024-01-07'),
(6, 'Keyboards', '2024-01-07'),
(7, 'Mice', '2024-01-07');

-- --------------------------------------------------------

--
-- Table structure for table `inventorytable`
--

CREATE TABLE `inventorytable` (
  `productID` int NOT NULL,
  `Category` varchar(45) NOT NULL,
  `ProductName` varchar(45) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Quantity` int NOT NULL,
  `RetailPrice` double NOT NULL,
  `DateOfPurchase` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `inventorytable`
--

INSERT INTO `inventorytable` (`productID`, `Category`, `ProductName`, `Description`, `Quantity`, `RetailPrice`, `DateOfPurchase`) VALUES
(1, 'Home Consoles', 'PlayStation 4', 'Best gaming console 2021', 499, 18000, '2023-01-01'),
(2, 'Home Consoles', 'PlayStation 5', 'Best gaming console 2024', 296, 40000, '2023-01-31'),
(3, 'Home Consoles', 'Xbox One', 'Best gaming console 2023', 800, 20000, '2023-02-01'),
(4, 'Home Consoles', 'Xbox Series X', 'Best gaming console 2022', 595, 28000, '2023-03-08'),
(5, 'Home Consoles', 'Nintendo Switch', 'Best gaming console 2022', 500, 17000, '2023-03-17'),
(6, 'Home Consoles', 'Nintendo Switch Lite', 'Best affordable gaming console', 993, 12000, '2023-03-17'),
(7, 'Portable Consoles', 'Nintendo 3DS', 'Best Handheld gaming devices', 900, 8000, '2023-03-28'),
(8, 'Portable Consoles', 'PlayStation Vita', 'Best Handheld gaming devices', 995, 15000, '2023-03-31'),
(9, 'Desktop PCs', 'Lenovo Legion Tower 5i', 'The best gaming PC for most people', 997, 120000, '2023-04-05'),
(10, 'Desktop PCs', 'HP Victus 15L', 'The best budget gaming P', 800, 60000, '2023-04-20'),
(11, 'Desktop PCs', 'Acer Predator Orion 7000', 'A premium gaming PC', 699, 240000, '2023-04-29'),
(12, 'Cables and Adapters', 'Alienware Aurora R16', 'The best budget gaming PC', 500, 54000, '2023-04-30'),
(13, 'Laptops', 'Dell Alienware m16 R1', 'The best gaming laptop', 800, 90000, '2023-05-16'),
(14, 'Laptops', 'Lenovo Legion Pro 5 Gen 8 16', 'Best mid-range pick', 997, 58000, '2023-05-27'),
(15, 'Laptops', 'ASUS TUF Dash F15', 'The best budget gaming laptop', 998, 45000, '2023-05-29'),
(16, 'Laptops', 'Lenovo IdeaPad Gaming 3', 'The best laptop for gaming', 998, 63000, '2023-05-29'),
(17, 'Laptops', 'Acer Chromebook 516 GE', 'The best gaming Chromebook', 897, 58000, '2023-05-30'),
(18, 'Components (for DIY builds)', 'AMD Radeon RX 7800 XT', 'Best graphics card', 5000, 28000, '2023-06-11'),
(19, 'Components (for DIY builds)', 'AMD Radeon RX 6600', 'Best budget graphics card', 6000, 15000, '2023-06-13'),
(20, 'Components (for DIY builds)', 'AMD Radeon RX 7600 XT', 'Best 1080p graphics card', 4000, 24000, '2023-06-15'),
(21, 'Components (for DIY builds)', 'Nvidia GeForce RTX 4070 Ti', 'Best high-end 1440p graphics card', 6999, 34000, '2023-06-17'),
(22, 'Components (for DIY builds)', 'AMD Radeon RX 7900 XTX', 'Best 4K graphics card', 6000, 42000, '2023-06-20'),
(23, 'Components (for DIY builds)', 'Intel Core i7-14700K', 'The best gaming processor in Intel\'s lineup', 10000, 24000, '2023-06-21'),
(24, 'Components (for DIY builds)', 'AMD Ryzen 5', 'Very energy efficient', 8999, 23000, '2023-06-22'),
(25, 'Components (for DIY builds)', 'Gigabyte Z790 Aorus Xtreme', 'E-ATX size limits case choices', 8000, 22000, '2023-06-24'),
(26, 'Components (for DIY builds)', 'ASRock Z790 Taichi Lite', 'Lacks premium looks', 8499, 21000, '2023-06-26'),
(27, 'Components (for DIY builds)', 'Corsair Vengeance LED', 'Great overclocking performance', 11000, 19000, '2023-06-28'),
(28, 'Components (for DIY builds)', 'Kingston HyperX Fury', 'Affordable at lower speeds', 12000, 19500, '2023-06-29'),
(29, 'Components (for DIY builds)', 'Samsung 990 Pro', 'The fastest drive we\'ve tested to date', 17999, 13900, '2023-08-14'),
(30, 'Components (for DIY builds)', 'WD Black SN850X', 'Top-tier performance', 14000, 12000, '2023-08-17'),
(31, 'Keyboards', 'Keychron Q6', 'The best all-around mechanical keyboard', 19999, 7500, '2023-09-18'),
(32, 'Keyboards', 'Razer Pro Type Ultra', 'For a less expensive option', 21000, 6000, '2023-09-19'),
(33, 'Keyboards', 'Royal Kludge RK1', 'The best budget mechanical keyboard', 29993, 1900, '2023-09-22'),
(34, 'Mice', 'Logitech MX Master 3S', 'The best computer mouse we\'ve tested', 41993, 5000, '2023-09-23'),
(35, 'Mice', 'Razer Basilisk V3', 'Looking for a mid-range option', 38992, 4500, '2023-09-23'),
(36, 'Mice', 'Garuda Gear Hawk 1', 'Best budget Gaming mouse', 35996, 1200, '2023-09-25');

-- --------------------------------------------------------

--
-- Table structure for table `purchasedtable`
--

CREATE TABLE `purchasedtable` (
  `invoiceNumber` varchar(12) DEFAULT NULL,
  `product` varchar(45) DEFAULT NULL,
  `discountPercent` float DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `purchasedDate` date DEFAULT NULL,
  `sellerfname` varchar(45) DEFAULT NULL,
  `sellerlname` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `purchasedtable`
--

INSERT INTO `purchasedtable` (`invoiceNumber`, `product`, `discountPercent`, `quantity`, `subtotal`, `total`, `purchasedDate`, `sellerfname`, `sellerlname`) VALUES
('b7218505.wan', 'Acer Predator Orion 7000', 0.2, 1, 240000, 192000, '2024-01-07', 'josuan leonardo', 'hulom'),
('29f71a4f.wan', 'Lenovo Legion Tower 5i', 0.5, 2, 240000, 120000, '2023-11-01', 'josuan leonardo', 'hulom'),
('2322e6de.wan', 'Nintendo Switch Lite', 0.2, 5, 60000, 48000, '2023-11-15', 'ethel', 'densing'),
('eca3d77f.wan', 'Garuda Gear Hawk 1', 0, 3, 3600, 3600, '2023-11-15', 'ethel', 'densing'),
('eca3d77f.wan', 'Logitech MX Master 3S', 0, 6, 30000, 30000, '2023-11-15', 'ethel', 'densing'),
('eca3d77f.wan', 'Razer Basilisk V3', 0, 8, 36000, 36000, '2023-11-15', 'ethel', 'densing'),
('9e7db2b4.wan', 'Acer Chromebook 516 GE', 0.3, 2, 116000, 81200, '2023-11-15', 'ethel', 'densing'),
('9e7db2b4.wan', 'Lenovo Legion Pro 5 Gen 8 16', 0, 3, 174000, 174000, '2023-11-15', 'ethel', 'densing'),
('358057ff.wan', 'PlayStation Vita', 0, 3, 45000, 45000, '2023-11-30', 'ethel', 'densing'),
('358057ff.wan', 'PlayStation 5', 0.2, 4, 160000, 128000, '2023-11-30', 'ethel', 'densing'),
('358057ff.wan', 'Xbox Series X', 0.1, 3, 84000, 75600, '2023-11-30', 'ethel', 'densing'),
('ec7f297e.wan', 'PlayStation Vita', 0.1, 1, 15000, 13500, '2023-12-15', 'kyla jade', 'agua'),
('ec7f297e.wan', 'Xbox Series X', 0.1, 2, 56000, 50400, '2023-12-15', 'kyla jade', 'agua'),
('ec7f297e.wan', 'Lenovo IdeaPad Gaming 3', 0.1, 2, 126000, 113400, '2023-12-15', 'kyla jade', 'agua'),
('f80c92fa.wan', 'PlayStation Vita', 0.1, 1, 15000, 13500, '2023-12-27', 'kyla jade', 'agua'),
('f80c92fa.wan', 'Royal Kludge RK1', 0.2, 7, 13300, 10640, '2023-12-27', 'kyla jade', 'agua'),
('f80c92fa.wan', 'Nintendo Switch Lite', 0.1, 2, 24000, 21600, '2023-12-27', 'kyla jade', 'agua'),
('f80c92fa.wan', 'ASUS TUF Dash F15', 0.1, 2, 90000, 81000, '2023-12-27', 'kyla jade', 'agua'),
('f80c92fa.wan', 'Samsung 990 Pro', 0.1, 1, 13900, 12510, '2023-12-27', 'kyla jade', 'agua'),
('f80c92fa.wan', 'ASRock Z790 Taichi Lite', 0.1, 1, 21000, 18900, '2023-12-27', 'kyla jade', 'agua'),
('f80c92fa.wan', 'Nvidia GeForce RTX 4070 Ti', 0.1, 1, 34000, 30600, '2023-12-27', 'kyla jade', 'agua'),
('185d39f2.wan', 'AMD Ryzen 5', 0, 1, 23000, 23000, '2023-12-30', 'kyla jade', 'agua'),
('185d39f2.wan', 'Garuda Gear Hawk 1', 0, 1, 1200, 1200, '2023-12-30', 'kyla jade', 'agua'),
('96ce7044.wan', 'PlayStation 4', 0.1, 1, 18000, 16200, '2024-01-03', 'kyla jade', 'agua'),
('96ce7044.wan', 'Keychron Q6', 0, 1, 7500, 7500, '2024-01-03', 'kyla jade', 'agua'),
('96ce7044.wan', 'Logitech MX Master 3S', 0, 1, 5000, 5000, '2024-01-03', 'kyla jade', 'agua'),
('96ce7044.wan', 'Lenovo Legion Tower 5i', 0.1, 1, 120000, 108000, '2024-01-03', 'kyla jade', 'agua'),
('96ce7044.wan', 'Acer Chromebook 516 GE', 0.1, 1, 58000, 52200, '2024-01-03', 'kyla jade', 'agua');

-- --------------------------------------------------------

--
-- Table structure for table `userstable`
--

CREATE TABLE `userstable` (
  `userId` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `birthdate` date NOT NULL,
  `gender` varchar(45) NOT NULL,
  `profileImgPath` varchar(45) NOT NULL,
  `userType` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `userstable`
--

INSERT INTO `userstable` (`userId`, `firstname`, `lastname`, `username`, `password`, `birthdate`, `gender`, `profileImgPath`, `userType`) VALUES
('superuser.wan', 'josuan leonardo', 'hulom', 'admin@231', '123', '2004-02-21', 'Male', 'admin.jpg', 0),
('user001.wan', 'ethel', 'densing', 'ethel', '001', '2004-05-07', 'Female', '2023-12-21_ethel.jpg', 1),
('user002.wan', 'kyla jade', 'agua', 'kyla', '002', '2004-05-07', 'Female', '2023-12-28_kyla_jade.jpg', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apptable`
--
ALTER TABLE `apptable`
  ADD PRIMARY KEY (`appID`);

--
-- Indexes for table `categorytable`
--
ALTER TABLE `categorytable`
  ADD PRIMARY KEY (`categoryID`),
  ADD UNIQUE KEY `categoryName` (`categoryName`);

--
-- Indexes for table `inventorytable`
--
ALTER TABLE `inventorytable`
  ADD PRIMARY KEY (`productID`),
  ADD UNIQUE KEY `Category` (`Category`,`ProductName`),
  ADD UNIQUE KEY `ProductName_UNIQUE` (`ProductName`);

--
-- Indexes for table `userstable`
--
ALTER TABLE `userstable`
  ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `apptable`
--
ALTER TABLE `apptable`
  MODIFY `appID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `categorytable`
--
ALTER TABLE `categorytable`
  MODIFY `categoryID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `inventorytable`
--
ALTER TABLE `inventorytable`
  MODIFY `productID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;