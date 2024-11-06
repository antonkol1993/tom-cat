package db.created.objects;

import constants.UsersRole;
import objects.Person;
import objects.Player;

import java.util.List;

public class CreatedObjects {
    public static List<Person> getLocalePersons() {
        return List.of(
                new Person().withUserName("Anton").withPassword("adswqeeqw").withUserRole(UsersRole.USER),
                new Person().withUserName("Andrey").withPassword("Andrey").withUserRole(UsersRole.ADMIN),
                new Person().withUserName("Narut").withPassword("naRUT").withUserRole(UsersRole.ADMIN),
                new Person().withUserName("Kolesnikov").withPassword("koleson").withUserRole(UsersRole.USER),
                new Person().withUserName("Messi").withPassword("dasaweq").withUserRole(UsersRole.USER),
                new Person().withUserName("uBIVATOR-3000").withPassword("destoyer").withUserRole(UsersRole.USER)
        );
    }

    public static List<Player> getLocalePlayers() {
        return List.of(
                new Player().withName("Messi").withAge(35).withCountry("Argentina").withPosition("Forward").withRating("91"),
                new Player().withName("Rois").withAge(34).withCountry("Germany").withPosition("Midfielder").withRating("59"),
                new Player().withName("Hleb").withAge(38).withCountry("Belarus").withPosition("Midfielder").withRating("47"),
                new Player().withName("Mironchyk").withAge(29).withCountry("Russia").withPosition("Forward").withRating("53"),
                new Player().withName("Bensema").withAge(35).withCountry("France").withPosition("Forward").withRating("69"),
                new Player().withName("Lukaku").withAge(33).withCountry("Belgium").withPosition("Forward").withRating("57"),
                new Player().withName("Donnarumma").withAge(35).withCountry("Italy").withPosition("Goalkeeper").withRating("83"),
                new Player().withName("Narut").withAge(23).withCountry("USA").withPosition("Forward").withRating("96")

        );
    }

    public static List<Object> getCar() {
        return List.of(
                new Player().withName("Messi").withAge(35).withCountry("Argentina").withPosition("Forward").withRating("91"),
                new Player().withName("Rois").withAge(34).withCountry("Germany").withPosition("Midfielder").withRating("59"),
                new Player().withName("Hleb").withAge(38).withCountry("Belarus").withPosition("Midfielder").withRating("47"),
                new Player().withName("Mironchyk").withAge(29).withCountry("Russia").withPosition("Forward").withRating("53"),
                new Player().withName("Bensema").withAge(35).withCountry("France").withPosition("Forward").withRating("69"),
                new Player().withName("Lukaku").withAge(33).withCountry("Belgium").withPosition("Forward").withRating("57"),
                new Player().withName("Donnarumma").withAge(35).withCountry("Italy").withPosition("Goalkeeper").withRating("83"),
                new Player().withName("Narut").withAge(23).withCountry("USA").withPosition("Forward").withRating("96")

        );
    }


}
