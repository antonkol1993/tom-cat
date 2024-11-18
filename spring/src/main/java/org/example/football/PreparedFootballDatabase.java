package org.example.football;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PreparedFootballDatabase {

    public static List< ? extends Football> getFootballObjects(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
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

        return List.of(
                england,spain,germany,france,italy,
                englishLeague,spanishLeague,germanLeague,frenchLeague,italianLeague,
                game1e,game2e,game3e,
                game1s,game2s,game3s,
                game1g,game2g,game3g,
                game1f,game2f,game3f,
                game1i,game2i,game3i,
                player1Barcelona, player2Barcelona, player3Barcelona,
                player1Real, player2Real, player3Real
        );
    }
}
