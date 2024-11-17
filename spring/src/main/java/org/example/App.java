package org.example;

import org.example.football.Country;
import org.example.football.League;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ConsoleSender consoleSender = new ConsoleSender();
//        SenderService senderService = new SenderService(consoleSender);
//
//        senderService.send("Hello World");


//        ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
//        SenderService service = context.getBean("senderService", SenderService.class);
//        service.send("Hello World");


        ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
//        italy.init(italy.getName());
        Country england = context.getBean("england", Country.class);
        Country spain = context.getBean("spain", Country.class);
        Country germany = context.getBean("germany", Country.class);
        Country france = context.getBean("france", Country.class);
        Country italy = context.getBean("italy", Country.class);

        League englishLeague = context.getBean("englishLeague", League.class);
        League spanishLeague = context.getBean("spanishLeague", League.class);
        League germanLeague = context.getBean("germanLeague", League.class);
        League frenchLeague = context.getBean("frenchLeague", League.class);
        League italianLeague = context.getBean("italianLeague", League.class);

        englishLeague.extraInit();
        spanishLeague.extraInit();
        germanLeague.extraInit();
        frenchLeague.extraInit();
        italianLeague.extraInit();

        england.extraInit();
        spain.extraInit();
        germany.extraInit();
        france.extraInit();
        italy.extraInit();


//        System.out.println(england);
//        System.out.println(spain);
//        System.out.println(germany);
//        System.out.println(france);
//        System.out.println(italy);




    }

}
