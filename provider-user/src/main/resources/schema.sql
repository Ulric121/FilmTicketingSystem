DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id       BIGINT(20) NOT NULL AUTO_INCREMENT,
  username VARCHAR(40)         DEFAULT NULL,
  name     VARCHAR(20)         DEFAULT NULL,
  age      INT(3)              DEFAULT NULL,
  balance  DECIMAL(10, 2)      DEFAULT NULL,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;