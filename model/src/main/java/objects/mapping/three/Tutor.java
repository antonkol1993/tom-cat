package objects.mapping.three;

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
@Entity(name = "three_tutor")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "three_tutor")
public class Tutor extends User{

    @Column(name = "tutor_number")
    private Integer tutorNumber;
    private Double rating;
}
