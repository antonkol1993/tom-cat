package org.example;

import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;
import objects.cars.four.inheritance.table_per_class.Car;
import objects.cars.four.inheritance.table_per_class.ElectricCar;
import objects.cars.four.inheritance.table_per_class.PetrolCar;

public class Main4TablePerClass {
    public static void main(String[] args) {

//        PetrolCar petrolCar1 = new PetrolCar().withModel("MMMMM").withBrand("WWWWWWW").withWorking(false);
//        ElectricCar electricCar1 = new ElectricCar().withModel("sadsad").withBrand("wqeeqeqw").withWorking(true);


        //todo 4th. TABLE PER CLASS

        Car car = new Car();
        car.setWorking(true);
        car.setBrand("Mercedes");
        car.setModel("AMG Engineering");

        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setValue(3.8);

        ElectricCar electricCar = new ElectricCar();
        electricCar.setCapacity(120);

        EntityManager entityManager = HibernateUtils.getHibernateEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.persist(petrolCar);
        entityManager.persist(electricCar);
        entityManager.getTransaction().commit();
        entityManager.close();


        //todo 4th


    }
}
