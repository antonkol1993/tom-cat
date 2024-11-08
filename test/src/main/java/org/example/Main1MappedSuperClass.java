package org.example;

import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;
import objects.cars.one.mapped_super_class.ElectricCar;
import objects.cars.one.mapped_super_class.PetrolCar;

public class Main1MappedSuperClass {
    public static void main(String[] args) throws Exception {

//        PetrolCar petrolCar1 = new PetrolCar().withModel("MMMMM").withBrand("WWWWWWW").withWorking(false);
//        ElectricCar electricCar1 = new ElectricCar().withModel("sadsad").withBrand("wqeeqeqw").withWorking(true);

        //todo 1st. Mapped Super Class
        PetrolCar petrolCar1 = new PetrolCar();
        ElectricCar electricCar1 = new ElectricCar();
        electricCar1.setBrand("electro");
        electricCar1.setModel("TESLA");
        electricCar1.setWorking(true);
        electricCar1.setCapacity(1000);

        petrolCar1.setBrand("Mercedes>");
        petrolCar1.setModel("s500");
        petrolCar1.setWorking(false);
        petrolCar1.setValue(3.2);
        EntityManager entityManager = HibernateUtils.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(petrolCar1);
        entityManager.persist(electricCar1);
        entityManager.getTransaction().commit();

        //todo 2st-4th. Need export different paths for objects

//        Car car = new Car();
//        car.setWorking(true);
//        car.setBrand("Mercedes");
//        car.setModel("AMG Engineering");
//
//        PetrolCar petrolCar = new PetrolCar();
//        petrolCar.setWorking(true);
//        petrolCar.setBrand("BMW");
//        petrolCar.setModel("M5");
//        petrolCar.setValue(3.8);
//
//        ElectricCar electricCar = new ElectricCar();
//        electricCar.setWorking(true);
//        electricCar.setBrand("TESLA");
//        electricCar.setModel("Model S");
//        electricCar.setCapacity(120);

//        EntityManager entityManager = HibernateUtils.getEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(car);
//        entityManager.persist(petrolCar);
//        entityManager.persist(electricCar);
//        entityManager.getTransaction().commit();
//        entityManager.close();


        //todo 4th


    }
}
