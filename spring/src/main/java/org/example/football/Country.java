package org.example.football;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Country implements Football {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String capitalCity;

    @OneToMany(mappedBy = "countries")
    private List<League> leagues = new ArrayList<>();

    @Override
    public void extraInit() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (leagues.size() == 1) {
            return "Country{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", capitalCity='" + capitalCity + '\'' +
                    ", leagues=" + leagues.get(0).getName() +
                    '}';
        } else return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", leagues=" + leagues.size() +
                '}';
    }
}
