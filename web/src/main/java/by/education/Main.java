package by.education;


import by.education.db.connector.ConnectorToPersonDatabase;
import by.education.db.connector.ConnectorToPlayerDatabase;
import by.education.db.connector.IConnectortoDatabase;
import by.education.service.PlayerService;

public class Main  {
    public static void main(String[] args) throws Exception {


//        PlayerService instance = PlayerService.getInstance();
//        List<PlayerDatabase> playerList = instance.getPlayerList();
//        for (PlayerDatabase players : playerList) {
//            System.out.print(players.getId() + "\t");
//            System.out.print(players.getName() + "\t");
//            System.out.print(players.getAge() + "\t");
//            System.out.print(players.getCountry() + "\t");
//            System.out.print(players.getPosition() + "\t");
//            System.out.println();
//        }
//        instance.removePlayer(1);

//        PersonService instance = PersonService.getInstance();
//        List<PlayerDatabase> playerList = instance.getPlayerList();
//        for (PlayerDatabase players : playerList) {
//            System.out.print(players.getId() + "\t");
//            System.out.print(players.getName() + "\t");
//            System.out.print(players.getAge() + "\t");
//            System.out.print(players.getCountry() + "\t");
//            System.out.print(players.getPosition() + "\t");
//            System.out.println();
//        }
        IConnectortoDatabase connPerson = ConnectorToPersonDatabase.getInstance();
        IConnectortoDatabase connPlayer = ConnectorToPlayerDatabase.getInstance();

        PlayerService instance = PlayerService.getInstance();
        for (int i = 0; i <instance.getPlayerList().size(); i++) {
            System.out.println(instance.getPlayerList().get(i).getName());

        }

//        IConnectortoDatabase ConnectorPersonDB = ConnectortoDatabase.getInstance();
//        ConnectorPersonDB.getConnection();
//        System.out.println(ConnectorPersonDB.getConnection().getMetaData());
//        instance.removePlayer(1);

    }
}
