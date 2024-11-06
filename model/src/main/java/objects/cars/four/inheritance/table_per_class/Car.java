package objects.cars.four.inheritance.table_per_class;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "4th_car")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "4th_car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private String model;

    private String brand;

    private boolean isWorking;

}
