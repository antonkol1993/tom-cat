package org.example;

import db.connector.HibernateUtils;
import db.created.objects.CreatedObjects;
import jakarta.persistence.EntityManager;

public class MainForPlayerPerson {
    public static void main(String[] args) throws Exception {

//        PetrolCar petrolCar1 = new PetrolCar().withModel("MMMMM").withBrand("WWWWWWW").withWorking(false);
//        ElectricCar electricCar1 = new ElectricCar().withModel("sadsad").withBrand("wqeeqeqw").withWorking(true);


        EntityManager playerPersonEntityManager = HibernateUtils.getPlayerPersonEntityManager();
        playerPersonEntityManager.getTransaction().begin();

        //todo create persons // DB players_persons
//        for (int i = 0; i < CreatedObjects.getLocalePersons().size(); i++) {
//            playerPersonEntityManager.persist(CreatedObjects.getLocalePersons().get(i));
//        }
//        playerPersonEntityManager.getTransaction().commit();

        //todo create players // DB players_persons
//        for (int i = 0; i < CreatedObjects.getLocalePlayers().size(); i++) {
//            playerPersonEntityManager.persist(CreatedObjects.getLocalePlayers().get(i));
//        }
//        playerPersonEntityManager.getTransaction().commit();


    }
}
