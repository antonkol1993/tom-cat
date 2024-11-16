package org.example.lesson;

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


        ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
        SenderService service = context.getBean("senderService", SenderService.class);
        service.send("Hello World");

    }

}
