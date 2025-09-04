package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercise_22;

public class GreatestCommonDivisor {

    // write code here
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int gcd = 1;
        int min = first < second ? first : second;
        for (int i = 2; i <= min; i++) {
            if (first % i == 0 && second % i == 0 && i > gcd) gcd = i;
        }
        return gcd;
    }
}
