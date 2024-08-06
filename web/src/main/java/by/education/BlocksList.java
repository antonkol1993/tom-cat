package by.education;

import java.util.ArrayList;
import java.util.List;

public class BlocksList {


    private static final String[] blockOfValues1 = {"Rois", "34", "Germany"};
    private static final String[] blockOfValues2 = {"Hleb", "38", "Belarus"};
    ;
    private static final String[] blockOfValues3 = {"Mironchyk", "31", "Russia"};
    ;
    private static final String[] blockOfValues4 = {"Bensema", "35", "France"};
    ;
    private static final String[] blockOfValues5 = {"Lukaku", "33", "Belgium"};
    ;
    private static final String[] blockOfValues6 = {"Donnarumma", "24", "Italy"};
    ;
    private static final String[] blockOfValues7 = {"Jamal", "17", "Spain"};
    ;
    private static final String[] blockOfValues8 = {"Messi", "36", "Argentina"};
    ;

    public static List<String> players() {
        List<String> allPlayers = new ArrayList<>();
        allPlayers = List.of(
                blockOfValues1[0],
                blockOfValues2[0],
                blockOfValues3[0],
                blockOfValues4[0],
                blockOfValues5[0],
                blockOfValues6[0],
                blockOfValues7[0],
                blockOfValues8[0]
        );
        return allPlayers;
    }
    public static List<String> ages() {
        List<String> allAges = new ArrayList<>();
        allAges = List.of(
                blockOfValues1[1],
                blockOfValues2[1],
                blockOfValues3[1],
                blockOfValues4[1],
                blockOfValues5[1],
                blockOfValues6[1],
                blockOfValues7[1],
                blockOfValues8[1]
        );
        return allAges;
    }
    public static List<String> countries() {
        List<String> allCountries = new ArrayList<>();
        allCountries = List.of(
                blockOfValues1[2],
                blockOfValues2[2],
                blockOfValues3[2],
                blockOfValues4[2],
                blockOfValues5[2],
                blockOfValues6[2],
                blockOfValues7[2],
                blockOfValues8[2]
        );
        return allCountries;
    }


}
