package org.example.football;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Game implements Football{
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
    private Team team;


    @Override
    public void extraInit() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", league=" + league.getName() +
                ", team=" + team +
                '}';
    }
}
