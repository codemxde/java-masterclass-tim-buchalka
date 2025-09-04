package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercise_21;

public class FactorPrinter {

    // write code here
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
