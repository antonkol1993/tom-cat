package by.education.objects;

import by.education.constants.UsersRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@With
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column()
    private String userName;
    @Column
    private String password;
    @Column
    private UsersRole userRole;

}
