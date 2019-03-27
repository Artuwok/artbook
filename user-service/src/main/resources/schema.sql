CREATE TABLE IF NOT EXISTS users
(
  user_id    INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(50),
  last_name  VARCHAR(50)
);

INSERT INTO users (first_name, last_name)
VALUES ('John', 'Dou');
INSERT INTO users (first_name, last_name)
VALUES ('Art', 'Smith');