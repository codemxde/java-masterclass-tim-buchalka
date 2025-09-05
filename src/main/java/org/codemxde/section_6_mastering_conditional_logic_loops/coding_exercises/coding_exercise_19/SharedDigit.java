package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercises.coding_exercise_19;

public class SharedDigit {

    public static void main(String[] args) {
        int firstNum = 12, secondNum = 43;
        System.out.println(firstNum + " and " + secondNum + (hasSharedDigit(firstNum, secondNum) ? "" : " do not") + " have a shared digit");
    }

    // write code here
    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if (firstNum < 10 || secondNum < 10 || firstNum > 99 || secondNum > 99) return false;

        while (firstNum > 0) {
            int digit = firstNum % 10;

            int second = secondNum;
            while(second > 0) {
                int lastDigit = second % 10;

                if (lastDigit == digit) return true;

                second /= 10;
            }

            firstNum /= 10;
        }

        return false;
    }
}
