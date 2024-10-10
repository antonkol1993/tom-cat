package by.education.db.memory;

import by.education.data.objects.Player;
import by.education.db.IPlayer;

import java.util.ArrayList;
import java.util.List;

public class PlayerMemory implements IPlayer {
    private final List<Player> playerList;

    public PlayerMemory() {
        playerList = new ArrayList<>();
        playerList.add(new Player("Rois", 34, "Germany", 1, "defender"));
        playerList.add(new Player("Hleb", 38, "Belarus", 2, "defender"));
        playerList.add(new Player("Mironchyk", 31, "Russia", 3, "defender"));
        playerList.add(new Player("Bensema", 35, "France", 4, "defender"));
        playerList.add(new Player("Lukaku", 33, "Belgium", 5, "defender"));
        playerList.add(new Player("Donnarumma", 24, "Italy", 6, "defender"));
        playerList.add(new Player("Jamal", 17, "Spain", 7, "defender"));
        playerList.add(new Player("Messi", 36, "Argentina", 8, "defender"));
    }

    @Override
    public List<Player> getPlayerList() {
        return playerList;
    }

    @Override
    public Player getPlayerById(Integer id) {
        return null;
    }

    @Override
    public void addPlayer(Player player) {
        playerList.add(player);
    }

    @Override
    public void removePlayer(int e) {
            playerList.remove(e);
        }

    @Override
    public void editPlayer(int i, Player player) {
        playerList.set(i,player);
    }

}
