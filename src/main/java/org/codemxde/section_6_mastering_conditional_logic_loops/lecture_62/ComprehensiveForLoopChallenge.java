package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_62;

public class ComprehensiveForLoopChallenge {

    public static void main(String[] args) {
        // Challenge 1: Check if Number is prime or not
        System.out.println(isPrime(24) ? "It's Prime" : "Not a Prime");

        // Challenge 2: Count the total number of Prime Numbers between 1 and 1000
        System.out.println("Total number of prime numbers: " + countPrimes(1000));
    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;
        if (number == 2) return true;

        int noOfFactors = countFactors(number);
        System.out.println("Number of factors: " + noOfFactors);

        return noOfFactors == 2;
    }

    public static int countFactors(int number) {
        int factors = 2;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                if (i != number / i) {
                    factors += 2;
                } else {
                    factors++;
                }
            }
        }
        return factors;
    }

    public static int countPrimes(int N) {
        int count = 1;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }
}
