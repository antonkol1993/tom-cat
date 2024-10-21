create schema my_schema;

create table my_schema.players
(
    id       int auto_increment
        primary key,
    name     varchar(15) not null,
    age      int         not null,
    country  varchar(17) null,
    position varchar(20) not null,
    rating varchar(20) null
);

INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Rois',34,'Germany','Midfielder','59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Hleb',38,'Belarus','Midfielder','59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Mironchyk',29,'Russia','Midfielder','59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Bensema',35,'France','forward', '59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Lukaku',33,'Belgium','forward', '59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Donnarumma',24,'Italy','Goalkeeper', '59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Jamal',17,'Spain','forward', '59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Messi',36,'Argentina','forward', '59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Kolesnikov',31,'South Africa','forward', '59');
INSERT INTO my_schema.players (name, age, country, position, rating)
VALUES ('Narut',29,'Belarus','forward', '59');


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
