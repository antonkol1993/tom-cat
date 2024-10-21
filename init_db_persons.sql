create schema my_schema;

create table my_schema.persons
(
    Id       int auto_increment
        primary key,
    Username     varchar(15) not null UNIQUE ,
    Password  varchar(17) not null,
    Role varchar(20) not null
);

INSERT INTO my_schema.persons (Username, Password, Role)
VALUES ('Anton','KOLESNIKOV','user');
INSERT INTO my_schema.persons (Username, Password, Role)
VALUES ('Messii','KOLESNIKOV','user');
INSERT INTO my_schema.persons (Username, Password, Role)
VALUES ('admin','admin','admin');
INSERT INTO my_schema.persons (Username, Password, Role)
VALUES ('user','user','user');
INSERT INTO my_schema.persons (Username, Password, Role)
VALUES ('narut','narut','admin');
INSERT INTO my_schema.persons (Username, Password, Role)
VALUES ('chamPion','kOlesnik-0v','user');

