package Cohort3.com.Exercises;
// An Application that determines if the second integer is a multiple of the the first integer'
import java.text.NumberFormat;
import java.util.Scanner;
public class Multiples {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter FirstNumber:");
        int firstNum = input.nextInt();
        System.out.println("Enter SecondNumber:");
        int secondNum = input.nextInt();
        System.out.println(isMultiple(firstNum,secondNum));

    }
    public static boolean isMultiple(int firstNum, int secondNum){
       // boolean result = false;
        if (firstNum % secondNum == 0){
            return  true;
        }
        else {
            return  false;
        }
    }
}
