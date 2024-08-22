package by.education.db;

import by.education.data.Player;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPlayerDatabase implements PlayerDatabase {
    private List<Player> playerList;

    public InMemoryPlayerDatabase() {
        playerList = new ArrayList<>();
        playerList.add(new Player("Rois", 34, "Germany", 1));
        playerList.add(new Player("Hleb", 38, "Belarus", 2));
        playerList.add(new Player("Mironchyk", 31, "Russia", 3));
        playerList.add(new Player("Bensema", 35, "France", 4));
        playerList.add(new Player("Lukaku", 33, "Belgium", 5));
        playerList.add(new Player("Donnarumma", 24, "Italy", 6));
        playerList.add(new Player("Jamal", 17, "Spain", 7));
        playerList.add(new Player("Messi", 36, "Argentina", 8));
    }

    @Override
    public List<Player> getPlayerList() {
        return playerList;
    }

    @Override
    public void addPlayer(Player player) {
        playerList.add(player);
    }

}
