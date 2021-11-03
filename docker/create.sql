CREATE TABLE USERS_CUSTOM (
   id INT NOT NULL AUTO_INCREMENT,
   username VARCHAR(250) NOT NULL,
   password VARCHAR(250) NOT NULL,
   role VARCHAR(250) NOT NULL,
   PRIMARY KEY (id)
);


INSERT INTO USERS_CUSTOM (username, password, role)
values ('user','$2a$10$a07FaSKwo2xAwEj4UJYa0etu8sY5o9onG/0psQ2FxzjviueQUYnbm', 'ROLE_USER');

commit;