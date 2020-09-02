package Cohort3.com.Exercises;
// An Application that converts degree celsius to degree fahrenheit and vice versa
import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Degree Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.printf("The Degree Celsius will be: %.2f%n", celsius(fahrenheit));


        System.out.println("Enter Degree Celsius: ");
        double celsius = input.nextDouble();
        System.out.printf("The Degree Fahrenheit will be: ", fahrenheit(celsius));



    }
    public static double celsius(double fahrenheit){
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    }
    public static double fahrenheit(double celsius){
        double fahrenheit = 9.0 / 5.0 * (celsius + 32);
        return fahrenheit;
    }
}
