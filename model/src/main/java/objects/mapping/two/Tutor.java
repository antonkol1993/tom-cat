package objects.mapping.two;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "two_tutor")
@DiscriminatorValue("T")
public class Tutor extends User {

    @Column(name = "tutor_number")
    private Integer tutorNumber;
    private Double rating;
}
