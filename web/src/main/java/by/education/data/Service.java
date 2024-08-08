package by.education.data;

import java.util.List;

public class Service {
    private static Service instance;
    PlayerList playerList = new PlayerList();

    private Service() {
    }

    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    public List<Player> getList() {
        return playerList.getPlayerArrayList();
    }

}
