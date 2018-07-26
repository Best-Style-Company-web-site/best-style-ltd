-- Dumping database structure for best_style_company
CREATE DATABASE IF NOT EXISTS `best_style_company` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `best_style_company`;

-- Dumping structure for table best_style_company.patterns
CREATE TABLE IF NOT EXISTS `patterns` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `sizes` varchar(50) NOT NULL,
  `material` varchar(50) NOT NULL,
  `designer` varchar(50) NOT NULL,
  `price_for_one_piece` varchar(50) NOT NULL,
  `bulk_price` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table best_style_company.patterns: ~0 rows (approximately)
/*!40000 ALTER TABLE `patterns` DISABLE KEYS */;
/*!40000 ALTER TABLE `patterns` ENABLE KEYS */;

-- Dumping structure for table best_style_company.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `registration_date` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table best_style_company.users: ~0 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;