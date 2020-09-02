package Cohort3.com.Exercises;
// A Application that reads the Minimum number among three numbers
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class FindingMinimum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter FirstNumber: ");
        float num1 = input.nextFloat();
        System.out.println("Enter SecondNumber: ");
        float num2 = input.nextFloat();
        System.out.println("Enter ThirdNumber: ");
        float num3 = input.nextFloat();

        FindingMinimum my_Minimum = new FindingMinimum();
        System.out.printf("The Minimum is: %.3f", my_Minimum.minimum_3(num1, num1, num2));
    }
    public float minimum_3(float num1, float num2, float num3){
        float theMinimum = num1;
        if (num2 < theMinimum){
            theMinimum = num2;
        }
        if (num3 < theMinimum ) {
            theMinimum = num3;
        }
        return theMinimum;
    }

}
