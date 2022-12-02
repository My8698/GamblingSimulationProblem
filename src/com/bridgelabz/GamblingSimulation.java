package com.bridgelabz;

public class GamblingSimulation {
    /***
     *to decide either gambler win or loose the game
     */
    public void startGambling() {
        int startingBetAmount = 100;
        int bet_Per_Game = 1;
        /**
         * player either win or loose
         */
        int bet_result = (int) (Math.random() * 10) % 2;
        if (bet_result == 0) {
            startingBetAmount -= 1;
            System.out.println("Gambler loose and left amount is= " + startingBetAmount);
        } else {
            startingBetAmount += 1;
            System.out.println("Gambler win and left amount is=" + startingBetAmount);

        }
    }

    public static void main(String[] args) {
        GamblingSimulation play = new GamblingSimulation();
        play.startGambling();
    }
}