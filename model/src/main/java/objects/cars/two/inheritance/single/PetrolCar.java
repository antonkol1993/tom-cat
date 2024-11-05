package objects.cars.two.inheritance.single;

import jakarta.persistence.*;
import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity()
@DiscriminatorValue("P")
@With
public class PetrolCar extends Car {

    @Column(name = "value")
    private Double value;

}