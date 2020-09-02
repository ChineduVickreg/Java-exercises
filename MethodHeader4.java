package Cohort3.com.Exercises;
import java.util.Scanner;
public class MethodHeader4 {
    public float inToFloat(){
        Scanner value = new Scanner(System.in);
        System.out.println("Enter Number");
        float num1 = value.nextFloat();
        System.out.println("Enter Number");
        float num2 = value.nextFloat();
        float averageSum = (num1 + num2) / 2;
        return averageSum;
    }
    public static void main(String[]args){
        MethodHeader4 mySum = new MethodHeader4();
        System.out.println(mySum.inToFloat());
    }
}
