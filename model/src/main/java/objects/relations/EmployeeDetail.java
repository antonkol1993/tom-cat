package objects.relations;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmployeeDetail {

    @Id
    private Long id;

    private String street;
    private String city;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Employee employee;
}
