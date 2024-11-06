package objects.cars.four.inheritance.table_per_class;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "4th_petrol_car")
@Table(name = "4th_petrol_car")
public class PetrolCar extends Car {

    @Column(name = "value")
    private Double value;
}
