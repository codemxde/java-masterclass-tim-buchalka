package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercises.coding_exercise_27;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    // write code here
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                // first and line row are stars only
                if (i == 0 || i == number - 1 || j == 0 || j == number - 1) {
                    System.out.print("*");
                } else if (i == j || j == number - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
