CREATE TABLE `testingplus`.`test_case` (
  `ID_TEST_CASE` INT NOT NULL AUTO_INCREMENT,
  `TEST_CASE_NAME` VARCHAR(255) NOT NULL,
  `TEST_CASE_CREATION_DATE` DATETIME NOT NULL,
  `IS_REGRESSIVE` BIT(1) NOT NULL,
  `ASSIGNED_TASK` INT NULL,
  PRIMARY KEY (`ID_TEST_CASE`),
  UNIQUE INDEX `TEST_CASE_NAME_UNIQUE` (`TEST_CASE_NAME` ASC));
