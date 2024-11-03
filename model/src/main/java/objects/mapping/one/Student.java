package objects.mapping.one;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "one_student")
@Table(name = "one_student")
public class Student extends User {

    @Column(name = "student_number")
    private Integer studentNumber;
    @Column(name = "paid_subscription")
    private Boolean paidSubscription;
}
