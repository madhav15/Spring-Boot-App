CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `employee_id` bigint(20) DEFAULT NULL UNIQUE,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_number` bigint(20) DEFAULT NULL,
  `years_of_experince` bigint(20) DEFAULT NULL,
  `designation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
