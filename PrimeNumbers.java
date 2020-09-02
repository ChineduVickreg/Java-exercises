package Cohort3.com.Exercises;
// An Application that determines and displays a Prime Number.

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.printf("%d%n", i);
            }
            count += 1;
        }
        System.out.printf("%nTested %d numbers%n", count);


    }

    public static boolean isPrime(int number) {
        if ((number%2 != 0 && number%3 != 0 && number%5 != 0) || number == 2 || number == 3 || number == 5) {
            return true;
        } else {
            return false;
        }
    }
}