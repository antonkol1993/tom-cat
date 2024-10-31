package db;

import db.created.objects.CreatedObjects;
import db.database.PersonDatabaseDatabaseHibernate;
import db.database.PlayerDatabaseDatabaseHibernate;
import objects.Person;
import objects.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonDatabaseDatabaseHibernate personDatabaseDatabaseHibernate = PersonDatabaseDatabaseHibernate.getInstance();
//        personDatabaseDatabaseHibernate.createPersonsFromLocal(CreatedObjects.getLocalePersons());
        PlayerDatabaseDatabaseHibernate playerDatabaseDatabaseHibernate = PlayerDatabaseDatabaseHibernate.getInstance();
//        playerDatabaseDatabaseHibernate.createPlayersFromLocal(CreatedObjects.getLocalePlayers());

//        personDatabaseDatabaseHibernate.removePerson(2);
        List<Person> personList = personDatabaseDatabaseHibernate.getPersonList();
        List<Player> playerList = playerDatabaseDatabaseHibernate.getPlayerList();


        personList.forEach(System.out::println);
        playerList.forEach(System.out::println);

    }
}
