package db;

import objects.Player;

import java.util.List;

public interface IPlayerDatabase {

    List<Player> getPlayerList();

    Player getPlayerById(Integer id);

    void addPlayer(Player player) throws Exception;

    void removePlayer(int id) throws Exception;

    void editPlayer(int id, Player player) throws Exception;

}
