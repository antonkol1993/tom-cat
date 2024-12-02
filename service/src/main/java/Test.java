import objects.Person;
import objects.Player;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PersonService;
import service.PlayerService;

import javax.xml.transform.Source;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(PersonService.class);
        context.refresh();
        PersonService personService = context.getBean(PersonService.class);
        List<Person> personList = personService.getPersonList();
        for (Person person : personList) {
            System.out.println(person);
        }

    }
}
