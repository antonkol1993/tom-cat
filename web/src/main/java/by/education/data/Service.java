package by.education.data;

import java.util.List;

public class Service {
    private static Service instance;

    List<Player> playerList;

    private Service() {
        playerList = new PlayerList().getPlayerArrayList();
    }

    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    public List<Player> getList() {
        return playerList;
    }

}
