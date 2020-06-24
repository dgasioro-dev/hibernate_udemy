-- create table PERSON (
--     id integer not null,
--     name varchar(255) not null,
--     location varchar(255),
--     birth_date timestamp,
--     primary key(id)
-- );

insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10001, 'Damian', 'Wrocław', sysdate());

insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10002, 'Joe', 'New York', sysdate());

insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10003, 'James', 'London', sysdate());