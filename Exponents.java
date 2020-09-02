package Cohort3.com.Exercises;
//An Application that calculates the Exponent of a base number.
import java.util.Scanner;
public class Exponents {
    Scanner input = new Scanner(System.in);
    int base = input.nextInt();
    int exponent = 5;
    public int integerPower(){
        int quotient = 0;
        for (int counter = 1; counter <= base; counter++){
             quotient = base * base * base * base * base;
        }
        if(exponent > 5 && exponent < 5){
            quotient = quotient;
        }
        return quotient;
    }
    public static void main(String[]args){
       System.out.println("Please kindly Type-in your base");


       Exponents myExponent = new Exponents();
        System.out.println(myExponent.integerPower());
    }
}
