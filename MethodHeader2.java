package Cohort3.com.Exercises;

//import java.util.Scanner;

public class MethodHeader2 {

        public int smallest(int x, int y, int z){

        int smallestValue = 0;
        x = 0; y = 0; z = 0;
//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter x");
//        x = obj.nextInt();
//        System.out.println("Enter y");
//        y = obj.nextInt();
//        System.out.println("Enter z");
//        z = obj.nextInt();

        z = smallestValue;
        if (y < z) {
            y = smallestValue;
        } else if (z < y) {
            z = smallestValue;
        } else
            x = smallestValue;
        return smallestValue;
    }
    public static void main(String[]args) {
            MethodHeader2 mySmallestValue = new MethodHeader2();
            System.out.println(mySmallestValue.smallest(2,3,4));
    }
}

