package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercises.coding_exercise_28;

import java.util.Scanner;

public class InputCalculator {
//    NOTE: All test cases passed excpet for one: [-1, 5, 7, bg, 9]
//    which runs perfectly nicely when given manual user input
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    // write code here
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, average = 0, count = 0;
        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                count++;
                sum += number;
            } catch (NumberFormatException nfe) {
                break;
            }

        }

        average = count > 0 ? sum / count : 0;
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
