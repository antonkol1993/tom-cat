create schema my_schema;

create table my_schema.players
(
    id       int auto_increment
        primary key,
    name     varchar(15) not null,
    age      int         not null,
    country  varchar(17) null,
    position varchar(20) not null
);

INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Rois',34,'Germany','Midfielder');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Hleb',38,'Belarus','Midfielder');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Mironchyk',29,'Russia','Midfielder');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Bensema',35,'France','forward');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Lukaku',33,'Belgium','forward');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Donnarumma',24,'Italy','Goalkeeper');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Jamal',17,'Spain','forward');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Messi',36,'Argentina','forward');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Kolesnikov',31,'South Africa','forward');
INSERT INTO my_schema.players (name, age, country, position)
VALUES ('Narut',29,'Belarus','forward');


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
