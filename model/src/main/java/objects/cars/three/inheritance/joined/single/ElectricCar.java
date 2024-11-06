package objects.cars.three.inheritance.joined.single;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "3rd_electric_car")
@PrimaryKeyJoinColumn(name = "car_id")
@Table(name = "3rd_electric_car")
public class ElectricCar extends Car {

    @Column(name = "capacity")
    private Integer capacity;
}
