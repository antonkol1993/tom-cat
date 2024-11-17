package org.example.football;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Game game;
    @OneToMany(mappedBy = "team")
    private List<Player> players;

    @OneToMany(mappedBy = "team")
    private List<Game> games;
//    @ManyToOne
//    private League league;


}
