package db;

import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;
import objects.cars.two.inheritance.single.ElectricCar;
import objects.cars.two.inheritance.single.PetrolCar;
import objects.cars.two.inheritance.single.Car;

public class Main2 {
    public static void main(String[] args) throws Exception {

//        PetrolCar petrolCar1 = new PetrolCar().withModel("MMMMM").withBrand("WWWWWWW").withWorking(false);
//        ElectricCar electricCar1 = new ElectricCar().withModel("sadsad").withBrand("wqeeqeqw").withWorking(true);



        //todo 2st-4th. Need export different paths for objects

        Car car = new Car();
        car.setWorking(true);
        car.setBrand("Mercedes");
        car.setModel("AMG Engineering");

        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setWorking(true);
        petrolCar.setBrand("BMW");
        petrolCar.setModel("M5");
        petrolCar.setValue(3.8);

        ElectricCar electricCar = new ElectricCar();
        electricCar.setWorking(true);
        electricCar.setBrand("TESLA");
        electricCar.setModel("Model S");
        electricCar.setCapacity(120);

        EntityManager entityManager = HibernateUtils.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.persist(petrolCar);
        entityManager.persist(electricCar);
        entityManager.getTransaction().commit();
        entityManager.close();



        //todo 4th




    }
}
