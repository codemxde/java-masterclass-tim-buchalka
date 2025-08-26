package org.codemxde.section_5_mastering_java_expressions.coding_exercise_11;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(12, 13, 12);
    }

    public static void printEqual(int A, int B, int C) {
        if (A < 0 || B < 0 || C < 0) {
            System.out.println("Invalid Value");
        } else if (A == C && B == C) {
            System.out.println("All numbers are equal");
        } else if (A != B && B != C && A != C) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
