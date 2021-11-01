CREATE TABLE users (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  enabled TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (username)
);

CREATE TABLE authorities (
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users(username)
);

CREATE UNIQUE INDEX ix_auth_username on authorities (username,authority);

INSERT INTO users (username, password, enabled)
  values ('user','$2a$10$a07FaSKwo2xAwEj4UJYa0etu8sY5o9onG/0psQ2FxzjviueQUYnbm', 1);

INSERT INTO authorities (username, authority) values ('user', 'ROLE_USER');

commit;