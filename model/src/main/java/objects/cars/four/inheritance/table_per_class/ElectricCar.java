package objects.cars.four.inheritance.table_per_class;

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
@Entity(name = "4th_electric_car")
@Table(name = "4th_electric_car")
public class ElectricCar extends Car {

    @Column(name = "capacity")
    private Integer capacity;
}
