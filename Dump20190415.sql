CREATE DATABASE  IF NOT EXISTS `coletaseletiva` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `coletaseletiva`;
-- MySQL dump 10.13  Distrib 5.7.23, for Win64 (x86_64)
--
-- Host: localhost    Database: coletaseletiva
-- ------------------------------------------------------
-- Server version	5.7.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `coleta_tb_dadousuario`
--

DROP TABLE IF EXISTS `coleta_tb_dadousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_dadousuario` (
  `usuario_id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario_nome` varchar(80) NOT NULL,
  `usuario_nomefantasia` varchar(80) NOT NULL,
  `usuario_razaosocial` varchar(100) NOT NULL,
  `usuario_inscricaoestadual` varchar(30) NOT NULL,
  `usuario_inscricaomunicipal` varchar(30) NOT NULL,
  `usuario_representanteempresa` varchar(100) NOT NULL,
  `usuario_tipopessoa` varchar(30) NOT NULL,
  `usuario_cpf` varchar(20) NOT NULL,
  `usuario_cnpj` varchar(20) NOT NULL,
  `usuario_datacadastro` date NOT NULL,
  `usuario_status` varchar(30) NOT NULL,
  `login_id` int(11) NOT NULL,
  `grupo_id` int(11) NOT NULL,
  PRIMARY KEY (`usuario_id`) USING BTREE,
  KEY `dadousuario_fk2` (`grupo_id`),
  KEY `dadousuario_fk4` (`login_id`),
  CONSTRAINT `dadousuario_fk2` FOREIGN KEY (`grupo_id`) REFERENCES `coleta_tb_grupo` (`grupo_id`),
  CONSTRAINT `dadousuario_fk4` FOREIGN KEY (`login_id`) REFERENCES `coleta_tb_login` (`login_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_dadousuario`
--

LOCK TABLES `coleta_tb_dadousuario` WRITE;
/*!40000 ALTER TABLE `coleta_tb_dadousuario` DISABLE KEYS */;
INSERT INTO `coleta_tb_dadousuario` VALUES (1,'Juliana','a','a','a','a','a','fisica','12345685233','a','2019-01-05','Ativo',1,3),(2,'Ana','a','a','a','a','a','fisica','12345201233','a','2019-01-07','Ativo',2,3),(3,'Lua','a','a','a','a','a','fisica','852365122275','a','2019-01-10','Ativo',3,3),(4,'Rafaela','a','a','a','a','a','fisica','52014766633','a','2019-01-11','Ativo',4,3),(5,'Vitoria','a','a','a','a','a','fisica','33385601485','a','2019-01-15','Ativo',5,3),(6,'Daiana','a','a','a','a','a','fisica','36985201422','a','2019-01-16','Ativo',6,3),(7,'Leandro','a','a','a','a','a','fisica','85236014963','a','2019-01-16','Ativo',7,3),(8,'Joao','a','a','a','a','a','fisica','14562089632','a','2019-01-18','Ativo',8,3),(9,'Silas','a','a','a','a','a','fisica','74120569855','a','2019-01-20','Ativo',9,3),(10,'Jaqueline','a','a','a','a','a','fisica','20163241188','a','2019-01-21','Ativo',10,3);
/*!40000 ALTER TABLE `coleta_tb_dadousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_email`
--

DROP TABLE IF EXISTS `coleta_tb_email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_email` (
  `email_id` int(11) NOT NULL AUTO_INCREMENT,
  `email_empresarial` char(100) DEFAULT NULL,
  `email_particular` char(100) DEFAULT NULL,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`email_id`) USING BTREE,
  UNIQUE KEY `usuario_id_2` (`usuario_id`),
  KEY `usuario_id` (`usuario_id`),
  CONSTRAINT `email_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `coleta_tb_dadousuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_email`
--

LOCK TABLES `coleta_tb_email` WRITE;
/*!40000 ALTER TABLE `coleta_tb_email` DISABLE KEYS */;
INSERT INTO `coleta_tb_email` VALUES (1,'a','julyale@hotmail.com',1),(2,'a','anacarol@uol.com.br',2),(3,'a','lua123@uol.com.br',3),(4,'a','rafinhalins@outlook.com.br',4),(5,'a','vitoriavivi@uol.com.br',5),(6,'a','daiasantos@gmail.com.br',6),(7,'a','leandrolins@hotmail.com.br',7),(8,'a','joaocarlos@hotmail.com.br',8),(9,'a','silasmiguel@gmail.com.br',9),(10,'a','jack@hotmail.com.br',10);
/*!40000 ALTER TABLE `coleta_tb_email` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_endereco`
--

DROP TABLE IF EXISTS `coleta_tb_endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_endereco` (
  `endereco_id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario_id` int(11) NOT NULL,
  `endereco_cep` varchar(20) DEFAULT NULL,
  `endereco_logradouro` char(30) NOT NULL,
  `endereco_numero` int(11) NOT NULL,
  `endereco_complemento` char(30) NOT NULL,
  `endereco_municipio` char(30) NOT NULL,
  `endereco_uf` char(15) NOT NULL,
  `endereco_referencia` char(30) NOT NULL,
  `endereco_bairro` char(30) NOT NULL,
  PRIMARY KEY (`endereco_id`),
  UNIQUE KEY `usuario_id` (`usuario_id`),
  UNIQUE KEY `usuario_id_2` (`usuario_id`),
  KEY `endereco_usuario_fk1` (`usuario_id`),
  CONSTRAINT `endereco_usuario_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `coleta_tb_dadousuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_endereco`
--

LOCK TABLES `coleta_tb_endereco` WRITE;
/*!40000 ALTER TABLE `coleta_tb_endereco` DISABLE KEYS */;
INSERT INTO `coleta_tb_endereco` VALUES (1,1,'12922670','Rua de Prata',25,'casa','Bragança Paulista','Sao Paulo','Perto Mendonça','Planejada'),(2,2,'12923670','Rua das Nacoes',2,'casa','Atibaia','Sao Paulo','Perto Extra','Centro'),(3,3,'12220456','Rua de Ouro',28,'casa','Bragança Paulista','Sao Paulo','Perto da Congregacao','Cerejeiras'),(4,4,'12922670','Rua Argemiro Rocha',30,'casa','Bragança Paulista','Sao Paulo','Perto Praca Matriz','Morumbi'),(5,5,'12922670','Rua dos Imigrantes',32,'casa','Atibaia','Sao Paulo','Perto Fatec','Jd do Cedro'),(6,6,'12922670','Rua Europa',21,'casa','Bragança Paulista','Sao Paulo','Taboao','Pq Estados'),(7,7,'12922670','Av Antonio Ribeiro',35,'casa','Bragança Paulista','Sao Paulo','Perto da escola','Jd America'),(8,8,'12922670','Rua Sete',50,'casa','Bragança Paulista','Sao Paulo','Perto do Forum','Centro'),(9,9,'12922670','Rua Miguel Morales',325,'casa','Bragança Paulista','Sao Paulo','Perto do Posto','Sta Rita'),(10,10,'12922670','Rua de Marco',587,'casa','Bragança Paulista','Sao Paulo','Perto do posto de monta','Sao Lourenco');
/*!40000 ALTER TABLE `coleta_tb_endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_estatistica`
--

DROP TABLE IF EXISTS `coleta_tb_estatistica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_estatistica` (
  `estatistica_id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario_id` int(11) NOT NULL,
  `estatistica_quantidaderesiduo` double NOT NULL,
  `estatistica_datarecolha` date NOT NULL,
  `estatistica_tiporesiduo` varchar(200) NOT NULL,
  PRIMARY KEY (`estatistica_id`),
  KEY `estatistica_usuario_fk1` (`usuario_id`),
  CONSTRAINT `estatistica_usuario_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `coleta_tb_dadousuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_estatistica`
--

LOCK TABLES `coleta_tb_estatistica` WRITE;
/*!40000 ALTER TABLE `coleta_tb_estatistica` DISABLE KEYS */;
INSERT INTO `coleta_tb_estatistica` VALUES (1,1,10,'2019-01-05','plastico');
/*!40000 ALTER TABLE `coleta_tb_estatistica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_feedback`
--

DROP TABLE IF EXISTS `coleta_tb_feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_feedback` (
  `feedback_id` int(11) NOT NULL AUTO_INCREMENT,
  `feedback_qualificacao` int(11) NOT NULL,
  `feedback_data` date NOT NULL,
  `feedback_critica` varchar(100) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `feedback_status` varchar(20) DEFAULT NULL,
  `feedback_resposta` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`feedback_id`),
  KEY `feedback_usuario_fk1` (`usuario_id`),
  CONSTRAINT `feedback_usuario_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `coleta_tb_dadousuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_feedback`
--

LOCK TABLES `coleta_tb_feedback` WRITE;
/*!40000 ALTER TABLE `coleta_tb_feedback` DISABLE KEYS */;
INSERT INTO `coleta_tb_feedback` VALUES (1,5,'2019-01-05','Ótimo serviço',1,'Enviado',NULL),(2,5,'2019-01-10','Ótimo serviço',2,'Enviado',NULL),(3,5,'2019-01-12','Ótimo serviço',3,'Enviado',NULL),(4,5,'2019-01-15','Ótimo serviço',4,'Enviado',NULL),(5,5,'2019-01-18','Ótimo serviço',5,'Enviado',NULL),(6,5,'2019-01-20','Ótimo serviço',6,'Enviado',NULL),(7,5,'2019-01-22','Ótimo serviço',7,'Enviado',NULL),(8,5,'2019-01-23','Ótimo serviço',8,'Enviado',NULL),(9,5,'2019-01-25','Ótimo serviço',9,'Enviado',NULL),(10,5,'2019-01-28','Ótimo serviço',10,'Enviado',NULL);
/*!40000 ALTER TABLE `coleta_tb_feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_grupo`
--

DROP TABLE IF EXISTS `coleta_tb_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_grupo` (
  `grupo_id` int(11) NOT NULL,
  `grupo_descricao` varchar(11) NOT NULL,
  PRIMARY KEY (`grupo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_grupo`
--

LOCK TABLES `coleta_tb_grupo` WRITE;
/*!40000 ALTER TABLE `coleta_tb_grupo` DISABLE KEYS */;
INSERT INTO `coleta_tb_grupo` VALUES (1,'Associado'),(2,'Cooperativa'),(3,'Solicitante');
/*!40000 ALTER TABLE `coleta_tb_grupo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_login`
--

DROP TABLE IF EXISTS `coleta_tb_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_login` (
  `login_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_nome` varchar(30) NOT NULL,
  `login_senha` varchar(32) NOT NULL,
  PRIMARY KEY (`login_id`),
  UNIQUE KEY `login_nome` (`login_nome`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_login`
--

LOCK TABLES `coleta_tb_login` WRITE;
/*!40000 ALTER TABLE `coleta_tb_login` DISABLE KEYS */;
INSERT INTO `coleta_tb_login` VALUES (1,'Juliana','123'),(2,'Ana','123'),(3,'Lua','123'),(4,'Rafaela','123'),(5,'Vitoria','123'),(6,'Daiana','123'),(7,'Leandro','123'),(8,'Joao','123'),(9,'Silas','123'),(10,'Jaqueline','123');
/*!40000 ALTER TABLE `coleta_tb_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_permissao`
--

DROP TABLE IF EXISTS `coleta_tb_permissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_permissao` (
  `permissao_id` int(11) NOT NULL AUTO_INCREMENT,
  `grupo_id` int(11) NOT NULL,
  `permissao_descricao` varchar(150) NOT NULL,
  `permissao_visualizar` tinyint(1) NOT NULL,
  `permissao_editar` tinyint(1) NOT NULL,
  `permissao_excluir` tinyint(1) NOT NULL,
  PRIMARY KEY (`permissao_id`),
  KEY `permissao_grupo_fk1` (`grupo_id`),
  CONSTRAINT `permissao_grupo_fk1` FOREIGN KEY (`grupo_id`) REFERENCES `coleta_tb_grupo` (`grupo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_permissao`
--

LOCK TABLES `coleta_tb_permissao` WRITE;
/*!40000 ALTER TABLE `coleta_tb_permissao` DISABLE KEYS */;
INSERT INTO `coleta_tb_permissao` VALUES (1,1,'Comum',1,1,0),(2,2,'Administrador',1,1,1),(3,3,'Administrador',1,1,0);
/*!40000 ALTER TABLE `coleta_tb_permissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_solicitacao`
--

DROP TABLE IF EXISTS `coleta_tb_solicitacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_solicitacao` (
  `solicitacao_id` int(11) NOT NULL AUTO_INCREMENT,
  `solicitacao_data` date NOT NULL,
  `solicitacao_descricao` varchar(30) NOT NULL,
  `solicitacao_rastreamento` varchar(50) DEFAULT NULL,
  `solicitacao_tiporesiduo` varchar(100) DEFAULT NULL,
  `solicitacao_quantidade` int(15) DEFAULT NULL,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`solicitacao_id`),
  KEY `solicitacao_usuario_fk1` (`usuario_id`),
  CONSTRAINT `solicitacao_usuario_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `coleta_tb_dadousuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_solicitacao`
--

LOCK TABLES `coleta_tb_solicitacao` WRITE;
/*!40000 ALTER TABLE `coleta_tb_solicitacao` DISABLE KEYS */;
INSERT INTO `coleta_tb_solicitacao` VALUES (1,'2019-01-07','Apos as 14','Aberto','plastico',10,1),(2,'2019-01-10','Apos as 10h','Aberto','plastico',10,2),(3,'2019-01-15','Apos as 10h','Aberto','plastico',10,3),(4,'2019-01-18','Apos as 10h','Aberto','papel',15,4),(5,'2019-01-22','Apos as 10h','Aberto','papel',12,5),(6,'2019-01-25','Apos as 10h','Aberto','papel',10,6),(7,'2019-01-26','Apos as 10h','Aberto','metal',10,7),(8,'2019-01-26','Apos as 10h','Aberto','vidro',3,8),(9,'2019-01-28','Apos as 10h','Aberto','vidro',3,9),(10,'2019-01-28','Apos as 10h','Aberto','vidro',3,10);
/*!40000 ALTER TABLE `coleta_tb_solicitacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_telefone`
--

DROP TABLE IF EXISTS `coleta_tb_telefone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_telefone` (
  `telefone_id` int(11) NOT NULL AUTO_INCREMENT,
  `telefone_celular` varchar(20) NOT NULL,
  `telefone_fixo` varchar(20) DEFAULT NULL,
  `telefone_comercial` varchar(20) DEFAULT NULL,
  `telefone_empresarial` varchar(20) DEFAULT NULL,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`telefone_id`),
  UNIQUE KEY `usuario_id_2` (`usuario_id`),
  KEY `usuario_id` (`usuario_id`),
  CONSTRAINT `telefone_usuario_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `coleta_tb_dadousuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_telefone`
--

LOCK TABLES `coleta_tb_telefone` WRITE;
/*!40000 ALTER TABLE `coleta_tb_telefone` DISABLE KEYS */;
INSERT INTO `coleta_tb_telefone` VALUES (1,'11977558866','1140315588','1140045588','a',1),(2,'11952001144','1140325511','1140045578','a',2),(3,'11955201463','1140331255','1143018222','a',3),(4,'11955200146','1140315544','1140045632','a',4),(5,'11942553025','1140330256','1145483652','a',5),(6,'11974630255','1140325469','1135184687','a',6),(7,'11952025368','1140005123','1140010022','a',7),(8,'11952058633','1140045623','1140356302','a',8),(9,'11955200363','1140048955','1140356987','a',9),(10,'11952005200','1140047898','1140314587','a',10);
/*!40000 ALTER TABLE `coleta_tb_telefone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coleta_tb_trocaponto`
--

DROP TABLE IF EXISTS `coleta_tb_trocaponto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta_tb_trocaponto` (
  `trocaponto_id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario_id` int(11) NOT NULL,
  `trocaponto_quantidade` int(11) NOT NULL,
  `trocaponto_validadeponto` date NOT NULL,
  `trocaponto_quantidadeproduto` int(11) NOT NULL,
  `trocaponto_descricaoproduto` varchar(50) NOT NULL,
  `trocaponto_precodetrocaproduto` int(11) NOT NULL,
  PRIMARY KEY (`trocaponto_id`),
  KEY `trocaponto_usuario_fk1` (`usuario_id`),
  CONSTRAINT `trocaponto_usuario_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `coleta_tb_dadousuario` (`usuario_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta_tb_trocaponto`
--

LOCK TABLES `coleta_tb_trocaponto` WRITE;
/*!40000 ALTER TABLE `coleta_tb_trocaponto` DISABLE KEYS */;
/*!40000 ALTER TABLE `coleta_tb_trocaponto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `coleta_vw_cooperativa`
--

DROP TABLE IF EXISTS `coleta_vw_cooperativa`;
/*!50001 DROP VIEW IF EXISTS `coleta_vw_cooperativa`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `coleta_vw_cooperativa` AS SELECT 
 1 AS `usuario_id`,
 1 AS `usuario_datacadastro`,
 1 AS `usuario_razaosocial`,
 1 AS `usuario_nomefantasia`,
 1 AS `usuario_cnpj`,
 1 AS `usuario_inscricaoestadual`,
 1 AS `usuario_inscricaomunicipal`,
 1 AS `usuario_representanteempresa`,
 1 AS `endereco_logradouro`,
 1 AS `endereco_numero`,
 1 AS `endereco_bairro`,
 1 AS `endereco_complemento`,
 1 AS `endereco_referencia`,
 1 AS `endereco_municipio`,
 1 AS `endereco_cep`,
 1 AS `endereco_uf`,
 1 AS `telefone_fixo`,
 1 AS `telefone_empresarial`,
 1 AS `telefone_celular`,
 1 AS `email_empresarial`,
 1 AS `email_particular`,
 1 AS `login_nome`,
 1 AS `login_senha`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `coleta_vw_dadousuario`
--

DROP TABLE IF EXISTS `coleta_vw_dadousuario`;
/*!50001 DROP VIEW IF EXISTS `coleta_vw_dadousuario`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `coleta_vw_dadousuario` AS SELECT 
 1 AS `usuario_id`,
 1 AS `grupo_id`,
 1 AS `usuario_nome`,
 1 AS `usuario_datacadastro`,
 1 AS `usuario_cpf`,
 1 AS `endereco_logradouro`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `coleta_vw_estatisticas`
--

DROP TABLE IF EXISTS `coleta_vw_estatisticas`;
/*!50001 DROP VIEW IF EXISTS `coleta_vw_estatisticas`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `coleta_vw_estatisticas` AS SELECT 
 1 AS `endereco_bairro`,
 1 AS `solicitacao_quantidade`,
 1 AS `solicitacao_data`,
 1 AS `solicitacao_tiporesiduo`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `feedback_vw`
--

DROP TABLE IF EXISTS `feedback_vw`;
/*!50001 DROP VIEW IF EXISTS `feedback_vw`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `feedback_vw` AS SELECT 
 1 AS `usuario_id`,
 1 AS `usuario_nome`,
 1 AS `feedback_id`,
 1 AS `feedback_qualificacao`,
 1 AS `feedback_data`,
 1 AS `feedback_critica`,
 1 AS `feedback_status`,
 1 AS `feedback_resposta`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `solicitacao_vw_sol`
--

DROP TABLE IF EXISTS `solicitacao_vw_sol`;
/*!50001 DROP VIEW IF EXISTS `solicitacao_vw_sol`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `solicitacao_vw_sol` AS SELECT 
 1 AS `usuario_id`,
 1 AS `usuario_nome`,
 1 AS `solicitacao_id`,
 1 AS `solicitacao_data`,
 1 AS `solicitacao_descricao`,
 1 AS `solicitacao_tiporesiduo`,
 1 AS `solicitacao_quantidade`,
 1 AS `endereco_logradouro`,
 1 AS `endereco_numero`,
 1 AS `endereco_bairro`,
 1 AS `endereco_municipio`,
 1 AS `endereco_cep`,
 1 AS `telefone_celular`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `solicitacao_vw_solic`
--

DROP TABLE IF EXISTS `solicitacao_vw_solic`;
/*!50001 DROP VIEW IF EXISTS `solicitacao_vw_solic`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `solicitacao_vw_solic` AS SELECT 
 1 AS `usuario_id`,
 1 AS `usuario_nome`,
 1 AS `solicitacao_id`,
 1 AS `solicitacao_data`,
 1 AS `solicitacao_descricao`,
 1 AS `solicitacao_tiporesiduo`,
 1 AS `endereco_id`,
 1 AS `endereco_logradouro`,
 1 AS `endereco_numero`,
 1 AS `endereco_bairro`,
 1 AS `endereco_municipio`,
 1 AS `endereco_cep`,
 1 AS `telefone_celular`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `solicitacao_wv`
--

DROP TABLE IF EXISTS `solicitacao_wv`;
/*!50001 DROP VIEW IF EXISTS `solicitacao_wv`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `solicitacao_wv` AS SELECT 
 1 AS `solicitacao_data`,
 1 AS `solicitacao_descricao`,
 1 AS `solicitacao_tiporesiduo`,
 1 AS `usuario_nome`,
 1 AS `endereco_logradouro`,
 1 AS `endereco_numero`,
 1 AS `endereco_cep`,
 1 AS `endereco_municipio`,
 1 AS `endereco_bairro`,
 1 AS `telefone_celular`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `coleta_vw_cooperativa`
--

/*!50001 DROP VIEW IF EXISTS `coleta_vw_cooperativa`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `coleta_vw_cooperativa` AS select `a`.`usuario_id` AS `usuario_id`,`a`.`usuario_datacadastro` AS `usuario_datacadastro`,`a`.`usuario_razaosocial` AS `usuario_razaosocial`,`a`.`usuario_nomefantasia` AS `usuario_nomefantasia`,`a`.`usuario_cnpj` AS `usuario_cnpj`,`a`.`usuario_inscricaoestadual` AS `usuario_inscricaoestadual`,`a`.`usuario_inscricaomunicipal` AS `usuario_inscricaomunicipal`,`a`.`usuario_representanteempresa` AS `usuario_representanteempresa`,`c`.`endereco_logradouro` AS `endereco_logradouro`,`c`.`endereco_numero` AS `endereco_numero`,`c`.`endereco_bairro` AS `endereco_bairro`,`c`.`endereco_complemento` AS `endereco_complemento`,`c`.`endereco_referencia` AS `endereco_referencia`,`c`.`endereco_municipio` AS `endereco_municipio`,`c`.`endereco_cep` AS `endereco_cep`,`c`.`endereco_uf` AS `endereco_uf`,`t`.`telefone_fixo` AS `telefone_fixo`,`t`.`telefone_empresarial` AS `telefone_empresarial`,`t`.`telefone_celular` AS `telefone_celular`,`e`.`email_empresarial` AS `email_empresarial`,`e`.`email_particular` AS `email_particular`,`l`.`login_nome` AS `login_nome`,`l`.`login_senha` AS `login_senha` from ((((`coleta_tb_dadousuario` `a` join `coleta_tb_endereco` `c` on((`c`.`usuario_id` = `a`.`usuario_id`))) join `coleta_tb_telefone` `t` on((`t`.`usuario_id` = `a`.`usuario_id`))) join `coleta_tb_email` `e` on((`e`.`usuario_id` = `a`.`usuario_id`))) join `coleta_tb_login` `l` on((`a`.`login_id` = `l`.`login_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `coleta_vw_dadousuario`
--

/*!50001 DROP VIEW IF EXISTS `coleta_vw_dadousuario`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `coleta_vw_dadousuario` AS select `a`.`usuario_id` AS `usuario_id`,`a`.`grupo_id` AS `grupo_id`,`a`.`usuario_nome` AS `usuario_nome`,`a`.`usuario_datacadastro` AS `usuario_datacadastro`,`a`.`usuario_cpf` AS `usuario_cpf`,`c`.`endereco_logradouro` AS `endereco_logradouro` from (((`coleta_tb_dadousuario` `a` join `coleta_tb_endereco` `c`) join `coleta_tb_email` `em`) join `coleta_tb_telefone` `tel`) where ((`a`.`usuario_id` = `c`.`usuario_id`) and (`a`.`usuario_id` = `em`.`usuario_id`) and (`a`.`usuario_id` = `tel`.`usuario_id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `coleta_vw_estatisticas`
--

/*!50001 DROP VIEW IF EXISTS `coleta_vw_estatisticas`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `coleta_vw_estatisticas` AS select `c`.`endereco_bairro` AS `endereco_bairro`,`b`.`solicitacao_quantidade` AS `solicitacao_quantidade`,`b`.`solicitacao_data` AS `solicitacao_data`,`b`.`solicitacao_tiporesiduo` AS `solicitacao_tiporesiduo` from ((`coleta_tb_dadousuario` `a` join `coleta_tb_solicitacao` `b`) join `coleta_tb_endereco` `c`) where ((`a`.`usuario_id` = `b`.`usuario_id`) and (`a`.`usuario_id` = `c`.`usuario_id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `feedback_vw`
--

/*!50001 DROP VIEW IF EXISTS `feedback_vw`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `feedback_vw` AS select `d`.`usuario_id` AS `usuario_id`,`d`.`usuario_nome` AS `usuario_nome`,`f`.`feedback_id` AS `feedback_id`,`f`.`feedback_qualificacao` AS `feedback_qualificacao`,`f`.`feedback_data` AS `feedback_data`,`f`.`feedback_critica` AS `feedback_critica`,`f`.`feedback_status` AS `feedback_status`,`f`.`feedback_resposta` AS `feedback_resposta` from (`coleta_tb_dadousuario` `d` join `coleta_tb_feedback` `f`) where (`d`.`usuario_id` = `f`.`usuario_id`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `solicitacao_vw_sol`
--

/*!50001 DROP VIEW IF EXISTS `solicitacao_vw_sol`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `solicitacao_vw_sol` AS select `d`.`usuario_id` AS `usuario_id`,`d`.`usuario_nome` AS `usuario_nome`,`s`.`solicitacao_id` AS `solicitacao_id`,`s`.`solicitacao_data` AS `solicitacao_data`,`s`.`solicitacao_descricao` AS `solicitacao_descricao`,`s`.`solicitacao_tiporesiduo` AS `solicitacao_tiporesiduo`,`s`.`solicitacao_quantidade` AS `solicitacao_quantidade`,`e`.`endereco_logradouro` AS `endereco_logradouro`,`e`.`endereco_numero` AS `endereco_numero`,`e`.`endereco_bairro` AS `endereco_bairro`,`e`.`endereco_municipio` AS `endereco_municipio`,`e`.`endereco_cep` AS `endereco_cep`,`t`.`telefone_celular` AS `telefone_celular` from (((`coleta_tb_dadousuario` `d` join `coleta_tb_solicitacao` `s` on((`s`.`usuario_id` = `d`.`usuario_id`))) join `coleta_tb_endereco` `e` on((`e`.`usuario_id` = `d`.`usuario_id`))) join `coleta_tb_telefone` `t` on((`t`.`usuario_id` = `d`.`usuario_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `solicitacao_vw_solic`
--

/*!50001 DROP VIEW IF EXISTS `solicitacao_vw_solic`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `solicitacao_vw_solic` AS select `d`.`usuario_id` AS `usuario_id`,`d`.`usuario_nome` AS `usuario_nome`,`s`.`solicitacao_id` AS `solicitacao_id`,`s`.`solicitacao_data` AS `solicitacao_data`,`s`.`solicitacao_descricao` AS `solicitacao_descricao`,`s`.`solicitacao_tiporesiduo` AS `solicitacao_tiporesiduo`,`e`.`endereco_id` AS `endereco_id`,`e`.`endereco_logradouro` AS `endereco_logradouro`,`e`.`endereco_numero` AS `endereco_numero`,`e`.`endereco_bairro` AS `endereco_bairro`,`e`.`endereco_municipio` AS `endereco_municipio`,`e`.`endereco_cep` AS `endereco_cep`,`t`.`telefone_celular` AS `telefone_celular` from (((`coleta_tb_dadousuario` `d` join `coleta_tb_solicitacao` `s` on((`s`.`usuario_id` = `d`.`usuario_id`))) join `coleta_tb_endereco` `e` on((`e`.`endereco_id` = `d`.`usuario_id`))) join `coleta_tb_telefone` `t` on((`t`.`usuario_id` = `d`.`usuario_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `solicitacao_wv`
--

/*!50001 DROP VIEW IF EXISTS `solicitacao_wv`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `solicitacao_wv` AS select `s`.`solicitacao_data` AS `solicitacao_data`,`s`.`solicitacao_descricao` AS `solicitacao_descricao`,`s`.`solicitacao_tiporesiduo` AS `solicitacao_tiporesiduo`,`c`.`usuario_nome` AS `usuario_nome`,`e`.`endereco_logradouro` AS `endereco_logradouro`,`e`.`endereco_numero` AS `endereco_numero`,`e`.`endereco_cep` AS `endereco_cep`,`e`.`endereco_municipio` AS `endereco_municipio`,`e`.`endereco_bairro` AS `endereco_bairro`,`t`.`telefone_celular` AS `telefone_celular` from (((`coleta_tb_solicitacao` `s` join `coleta_tb_dadousuario` `c`) join `coleta_tb_endereco` `e`) join `coleta_tb_telefone` `t`) where ((`c`.`usuario_id` = `s`.`usuario_id`) and (`c`.`usuario_id` = `e`.`usuario_id`) and (`c`.`usuario_id` = `t`.`usuario_id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-15 19:33:51
