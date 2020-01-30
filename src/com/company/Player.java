package com.company;

import java.util.Arrays;

public class Player {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        Checker checker = new Checker();
        Player[] players = {new Player("amy",100),new Player("david",100),new Player("hearldo",50),new Player("aakansha",75),new Player("aleksa",150)};
        Arrays.sort(players,checker);
        for (Player player : players) {
            System.out.printf("%s %s\n", player.name, player.score);
        }
    }
}
