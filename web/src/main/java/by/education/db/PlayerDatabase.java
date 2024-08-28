package by.education.db;

import by.education.data.Player;

import java.util.List;

public interface PlayerDatabase {

    List<Player> getPlayerList();

    void addPlayer(Player player);
    void removePlayer(int id);
}
