package com.example.one19.whack;

public class Game {


    // Instance Variables
    private int gameSpeed;

    // No args constructor
    public Game(){

        gameSpeed = 1000;
    }

    // Args constructor
    public Game(String difficulty)
    {
        if (difficulty.equals("easy")){
            gameSpeed = 1000;
        }
        else if (difficulty.equals("normal")){
            gameSpeed = 750;
        }
        else {
            gameSpeed = 500;
        }
    }

    /**
     * Gets the speed to run the game timer.
     * @return the speed.
     */
    public int getGameSpeed() {
        return gameSpeed;
    }
}
