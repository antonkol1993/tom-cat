package by.education.data;

import java.util.Arrays;
import java.util.List;

public class PlayerList {

    public  List <Player> getPlayerArrayList() {

        return Arrays.asList(
                new Player("Rois", 34, "Germany"),
                new Player("Hleb", 38, "Belarus"),
                new Player("Mironchyk", 31, "Russia"),
                new Player("Bensema", 35, "France"),
                new Player("Lukaku", 33, "Belgium"),
                new Player("Donnarumma", 24, "Italy"),
                new Player("Jamal", 17, "Spain"),
                new Player("Messi", 36, "Argentina")
        );
    }

}
