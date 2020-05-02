--
-- Table structure for table `Albums`
--
-- CREATE TABLE `Leads` (
--  `id` int(11) NOT NULL AUTO_INCREMENT,
--  `nombre` varchar(200) NOT NULL,
--  `mail` varchar(200) NOT NULL,
--  `ip` varchar(150) NOT NULL,
--  PRIMARY KEY (`id`)-
-- ) ENGINE=MyISAM;

CREATE TABLE leads(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    mail  VARCHAR(40) NOT NULL,
    ip VARCHAR(40),
    PRIMARY KEY ( id ) );
