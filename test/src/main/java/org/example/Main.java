package org.example;

import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;
import objects.cars.four.inheritance.table_per_class.Car;
import objects.cars.four.inheritance.table_per_class.ElectricCar;
import objects.cars.four.inheritance.table_per_class.PetrolCar;
import objects.football.Player;
import objects.football.Team;

public class Main {
    public static void main(String[] args) throws Exception {

//        PetrolCar petrolCar1 = new PetrolCar().withModel("MMMMM").withBrand("WWWWWWW").withWorking(false);
//        ElectricCar electricCar1 = new ElectricCar().withModel("sadsad").withBrand("wqeeqeqw").withWorking(true);


        //todo 4th. TABLE PER CLASS
        Team teamManchester = new Team();
        teamManchester.setName("Manchester");

        Team teamReal = new Team();
        teamReal.setName("Real");

        Player player1 = new Player();
        player1.setName("Kolesnikov");
        player1.setTeam(teamReal);

        Player player2 = new Player();
        player2.setName("Narut");
        player2.setTeam(teamReal);

        Player player3 = new Player();
        player3.setName("Vasya");
        player3.setTeam(teamManchester);

        Player player4 = new Player();
        player4.setName("Petya");
        player4.setTeam(teamManchester);





        EntityManager entityManager = HibernateUtils.getHibernateEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(player1);
        entityManager.persist(player2);
        entityManager.persist(player3);
        entityManager.persist(player4);
        entityManager.persist(teamManchester);
        entityManager.persist(teamReal);


        entityManager.getTransaction().commit();


        //todo 4th


    }
}
