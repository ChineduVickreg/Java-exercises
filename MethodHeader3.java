package Cohort3.com.Exercises;
import java.util.Scanner;
public class MethodHeader3 {
    public void instruction(){
        Scanner theInstruction = new Scanner(System.in);
        System.out.println("Open the door?");
        String openDoor = theInstruction.nextLine();
    }
    public static void main(){
        MethodHeader3 myInstruct = new MethodHeader3();
       //System.out.printf();
    }
}
