-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2023 at 08:21 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_spk_karyawan`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_bobot`
--

CREATE TABLE `data_bobot` (
  `C1_Wawancara` varchar(20) NOT NULL,
  `C2_Test_Kepribadian` float DEFAULT NULL,
  `C3_IPK` float DEFAULT NULL,
  `C4_Test_Bidang` float DEFAULT NULL,
  `C5_Pengalama_Bekerja` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_bobot`
--

INSERT INTO `data_bobot` (`C1_Wawancara`, `C2_Test_Kepribadian`, `C3_IPK`, `C4_Test_Bidang`, `C5_Pengalama_Bekerja`) VALUES
('0.15', 0.1, 0.15, 0.3, 0.3);

-- --------------------------------------------------------

--
-- Table structure for table `data_hasil_perhitungan`
--

CREATE TABLE `data_hasil_perhitungan` (
  `ID` varchar(20) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Hasil_Perhitungan` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_hasil_perhitungan`
--

INSERT INTO `data_hasil_perhitungan` (`ID`, `Nama`, `Hasil_Perhitungan`) VALUES
('A0001', 'Anjar krisdianto', 0.688958),
('A0002', 'Dewi', 0.806622),
('A0003', 'Handoko', 0.623323),
('A0004', 'Trisno Mochammad', 0.806483),
('A0005', 'Junaedi', 0.956731),
('A0006', 'Dimas Rizky', 0.60781),
('A0007', 'Daffa Ahmad', 0.571326);

-- --------------------------------------------------------

--
-- Table structure for table `data_karyawan`
--

CREATE TABLE `data_karyawan` (
  `ID` varchar(20) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `C1_Wawancara` float DEFAULT NULL,
  `C2_Test_Kepribadian` int(10) DEFAULT NULL,
  `C3_IPK` float DEFAULT NULL,
  `C4_Test_Bidang` int(10) DEFAULT NULL,
  `C5_Pengalaman_Bekerja` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_karyawan`
--

INSERT INTO `data_karyawan` (`ID`, `Nama`, `C1_Wawancara`, `C2_Test_Kepribadian`, `C3_IPK`, `C4_Test_Bidang`, `C5_Pengalaman_Bekerja`) VALUES
('A0001', 'Anjar krisdianto', 50, 60, 3.24, 40, 65),
('A0002', 'Dewi', 60, 50, 3.5, 70, 64),
('A0003', 'Handoko', 70, 55, 2.75, 45, 40),
('A0004', 'Trisno Mochammad', 64, 78, 3.6, 66, 55),
('A0005', 'Junaedi', 80, 67, 2.9, 86, 80),
('A0006', 'Dimas Rizky', 45, 60, 3.15, 42, 45),
('A0007', 'Daffa Ahmad', 45, 40, 2.67, 50, 40);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('', 'qwerty'),
('', '12345'),
('admin', 'qwerty'),
('ahmad', '0987654321'),
('Admin', 'S3m4ng4t!2023'),
('Anjar', '2001'),
('icha', '2019'),
('user01', 'semangat2023');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_bobot`
--
ALTER TABLE `data_bobot`
  ADD PRIMARY KEY (`C1_Wawancara`);

--
-- Indexes for table `data_hasil_perhitungan`
--
ALTER TABLE `data_hasil_perhitungan`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `data_karyawan`
--
ALTER TABLE `data_karyawan`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
