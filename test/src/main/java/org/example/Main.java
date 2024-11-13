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


        EntityManager carsEntityManager = HibernateUtils.getTestEntityManager()
                ;



    }
}
