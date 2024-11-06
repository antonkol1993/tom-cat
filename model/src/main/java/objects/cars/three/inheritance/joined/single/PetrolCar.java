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
@Entity(name = "3rd_petrol_car")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "3rd_petrol_car")
public class PetrolCar extends Car {

    @Column(name = "value")
    private Double value;
}
