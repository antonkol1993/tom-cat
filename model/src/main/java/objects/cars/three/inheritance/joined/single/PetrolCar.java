package objects.cars.three.inheritance.joined.single;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;
import objects.cars.one.mapped_super_class.Car;


//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity(name = "3st_petrol_car")
//@PrimaryKeyJoinColumn(name = "car_id")
//@Table(name = "3st_petrol_car")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "three_student")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "three_student")
public class PetrolCar extends Car {

    @Column(name = "value")
    private Double value;

}