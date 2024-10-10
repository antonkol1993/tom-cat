package by.education;


import by.education.db.connector.ConnectortoDatabase;
import by.education.db.connector.IConnectortoDatabase;

public class Main  {
    public static void main(String[] args) throws Exception {


//        PlayerService instance = PlayerService.getInstance();
//        List<PlayerDatabase> playerList = instance.getPlayerList();
//        for (PlayerDatabase player : playerList) {
//            System.out.print(player.getId() + "\t");
//            System.out.print(player.getName() + "\t");
//            System.out.print(player.getAge() + "\t");
//            System.out.print(player.getCountry() + "\t");
//            System.out.print(player.getPosition() + "\t");
//            System.out.println();
//        }
//        instance.removePlayer(1);

//        PersonService instance = PersonService.getInstance();
//        List<PlayerDatabase> playerList = instance.getPlayerList();
//        for (PlayerDatabase player : playerList) {
//            System.out.print(player.getId() + "\t");
//            System.out.print(player.getName() + "\t");
//            System.out.print(player.getAge() + "\t");
//            System.out.print(player.getCountry() + "\t");
//            System.out.print(player.getPosition() + "\t");
//            System.out.println();
//        }
        IConnectortoDatabase connectorToDatabase = ConnectortoDatabase.getInstance();
        connectorToDatabase.getConnection();
        System.out.println(connectorToDatabase.getConnection().getMetaData());
//        IConnectortoDatabase ConnectorPersonDB = ConnectortoDatabase.getInstance();
//        ConnectorPersonDB.getConnection();
//        System.out.println(ConnectorPersonDB.getConnection().getMetaData());
//        instance.removePlayer(1);

    }
}
