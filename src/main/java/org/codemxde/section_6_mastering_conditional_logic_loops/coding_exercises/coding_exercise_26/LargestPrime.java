package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercises.coding_exercise_26;

public class LargestPrime {
    // write code here
    public static int getLargestPrime(int number) {
        if (number <= 0 || number == 1) return -1;

        int N = number;
        int maxPrimeFactor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                if (i != N/i) {

                    int smallFactor = i;
                    int greaterFactor = N / i;

                    boolean isSmallFactorPrime = true, isGreaterFactorPrime = true;

                    for (int j = 2; j * j <= smallFactor; j++) {
                        if (smallFactor % j == 0) {
                            isSmallFactorPrime = false;
                            break;
                        }
                    }

                    for (int j = 2; j * j <= greaterFactor; j++) {
                        if (greaterFactor % j == 0) {
                            isGreaterFactorPrime = false;
                            break;
                        }
                    }

                    if (isSmallFactorPrime) {
                        maxPrimeFactor = smallFactor > maxPrimeFactor ? smallFactor : maxPrimeFactor;
                    }

                    if (isGreaterFactorPrime) {
                        maxPrimeFactor = greaterFactor > maxPrimeFactor ? greaterFactor: maxPrimeFactor;
                    }
                } else {
                    int factor = i;

                    boolean isFactorPrime = true;
                    for (int j = 2; j * j <= factor; j++) {
                        if (factor % j == 0) {
                            isFactorPrime = false;
                            break;
                        }
                    }

                    if (isFactorPrime) {
                        maxPrimeFactor = factor > maxPrimeFactor ? factor : maxPrimeFactor;
                    }
                }
            }
        }

        return maxPrimeFactor == -1 ? number : maxPrimeFactor;
    }
}
