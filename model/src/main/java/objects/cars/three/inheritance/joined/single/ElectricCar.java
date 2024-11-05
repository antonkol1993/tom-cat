package objects.cars.three.inheritance.joined.single;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity(name = "3st_electric_car")
//@PrimaryKeyJoinColumn(name = "car_id")
//@Table(name = "3st_electric_car")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "three_tutor")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "three_tutor")
public class ElectricCar extends Car {

    @Column(name = "capacity")
    private Integer capacity;

}
