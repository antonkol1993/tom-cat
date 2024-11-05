package objects.cars.two.inheritance;


import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity()
@DiscriminatorValue("E")
@With
public class ElectricCar extends Car {


    @Column(name = "capacity")
    private Integer capacity;

}
