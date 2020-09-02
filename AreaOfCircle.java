package Cohort3.com.Exercises;
// An Application that Calculates the Area of a circle when the radius is typed in
import  java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Circle radius:");
        double radius = input.nextDouble();

        System.out.println(circleArea(radius));

    }
    public static double circleArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }
}
