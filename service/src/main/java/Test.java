import objects.Person;
import objects.Player;
import service.PersonService;
import service.PlayerService;

import javax.xml.transform.Source;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        PersonService personService = PersonService.getInstance();
        PlayerService playerService = PlayerService.getInstance();
        List<Person> personList = personService.getPersonList();
        personList.forEach(System.out::println);
        List<Player> playerList = playerService.getPlayerList();
        playerList.forEach(System.out::println);
    }
}
