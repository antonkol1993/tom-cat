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
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    private String name;

    @ManyToOne
    private League league;
    @OneToMany(mappedBy = "team")
    private List<Player> players;
    @ManyToOne
    private Match match;


}
