package by.education.db;

import by.education.data.Player;
import by.education.service.db.AddFromDB;
import by.education.service.db.InitDataFromDB;
import by.education.service.PlayerService;
import by.education.service.db.RemoveFromDB;

import java.util.List;

public class DbPlayerDatabase implements PlayerDatabase {

    List<Player> playerList = getPlayerList();
    PlayerService playerService;

    @Override
    public List<Player> getPlayerList() {
        try {
            return new InitDataFromDB().initPlayers();
        } catch (Exception e) {
            throw new RuntimeException("Database error", e);
        }
    }

    @Override
    public Player getPlayerById(Integer id) {
        return null;
    }

    @Override
    public void addPlayer(Player player) {
        new AddFromDB().addFromDB(player);
    }




    @Override
    public void removePlayer(int id) {
        try {
            new RemoveFromDB().removeFromDB(id);
        } catch (Exception e) {
            throw new RuntimeException("Database error", e);
        }
    }


    @Override
    public void editPlayer(int i, Player player) {
        String name = player.getName();
        Integer age = player.getAge();
        String country = player.getCountry();
        String position = player.getPosition();
        playerService.editPlayer(i,name,age,country,position);
    }
}
