package model;

import by.education.constants.UsersRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name", unique = true, nullable = false, length = 50)
    private String userName;
    @Column(nullable = false, length = 50)
    private String password;
    @Column(name = "user_role")
    private UsersRole userRole = UsersRole.USER;

}
