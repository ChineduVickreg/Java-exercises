package Cohort3.com.Exercises;
//An Application that  displays a Perfect Number from 1 - 1000

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = input.nextInt();

        System.out.printf("%n The Number is: %s", isPerfect(number));
    }
    public static boolean isPerfect(int number){

        int sumOfFactor = 0;
        for (int counter = 1; counter < number; counter++){
            if(number % counter == 0){
                sumOfFactor+=counter;
                System.out.printf("%n The factors of the number is: %d ", sumOfFactor);
            }

        }
        if(sumOfFactor == number){
            return true;
        }else {
            return false;
        }

        }


    }

