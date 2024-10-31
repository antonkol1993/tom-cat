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

        playerDatabaseDatabaseHibernate.addPlayer(new Player().withAge(999).withName("EEQQEEQ"));
        List<Player> playerList = playerDatabaseDatabaseHibernate.getPlayerList();
        playerList.forEach(System.out::println);
    }
}
