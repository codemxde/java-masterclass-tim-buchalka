package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_66;

public class WhileLoopChallenge {

    public static void main(String[] args) {
        // to be done later
        int number = 5;
        int evenNumbers = 0;
        while (number <= 20 && evenNumbers < 5) {
            if (isEvenNumber(number)) {
                evenNumbers++;
                System.out.println("Even: " + number);
            } else {
                System.out.println("Odd: " + number);
            }
            number++;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
