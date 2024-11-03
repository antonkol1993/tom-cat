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
@Entity(name = "two_student")
@DiscriminatorValue("S")
public class Student extends User {

    @Column(name = "student_number")
    private Integer studentNumber;
    @Column(name = "paid_subscription")
    private Boolean paidSubscription;
}
