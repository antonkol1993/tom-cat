package by.education.db;

import by.education.data.Player;
import by.education.service.InitDataFromDB;
import by.education.service.PersonService;
import by.education.service.PlayerService;

import java.util.List;

public class DbPlayerDatabase implements PlayerDatabase {

    List<Player> playerList = getPlayerList();
    PlayerService playerService;

    private List<Player> initPlayersFromDB() throws Exception {
        return new InitDataFromDB().initPlayers();
    };

    @Override
    public List<Player> getPlayerList() {
        try {
            return initPlayersFromDB();
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
        playerList.add(player);
    }

    @Override
    public void removePlayer(int id) throws Exception {
        playerService.deletePlayer(id);
    }

    @Override
    public void editPlayer(int i, Player player) throws Exception {
        String name = player.getName();
        Integer age = player.getAge();
        String country = player.getCountry();
        String position = player.getPosition();
        playerService.editPlayer(i,name,age,country,position);
    }
}
