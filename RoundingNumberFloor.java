package Cohort3.com.Exercises;
import java.util.Scanner;
public class RoundingNumberFloor {
    Scanner input = new Scanner(System.in);
    double x = input.nextDouble();
    public double roundingToInteger(){
        double y = Math.floor(x + 0.5);
        return y;
    }
    public double roundingToTenth(){
        double y = Math.floor(x * 10 + 0.5) / 10;
        return y;
    }
    public double roundingToHundredths(){
        double y = Math.floor(x * 100 + 0.5) / 100;
        return y;
    }
    public double roundingToThousandths(){
        double y = Math.floor(x * 1000 + 0.5) / 1000;
        return y;
    }


    public static void main(String[] args) {

        System.out.println("Enter The Value of x");

        RoundingNumberFloor myRoundedValue = new RoundingNumberFloor();
       System.out.println(myRoundedValue.roundingToInteger());
        System.out.println(myRoundedValue.roundingToTenth());
        System.out.println(myRoundedValue.roundingToHundredths());
       System.out.println(myRoundedValue.roundingToThousandths());
    }
}
