package org.example;

import org.example.football.Football;
import org.example.football.PreparedFootballDatabase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends Football> footballObjects = PreparedFootballDatabase.getFootballObjects();
        for (int i = 0; i < footballObjects.size(); i++) {

        }
    }
}
