package org.example;

import org.example.football.Country;
import org.example.football.Game;
import org.example.football.League;
import org.example.football.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class createPlayersConsole {
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

        Game game1e = context.getBean("game1E", Game.class);
        Game game2e = context.getBean("game2E", Game.class);
        Game game3e = context.getBean("game3E", Game.class);

        Game game1s = context.getBean("game1S", Game.class);
        Game game2s = context.getBean("game2S", Game.class);
        Game game3s = context.getBean("game3S", Game.class);

        Game game1g = context.getBean("game1G", Game.class);
        Game game2g = context.getBean("game2G", Game.class);
        Game game3g = context.getBean("game3G", Game.class);

        Game game1f = context.getBean("game1F", Game.class);
        Game game2f = context.getBean("game2F", Game.class);
        Game game3f = context.getBean("game3F", Game.class);

        Game game1i = context.getBean("game1I", Game.class);
        Game game2i = context.getBean("game2I", Game.class);
        Game game3i = context.getBean("game3I", Game.class);

        Player player1Barcelona = context.getBean("player1Barcelona", Player.class);
        Player player2Barcelona = context.getBean("player2Barcelona", Player.class);
        Player player3Barcelona = context.getBean("player3Barcelona", Player.class);
        Player player1Real = context.getBean("player1Real", Player.class);
        Player player2Real = context.getBean("player2Real", Player.class);
        Player player3Real = context.getBean("player3Real", Player.class);


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

        game1e.extraInit();
        game2e.extraInit();
        game3e.extraInit();

        game1s.extraInit();
        game2s.extraInit();
        game3s.extraInit();

        game1g.extraInit();
        game2g.extraInit();
        game3g.extraInit();

        game1f.extraInit();
        game2f.extraInit();
        game3f.extraInit();

        game1i.extraInit();
        game2i.extraInit();
        game3i.extraInit();

        player1Barcelona.extraInit();
        player2Barcelona.extraInit();
        player3Barcelona.extraInit();

        player1Real.extraInit();
        player2Real.extraInit();
        player3Real.extraInit();



//        System.out.println(england);
//        System.out.println(spain);
//        System.out.println(germany);
//        System.out.println(france);
//        System.out.println(italy);




    }

}
