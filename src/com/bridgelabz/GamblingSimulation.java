package com.bridgelabz;
public class GamblingSimulation {
    /***
     *to calculate profit or loss after each 20 days
     */
    public int startGambling() {
        int startingAmount = 100;
        int bet_Per_Game = 1;
        while (startingAmount != 150 || startingAmount != 50)
        {
            int bet_result = (int) (Math.random() * 10) % 2;
            if (bet_result == 0)
            {
                startingAmount -= bet_Per_Game;
            }
            else
            {
                startingAmount += bet_Per_Game;
            }
            if (startingAmount == 150)
            {
                break;
            }
            else if (startingAmount == 50)
            {
                break;
            }
        }
        return startingAmount;
    }
    public void playFor20_Days() {
        int totalAmountInvestedIn_20_Days = 2000;
        int amountAfter_20_Days =0;
        for (int i = 1; i <= 20; i++) {
            amountAfter_20_Days += startGambling();
        }
        System.out.println("Amount after 20 day is "+ amountAfter_20_Days);
        /**
         * condition for total profit after 20 days
         */
        if (amountAfter_20_Days > totalAmountInvestedIn_20_Days) {
            int profit = amountAfter_20_Days - totalAmountInvestedIn_20_Days;
            System.out.println("Total profit after 20 days is = " + profit);

        } else if (amountAfter_20_Days < totalAmountInvestedIn_20_Days){
            /**
             * condition for total loss after 20 days
             */
            int loss = totalAmountInvestedIn_20_Days - amountAfter_20_Days;
            System.out.println("Total loss after 20 days is = " + loss);
        }
        else System.out.println("No profit No loss");
    }

    public static void main(String[] args) {
        GamblingSimulation play = new GamblingSimulation();
        play.playFor20_Days();
    }
}