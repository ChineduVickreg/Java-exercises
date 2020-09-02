package Cohort3.com.Exercises;
// An Application that Calculates and Displays the parking charges of each customer who parked in the garage yesterday.
import java.util.Scanner;
public class ParkingChargesTest {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        double customerCharge = 0;
        double totalReceipt = 0;

        System.out.println("Enter Number of Hours a Car Parked or Enter 0 to terminate App: ");
        int hoursParked = input.nextInt();

        while (hoursParked > 0) {
            ParkingCharge parkingCharge = new ParkingCharge(hoursParked);
            customerCharge = parkingCharge.calculateCharges();
            totalReceipt += customerCharge;

            System.out.printf("%nCustomer Charge: $%.2f %nTotal Receipt: $%.2f%n", customerCharge, totalReceipt);

            System.out.println("Enter Number of Hours a Another Car Parked or Enter 0 to terminate App: ");
            hoursParked = input.nextInt();
        }

    }
}
