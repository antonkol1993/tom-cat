package objects.football;

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
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    private String name;
    private String country;

    @OneToMany(mappedBy = "league")
    private List<Team> teams;

}
