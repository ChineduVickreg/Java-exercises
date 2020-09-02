package Cohort3.com.Exercises;

import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a long Number");
        int number = scanner.nextInt();
        System.out.printf("The Reverse of %d is %s%n", number, reversedDigit(number));
    }

    private static String reversedDigit(int number) {
        String stringedNum = new String(String.valueOf(number));
        String newNum = "";
        for (int i = stringedNum.length() - 1; i >= 0; i--) {
            newNum += stringedNum.charAt(i);
        }
        return newNum;
    }

}
