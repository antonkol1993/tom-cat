package objects.mapping.four;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "four_user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "four_user")
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;

}
