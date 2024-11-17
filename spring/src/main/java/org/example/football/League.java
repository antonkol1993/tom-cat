package org.example.football;

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
//@Table(name = "league_new")
public class League implements Football{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "l_id")
    Integer id;

    //    @Column(name = "l_name")
    private String name;

    //    @Column(name = "l_country")
    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "league")
    private List<Game> games = new ArrayList<>();


    @Override
    public void extraInit() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country.getName() +
                ", games=" + games +
                '}';
    }
}
