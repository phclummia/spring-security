
CREATE TABLE CustomerEntity (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  address varchar(255) DEFAULT NULL,
  name varchar(255) DEFAULT NULL,
  serviceRendered varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);


INSERT INTO CustomerEntity (address, name, serviceRendered)
values ('1111 foo blvd','Foo Industries', 'Important services');

INSERT INTO CustomerEntity (address, name, serviceRendered)
values ('2222 bar street','Bar LLP', 'Important services');

INSERT INTO CustomerEntity (address, name, serviceRendered)
values ('33 main street','Big LLC', 'Important services');

commit;