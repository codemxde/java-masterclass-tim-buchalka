package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_61;

public class MiniChallenge {

    public static void main(String[] args) {
        // Challenge: Calculate Simple Interest for $100, increment percent by 0.25
        double amount = 100;
        for (double i = 7.5; i <= 10; i += 0.25) {
            amount += calculateInterest(amount, i);
        }

        System.out.println("Final amount: " + amount);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return 100 * (interestRate)/100;
    }
}
