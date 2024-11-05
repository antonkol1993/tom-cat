package db;

import constants.UsersRole;
import db.connector.HibernateUtils;
import db.created.objects.CreatedObjects;
import db.database.PersonDatabaseDatabaseHibernate;
import db.database.PlayerDatabaseDatabaseHibernate;
import jakarta.persistence.EntityManager;
import objects.Person;
import objects.Player;
import objects.cars.one.mapped_super_class.Car;
import objects.cars.one.mapped_super_class.ElectricCar;
import objects.cars.one.mapped_super_class.PetrolCar;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

//        PetrolCar petrolCar1 = new PetrolCar().withModel("MMMMM").withBrand("WWWWWWW").withWorking(false);
//        ElectricCar electricCar1 = new ElectricCar().withModel("sadsad").withBrand("wqeeqeqw").withWorking(true);

//        PetrolCar petrolCar1 = new PetrolCar();
//        ElectricCar electricCar1 = new ElectricCar();
//        electricCar1.setBrand("electro");
//        electricCar1.setModel("TESLA");
//        electricCar1.setWorking(true);
//        electricCar1.setCapacity(1000);
//
//        petrolCar1.setBrand("Mercedes>");
//        petrolCar1.setModel("s500");
//        petrolCar1.setWorking(false);
//        petrolCar1.setValue(3.2);
//        EntityManager entityManager = HibernateUtils.getEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(petrolCar1);
//        entityManager.persist(electricCar1);
//        entityManager.getTransaction().commit();





    }
}
