package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_63;

public class SumChallenge {

    public static void main(String[] args) {
        // Challenge: For N = 1000, Sum all the numbers which can be divided by both 3 and 5
        // print all such numbers, break once you have found 5 such numbers
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by both 3 and 5");
                count++;
                sum += i;
            }

            if (count == 5) break;
        }
        System.out.println("Sum: " + sum);
    }
}
