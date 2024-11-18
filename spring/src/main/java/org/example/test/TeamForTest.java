package org.example.test;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.football.Player;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
//@Table(name = "team_new")
public class TeamForTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    private String name;


    @OneToMany(mappedBy = "team", cascade = jakarta.persistence.CascadeType.ALL)
    private List<Player> players;

    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private GameForTest game;


}
