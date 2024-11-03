package objects.mapping.one;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import objects.Person;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "one_tutor")
@Table(name = "one_tutor")
public class Tutor extends User {

    @Column(name = "tutor_number")
    private Integer tutorNumber;
    private Double rating;
}
