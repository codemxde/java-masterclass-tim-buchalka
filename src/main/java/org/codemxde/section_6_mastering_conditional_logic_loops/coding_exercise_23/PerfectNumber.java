package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercise_23;

public class PerfectNumber {

    // write code here
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sumOfFactors = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) sumOfFactors += i;
        }
        return number == sumOfFactors;
    }
}
