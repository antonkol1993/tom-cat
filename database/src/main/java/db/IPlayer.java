package db;

import objects.Player;
import objects.Player;

import java.util.List;

public interface IPlayer {

    List<Player> getPlayerList();

    Player getPlayerById(Integer id);

    void addPlayer(Player player);

    void removePlayer(int id) throws Exception;

    void editPlayer(int i, Player player) throws Exception;

}
