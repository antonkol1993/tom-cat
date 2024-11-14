package objects.football;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
//@Table(name = "team_new")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "t_id")
    Integer id;

//    @Column(name = "t_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private League league;
//    @OneToMany(mappedBy = "team")
//    private List<Player> players;
//    @ManyToOne
//    private Match match;


}
