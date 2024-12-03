import objects.Person;
import objects.Player;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.PersonService;
import service.PlayerService;

import javax.xml.transform.Source;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        PersonService personServiceBean = context.getBean("personServ", PersonService.class);
        List<Person> personList = personServiceBean.getPersonList();
        for (Person person : personList) {
            System.out.println(person);
        }

    }
}
