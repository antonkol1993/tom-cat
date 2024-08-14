package by.education.db;

import by.education.data.Player;

import java.util.Arrays;
import java.util.List;

public class InMemoryPlayerDatabase implements PlayerDatabase {

    private List<Player> playerList = Arrays.asList(
            new Player("Rois", 34, "Germany"),
            new Player("Hleb", 38, "Belarus"),
            new Player("Mironchyk", 31, "Russia"),
            new Player("Bensema", 35, "France"),
            new Player("Lukaku", 33, "Belgium"),
            new Player("Donnarumma", 24, "Italy"),
            new Player("Jamal", 17, "Spain"),
            new Player("Messi", 36, "Argentina")
    );

    @Override
    public List <Player> getPlayerList() {
        return playerList;
    }

    @Override
    public void addPlayer(Player player) {

    }

}
