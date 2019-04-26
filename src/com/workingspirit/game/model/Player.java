package com.workingspirit.game.model;

public class Player {

    private String name;
    int numberOfBalls; // package // package-private

    public void foo() {
        Player anderePlayer = new Player();
        anderePlayer.name = "John Doe";
    }




}

class BaseballPlayer {
    public void bar() {
        Player p = new Player();
        p.numberOfBalls = 3;
//        p.name = "Fout"; // want name is private
    }
}
