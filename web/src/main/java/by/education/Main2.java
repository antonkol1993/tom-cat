package by.education;

import by.education.data.Player;
import by.education.db.InMemoryPlayerDatabase;
import by.education.service.PlayerService;

public class Main2 {
    public static void main(String[] args) {
//        InMemoryPlayerDatabase inMemoryPlayerDatabase = new InMemoryPlayerDatabase();
//
//        inMemoryPlayerDatabase.addPlayer(new Player("Pique",26,"BELSDAA",21321));
//        inMemoryPlayerDatabase.addPlayer(new Player("Kane",36,"BELSDAA",21321));
//        inMemoryPlayerDatabase.addPlayer(new Player("Robinho",16,"BELSDAA",21321));
//        for (int i = 0; i < inMemoryPlayerDatabase.getPlayerList().size(); i++) {
//            Player player = inMemoryPlayerDatabase.getPlayerList().get(i);
//
//            System.out.print(player.getName());
//            System.out.print(",");
//            System.out.print(player.getAge());
//            System.out.print(",");
//            System.out.print(player.getCountry());
//            System.out.print(",");
//            System.out.print(player.getId());
//            System.out.println();
//        }

        PlayerService playerService = PlayerService.getInstance();
        playerService.getList();
        playerService.addPlayer(new Player("Pique",26,"BELSDAA",21321));
        playerService.addPlayer(new Player("Kane",36,"BELSDAA",21321));
        playerService.addPlayer(new Player("Robinho",16,"BELSDAA",21321));
        for (int i = 0; i < playerService.getList().size(); i++) {
            String name = playerService.getList().get(i).getName();
            Integer age = playerService.getList().get(i).getAge();
            String country = playerService.getList().get(i).getCountry();
            Integer id1 = playerService.getList().get(i).getId();
            System.out.println(name + "," + age + "," + country + "," + id1);
        }



    }
}
