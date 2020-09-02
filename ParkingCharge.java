package Cohort3.com.Exercises;

public class ParkingCharge {
    private int hoursPacked;
    private double currentCustomerCharge;

    private final double MIN_CHARGE_IN_3HRS = 2.0;
    private final double EXTRA_CHARGE_PER_HOUR = 0.5;
    private final double MAX_CHARGE_IN_24HRS = 10.00;

    public ParkingCharge(int hoursPacked) {
        this.hoursPacked = hoursPacked;
    }

    public int getHoursPacked() {
        return hoursPacked;
    }

    public void setHoursPacked(int hoursPacked) {
        this.hoursPacked = hoursPacked;
    }

    public double calculateCharges() {
        if (hoursPacked <= 3) {
            currentCustomerCharge = MIN_CHARGE_IN_3HRS;
        } else if (hoursPacked > 3 && hoursPacked <= 24) {
            int extraHour = hoursPacked - 3;
            double extraCharge = extraHour * EXTRA_CHARGE_PER_HOUR;
            currentCustomerCharge =  extraCharge + MIN_CHARGE_IN_3HRS;
        }

        if (currentCustomerCharge > MAX_CHARGE_IN_24HRS) {
            currentCustomerCharge = MAX_CHARGE_IN_24HRS;
        }
        return currentCustomerCharge;
    }
}
