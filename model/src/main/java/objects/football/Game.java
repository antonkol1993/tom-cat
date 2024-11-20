package objects.football;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;



    @ManyToOne
    private League league;

//    @OneToOne(mappedBy = "game")
//    private Team homeTeam;
//
//    @OneToOne(mappedBy = "game")
//    private Team awayTeam;

    @ManyToOne
    private Team homeTeam;

    @ManyToOne
    private Team awayTeam;



}
