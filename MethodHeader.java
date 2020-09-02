package Cohort3.com.Exercises;
import java.util.Scanner;
public class MethodHeader {
    public double hypotenuse(double side1, double side2){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Side1");
        side1 = obj.nextDouble();
        System.out.println("Enter Side2");
        side2 = obj.nextDouble();
        double hypotenuse;
        hypotenuse = Math.sqrt(side1*side1 + side2*side2);
        return hypotenuse;
    }


    public static void main(String[]args){
        MethodHeader chinedu = new MethodHeader();
        System.out.println(chinedu.hypotenuse(30.0, 30.0));

    }
}
