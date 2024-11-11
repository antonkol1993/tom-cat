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
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;


//    @ManyToMany(mappedBy = "meetings")
//    private List<Employee> employees = new ArrayList<>();

    @OneToMany(mappedBy = "meeting")
    private List<Invitation> invitations = new ArrayList<>();
}
