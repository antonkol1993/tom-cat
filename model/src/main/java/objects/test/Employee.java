package objects.test;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private EmployeeDetail detail;

    @ManyToOne
    private Department department;

//    @ManyToMany
//    @JoinTable(name = "employee_has_meeting",
//            joinColumns = {@JoinColumn(name = "employee_id")},
//            inverseJoinColumns = {@JoinColumn(name = "meeting_id")})
//    private List<Meeting> meetings = new ArrayList<>();

    @OneToMany(mappedBy = "employee")
    private List<Invitation> invitations = new ArrayList<>();

}
