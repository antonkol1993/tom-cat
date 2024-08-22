package by.education.db;

import by.education.data.Player;

import java.util.Arrays;
import java.util.List;

public class InMemoryPlayerDatabase implements PlayerDatabase {

    private static List<Player> playerList = Arrays.asList(
            new Player("Rois", 34, "Germany",1),
            new Player("Hleb", 38, "Belarus",2),
            new Player("Mironchyk", 31, "Russia",3),
            new Player("Bensema", 35, "France",4),
            new Player("Lukaku", 33, "Belgium",5),
            new Player("Donnarumma", 24, "Italy",6),
            new Player("Jamal", 17, "Spain",7),
            new Player("Messi", 36, "Argentina",8)
    );

    @Override
    public List <Player> getPlayerList() {
        return playerList;
    }

    @Override
    public void addPlayer(Player player) {
        playerList.add(player);
    }

}
