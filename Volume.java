package Cohort3.com.Exercises;
// program to calculate the volume of a sphere
import java.util.Scanner;
public class Volume{

    public static void main(String[]args){
        Scanner value = new Scanner(System.in);
        System.out.println("Enter RADIUS of The Sphere: ");
        double radius = value.nextDouble();
        Volume myVolume =new Volume();
        System.out.printf("The volume is %f%n", myVolume.sphereVolume(radius));
    }
    double sphereVolume(double radius){
        //double radius = 0;
        double volume = (4.0 /3.0) *Math.PI* Math.pow(radius,3);
        return volume;
    }
}
