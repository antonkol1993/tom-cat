package objects.mapping.four;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "four_tutor")
@Table(name = "four_tutor")
public class Tutor extends User {

    @Column(name = "tutor_number")
    private Integer tutorNumber;
    private Double rating;
}
