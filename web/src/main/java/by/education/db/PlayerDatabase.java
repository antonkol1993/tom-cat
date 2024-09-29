package by.education.db;

import by.education.data.Player;

import java.util.List;

public interface PlayerDatabase {

    List<Player> getPlayerList();

    Player getPlayerById(Integer id);

    void addPlayer(Player player);

    void removePlayer(int id) throws Exception;

    void editPlayer(int i, Player player) throws Exception;

}
