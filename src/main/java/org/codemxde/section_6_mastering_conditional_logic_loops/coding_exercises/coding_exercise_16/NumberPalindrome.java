package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercises.coding_exercise_16;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println("It's " + (isPalindrome(-1221) ? "" : "not ") + "a palindrome");
    }

    // write code here
    public static boolean isPalindrome(int number) {
        // Taking absolute value
        number = number < 0 ? number * -1 : number;

        return number == reverseNumber(number);
    }

    public static int reverseNumber(int number) {
        // 1234 -> 4321
        int reverse = 0;

        while(number > 0) {
            int lastDigit = number % 10 ;
            reverse = (reverse * 10) + lastDigit;

            number /= 10;
        }

        return reverse;
    }

}
