CREATE TABLE IF NOT EXISTS users
(
  user_id    INT(20) NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(50),
  last_name  VARCHAR(50),
  PRIMARY KEY (user_id)
);