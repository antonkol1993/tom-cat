package db;

import db.created.objects.CreatedObjects;
import db.database.PersonDatabaseDatabaseHibernate;
import db.database.PlayerDatabaseDatabaseHibernate;
import objects.Person;
import objects.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        PersonDatabaseDatabaseHibernate personDatabaseDatabaseHibernate = PersonDatabaseDatabaseHibernate.getInstance();
//        personDatabaseDatabaseHibernate.createPersonsFromLocal(CreatedObjects.getLocalePersons());
        PlayerDatabaseDatabaseHibernate playerDatabaseDatabaseHibernate = PlayerDatabaseDatabaseHibernate.getInstance();
//        playerDatabaseDatabaseHibernate.createPlayersFromLocal(CreatedObjects.getLocalePlayers());

//        personDatabaseDatabaseHibernate.removePerson(2);


//        List<Person> personList = personDatabaseDatabaseHibernate.getPersonList();
//        personList.forEach(System.out::println);
//        playerList.forEach(System.out::println);
        Player player = new Player().withName("1111111")
                .withRating("111111")
                .withId(1111)
                .withAge(111111)
                .withPosition("111111111")
                .withCountry("111111111");
        playerDatabaseDatabaseHibernate.editPlayer(5, player);
        List<Player> playerList = playerDatabaseDatabaseHibernate.getPlayerList();
        playerList.forEach(System.out::println);
    }
}
