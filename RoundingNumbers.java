package Cohort3.com.Exercises;
import java.util.Scanner;
public class RoundingNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value x");
        double x = input.nextDouble();
        double y = Math.floor(x + 0.5);

        System.out.printf("%n The Original Number: %f%n", x);
        System.out.printf("%n The Rounded Number: %f%n", y);
    }
}
