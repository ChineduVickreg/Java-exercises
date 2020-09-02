package Cohort3.com.Exercises;
//An Application that calculates the sides of a Right-Angle Triangle
import java.util.Scanner;
public class PythagorasTheorem {
    //double hypotenuse = input.nextDouble();
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Type-in side1:");
        double side1 = input.nextDouble();
        System.out.println("Type-in side2:");
        double side2 = input.nextDouble();

//      PythagorasTheorem myHypotenuse = new PythagorasTheorem();
            right_Angle_Triangle_hypotenuse(side1,side2);
//            System.out.println("Type-in hypotenuse");
//            double hypotenuse = input.nextDouble();
//            right_Angle_Triangle_side1(hypotenuse,side2);
    }

    public static void right_Angle_Triangle_hypotenuse(double side1, double side2){
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.printf("The hypotenuse of the Triangle is: %.2f%n", hypotenuse);
    }
//    public static void right_Angle_Triangle_side1(double hypotenuse, double side2){
//        double side1 = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(side2, 2));
//        System.out.println(side1);
//    }

}
