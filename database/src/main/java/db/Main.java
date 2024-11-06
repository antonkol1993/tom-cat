package db;

import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;
import objects.cars.four.inheritance.table_per_class.Car;
import objects.cars.four.inheritance.table_per_class.ElectricCar;
import objects.cars.four.inheritance.table_per_class.PetrolCar;

public class Main {
    public static void main(String[] args) throws Exception {

//        PetrolCar petrolCar1 = new PetrolCar().withModel("MMMMM").withBrand("WWWWWWW").withWorking(false);
//        ElectricCar electricCar1 = new ElectricCar().withModel("sadsad").withBrand("wqeeqeqw").withWorking(true);


        //todo 4th. TABLE PER CLASS


        EntityManager entityManager = HibernateUtils.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();


        //todo 4th


    }
}
