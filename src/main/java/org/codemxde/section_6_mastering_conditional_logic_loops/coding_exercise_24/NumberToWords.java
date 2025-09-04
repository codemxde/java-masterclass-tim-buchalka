package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercise_24;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(1450);
    }

    // write code here
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        if (number == 0) System.out.println("Zero");

        int reverse = reverse(number);

        int countOfDigitsNumber = getDigitCount(number);
        int countOfDigitsReverse = getDigitCount(reverse);

        if (countOfDigitsNumber == countOfDigitsReverse) {
            while (reverse > 0) {
                int lastDigit = reverse % 10;

                String word = switch (lastDigit) {
                    case 0 -> "Zero";
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    case 6 -> "Six";
                    case 7 -> "Seven";
                    case 8 -> "Eight";
                    default -> "Nine";
                };

                System.out.print(word + " ");
                reverse /= 10;
            }
        }

        // First print actual digits
        while (reverse > 0) {
            int lastDigit = reverse % 10;

            String word = switch (lastDigit) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                default -> "Nine";
            };

            System.out.print(word + " ");
            reverse /= 10;
        }

        // There are trailing zeroes in the original number
        for (int i = countOfDigitsReverse; i < countOfDigitsNumber; i++) {
            System.out.print("Zero ");
        }

    }

    public static int reverse(int number) {
        int valueFactor = 1;

        if (number < 0) {
            valueFactor = -1;
            number *= -1;
        }
        // 123 -> 321
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;

            number /= 10;
        }

        return valueFactor * reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number / 10 == 0) return 1;

        int countOfDigits = 0;
        while (number > 0) {
            countOfDigits++;
            number /= 10;
        }

        return countOfDigits;
    }
}
