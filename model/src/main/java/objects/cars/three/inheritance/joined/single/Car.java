package objects.cars.three.inheritance.joined.single;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity(name = "3st_car")
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name = "3st_car")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "three_user")
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "three_user")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "model")
    private String model;

    @Column(name = "brand")
    private String brand;

    @Column(name = "working")
    private boolean isWorking;

}

