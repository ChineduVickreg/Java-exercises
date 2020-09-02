package Cohort3.com.Exercises;
//An Application that determines the Quotients and Remainder of Numbers and separates digits between 1 and 99,999 and displays its outcome
import java.util.Scanner;

public class SeparatingDigits {
   // private final int MAX_DIGITS = 99999;

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter FirstNumber: ");
        double num1 = input.nextInt();
        System.out.println("Enter SecondNumber: ");
        double num2 = input.nextInt();

        SeparatingDigits myQuotients = new SeparatingDigits();
        System.out.printf("The Quotient is: %.2f%n ", myQuotients.quotient( num1, num2));
        SeparatingDigits myRemainders  = new SeparatingDigits();
        System.out.printf("The Remainder is: %.2f%n ", myRemainders.remainder(num1, num2));

        System.out.println("Enter Digits: ");
        int digits_For_Display = input.nextInt();
        System.out.printf("The digits are: %s%s%s%s%s%s ", displayDigits(digits_For_Display));



    }
    public double quotient(double num1, double num2){
        double theQuotient = num1 / num2;
        return theQuotient;
    }
    public double remainder(double num1, double num2){
        double theRemainder = num1 % num2;
        return theRemainder;
    }
    public static String displayDigits(int digits_For_Display){
        String newNum = new String(String.valueOf(digits_For_Display));
        for(int i = digits_For_Display; i <= 5; i++){

        }
        if (digits_For_Display > 0 && digits_For_Display <= 99999) {
           // System.out.printf("The digits displayed is: %s ", newNum);
        } else {
            System.out.println("Invalid entry!! Please enter a number between 1 and 99999");
        }
        return newNum;
    }

}
