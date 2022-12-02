package com.bridgelabz;
/***
 *know the lukiest and unluckiest day
 */
public class GamblingSimulation {
    public int startGambling() {
        int startingAmount = 100;
        int bet_Per_Game = 1;
        while (startingAmount != 150 || startingAmount != 50) {
            int bet_result = (int) (Math.random() * 10) % 2;
            if (bet_result == 0) {
                startingAmount -= bet_Per_Game;
            } else {
                startingAmount += bet_Per_Game;
            }
            if (startingAmount == 150) {
                break;
            } else if (startingAmount == 50) {
                break;
            }
        }
        return startingAmount;
    }
    public void playFor_20_Days() {
        int totalAmountInvestedIn_20_Days = 2000;
        int amountAfter_20_Days = 0;
/**
 * for loop to iterate upto 20 days
 */
        int profit=0;
        for (int i = 1; i <= 20; i++) {
            int result = startGambling();
            amountAfter_20_Days += result;
            if (result == 50) {
                System.out.println("Unlucky day Lost 50$ in day " + i);
            }
            if (result == 150) {
                System.out.println("Lucky day Won 50$ in day " + i);
            }
        }
        System.out.println("Amount after 20 day is " + amountAfter_20_Days);
        if (amountAfter_20_Days > totalAmountInvestedIn_20_Days) {
             profit = amountAfter_20_Days - totalAmountInvestedIn_20_Days;
            System.out.println("Total profit after 20 days is = " + profit);

        } else if (amountAfter_20_Days < totalAmountInvestedIn_20_Days) {
            int loss = totalAmountInvestedIn_20_Days - amountAfter_20_Days;
            System.out.println("Total loss after 20 days is = " + loss);
        } else System.out.println("No profit No loss");

        if (amountAfter_20_Days > totalAmountInvestedIn_20_Days) {
            System.out.println("===============================================");
            System.out.println("Won " + profit + "$ Last month. Play Again");
            playFor_20_Days();
        }
    }
    public static void main(String[] args) {
        GamblingSimulation play = new GamblingSimulation();
        play.playFor_20_Days();
    }
}