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

    @ManyToOne
    private Team homeTeam;

    @ManyToOne
    private Team awayTeam;


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
                ", homeTeam=" + homeTeam.getName() +
                ", awayTeam=" + awayTeam.getName() +
                '}';
    }
}
