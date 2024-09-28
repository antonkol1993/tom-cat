create schema players;

create table players.players
(
    id       int auto_increment
        primary key,
    name     varchar(15) not null,
    age      int         not null,
    country  varchar(17) null,
    position varchar(20) not null
);

INSERT INTO players.players (name, age, country, position)
VALUES ('Rois',34,'Germany','Midfielder');
INSERT INTO players.players (name, age, country, position)
VALUES ('Hleb',38,'Belarus','Midfielder');
INSERT INTO players.players (name, age, country, position)
VALUES ('Mironchyk',29,'Russia','Midfielder');
INSERT INTO players.players (name, age, country, position)
VALUES ('Bensema',35,'France','forward');
INSERT INTO players.players (name, age, country, position)
VALUES ('Lukaku',33,'Belgium','forward');
INSERT INTO players.players (name, age, country, position)
VALUES ('Donnarumma',24,'Italy','Goalkeeper');
INSERT INTO players.players (name, age, country, position)
VALUES ('Jamal',17,'Spain','forward');
INSERT INTO players.players (name, age, country, position)
VALUES ('Messi',36,'Argentina','forward');
INSERT INTO players.players (name, age, country, position)
VALUES ('Kolesnikov',31,'South Africa','forward');
INSERT INTO players.players (name, age, country, position)
VALUES ('Narut',29,'Belarus','forward');
