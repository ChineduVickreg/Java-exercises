package Cohort3.com.Exercises;
// An Application that determines if a number is an Even and an odd number.
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[]args){
          Scanner input = new Scanner(System.in);
          System.out.println("Enter a Number: ");
          int number = input.nextInt();

          EvenOrOdd myEvenNumber = new EvenOrOdd();
          System.out.println(myEvenNumber.isEven(number));
    }
    public boolean isEven(int number){
        if (number%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
