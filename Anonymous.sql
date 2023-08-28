-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema anonymous
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema anonymous
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `anonymous` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `anonymous` ;

-- -----------------------------------------------------
-- Table `anonymous`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `anonymous`.`user` (
  `ID` VARCHAR(255) NULL DEFAULT NULL,
  `Password` VARCHAR(255) NULL DEFAULT NULL,
  `AI_ID` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`AI_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `anonymous`.`board`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `anonymous`.`board` (
  `AI_ID` INT NOT NULL AUTO_INCREMENT,
  `Title` VARCHAR(255) NULL DEFAULT NULL,
  `Content` VARCHAR(255) NULL DEFAULT NULL,
  `ViewCount` INT NULL DEFAULT NULL,
  `User_AI_ID` INT NULL DEFAULT NULL,
  `date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `HitCount` INT NULL DEFAULT NULL,
  PRIMARY KEY (`AI_ID`),
  INDEX `fk_Board_User_idx` (`User_AI_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Board_User`
    FOREIGN KEY (`User_AI_ID`)
    REFERENCES `anonymous`.`user` (`AI_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `anonymous`.`article`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `anonymous`.`article` (
  `AI_Id` INT NOT NULL AUTO_INCREMENT,
  `Content` VARCHAR(255) NULL DEFAULT NULL,
  `Board_AI_ID` INT NULL DEFAULT NULL,
  `User_AI_ID` INT NULL DEFAULT NULL,
  `date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `HitCount` INT NULL DEFAULT NULL,
  PRIMARY KEY (`AI_Id`),
  INDEX `fk_Article_Board1_idx` (`Board_AI_ID` ASC) VISIBLE,
  INDEX `fk_Article_User1_idx` (`User_AI_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Article_Board1`
    FOREIGN KEY (`Board_AI_ID`)
    REFERENCES `anonymous`.`board` (`AI_ID`),
  CONSTRAINT `fk_Article_User1`
    FOREIGN KEY (`User_AI_ID`)
    REFERENCES `anonymous`.`user` (`AI_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `anonymous`.`article_hit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `anonymous`.`article_hit` (
  `User_AI_ID` INT NULL DEFAULT NULL,
  `Article_AI_Id` INT NULL DEFAULT NULL,
  INDEX `fk_Article_Hit_Article1_idx` (`Article_AI_Id` ASC) VISIBLE,
  INDEX `fk_Article_Hit_User1` (`User_AI_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Article_Hit_Article1`
    FOREIGN KEY (`Article_AI_Id`)
    REFERENCES `anonymous`.`article` (`AI_Id`),
  CONSTRAINT `fk_Article_Hit_User1`
    FOREIGN KEY (`User_AI_ID`)
    REFERENCES `anonymous`.`user` (`AI_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `anonymous`.`board_hit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `anonymous`.`board_hit` (
  `User_AI_ID` INT NULL DEFAULT NULL,
  `Board_AI_ID` INT NULL DEFAULT NULL,
  INDEX `fk_Board_Hit_Board1_idx` (`Board_AI_ID` ASC) VISIBLE,
  INDEX `fk_Board_Hit_User1` (`User_AI_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Board_Hit_Board1`
    FOREIGN KEY (`Board_AI_ID`)
    REFERENCES `anonymous`.`board` (`AI_ID`),
  CONSTRAINT `fk_Board_Hit_User1`
    FOREIGN KEY (`User_AI_ID`)
    REFERENCES `anonymous`.`user` (`AI_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
