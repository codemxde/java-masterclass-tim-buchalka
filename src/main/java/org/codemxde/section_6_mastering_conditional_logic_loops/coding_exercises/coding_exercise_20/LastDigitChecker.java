package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercises.coding_exercise_20;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println("The three numbers" + ((hasSameLastDigit(777, 771, 77)) ? "" : " do not") + " have any two same last digits");
    }

    // write code here
    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
        if (!isValid(firstNum) || !isValid(secondNum) || !isValid(thirdNum)) return false;

        int lastDigitOfFirstNum = firstNum % 10;
        int lastDigitOfSecondNum = secondNum % 10;
        int lastDigitOfThirdNum = thirdNum % 10;

        if (lastDigitOfFirstNum != lastDigitOfSecondNum && lastDigitOfFirstNum != lastDigitOfThirdNum && lastDigitOfSecondNum != lastDigitOfThirdNum) return false;

        return true;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
