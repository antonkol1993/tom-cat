package org.example.test;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.football.Football;
import org.example.football.League;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GameForTest implements Football {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;


    @Cascade(value = CascadeType.ALL)
    @ManyToOne
    private League league;

//    @OneToOne(mappedBy = "game")
//    private TeamForTest homeTeamForTest;
//
//    @OneToOne(mappedBy = "game")
//    private TeamForTest awayTeamForTest;

    @Cascade(value = CascadeType.ALL)
    @OneToOne(mappedBy = "game")
    private TeamForTest homeTeamForTest;

    @Cascade(value = CascadeType.ALL)
    @OneToOne(mappedBy = "game")
    private TeamForTest awayTeamForTest;


    @Override
    public void extraInit() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "GameForTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", league=" + league +
                ", homeTeamForTest=" + homeTeamForTest.getName() +
                ", awayTeamForTest=" + awayTeamForTest.getName() +
                '}';
    }
}
