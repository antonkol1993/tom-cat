create schema persons;

create table persons.persons
(
    Id       int auto_increment
        primary key,
    Username     varchar(15) not null,
    Password  varchar(17) not null,
    Role varchar(20) not null
);

INSERT INTO persons.persons (Username, Password, Role)
VALUES ('Anton','KOLESNIKOV','user');
INSERT INTO persons.persons (Username, Password, Role)
VALUES ('Messii','KOLESNIKOV','user');
INSERT INTO persons.persons (Username, Password, Role)
VALUES ('admin','admin','admin');
INSERT INTO persons.persons (Username, Password, Role)
VALUES ('user','user','user');
INSERT INTO persons.persons (Username, Password, Role)
VALUES ('narut','narut','admin');
INSERT INTO persons.persons (Username, Password, Role)
VALUES ('chamPion','kOlesnik-0v','user');

