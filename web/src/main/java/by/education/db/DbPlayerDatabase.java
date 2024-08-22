package by.education.db;

import by.education.data.Player;

import java.util.List;

public class DbPlayerDatabase implements PlayerDatabase {

    @Override
    public List<Player> getPlayerList() {
        return List.of();
    }

    @Override
    public void addPlayer(Player player) {
    }
}
