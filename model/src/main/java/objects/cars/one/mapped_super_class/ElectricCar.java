package objects.cars.one.mapped_super_class;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "1st_electric_car")
@Table()
@With
public class ElectricCar extends Car{

    @Column(name = "capacity")
    private Integer capacity;

}