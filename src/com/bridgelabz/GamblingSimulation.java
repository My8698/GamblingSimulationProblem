package com.bridgelabz;
public class GamblingSimulation {
     public void startGambling() {
        int startingAmount=100;
        int bet_Per_Game = 1;
        /** Checking condition with while loop
         *add conditions for gambler if win or lost
         * 50% of stake,would resign for the day
         * */
         while ( startingAmount != 150 || startingAmount !=50) {
            int bet_result = (int) (Math.random() * 10) % 2;
            if (bet_result == 0) {
                startingAmount -= bet_Per_Game;
            } else {
                startingAmount += bet_Per_Game;
            }
            if(startingAmount == 150) {
                System.out.println("Win 50 % of the stake ");
                break;}
            else if (startingAmount == 50)
            {
                System.out.println("Lost 50 % of the stake");
                break;}
        }
    }
    public static void main (String[]args){
        GamblingSimulation play = new GamblingSimulation();
        play.startGambling();
    }
}
