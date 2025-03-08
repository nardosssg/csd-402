/*
Nardos Gebremedhin
03/08/2025
Module 12 Programming

In this program I will calculate the cost of a yearly auto service visit using four overloaded methods named yearlyService.
Each method represents different service scenarios.
 */

public class AutoService {
    // standard service charge
    private static final double STANDARD_CHARGE = 100.00;

    // yearlyService(no parameters) - Will return the standard service charge
    public static double yearlyService(){
        return STANDARD_CHARGE;
    }
    // yearlyService(one parameter) - Will return the standard service charge with an added oil change fee
    public static double yearlyService(double oilChangeFee){
        return STANDARD_CHARGE + oilChangeFee;
    }

    // yearlyService(two parameters) - Will return the standard service charge with an added oil change fee
    // and a tire rotation charge.
    public static double yearlyService(double oilChangeFee, double tireRotationFee){
        return STANDARD_CHARGE + oilChangeFee +tireRotationFee;
    }
    // yearlyService(three parameters) - Will return the standard service charge with an added oil change fee
    // a tire rotation charge, along with a coupon amount that will be deducted from the total cost.
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDiscount){
        return STANDARD_CHARGE + oilChangeFee +tireRotationFee - couponDiscount;
    }

    public static void main(String[] args) {
    // testing method
        System.out.println("Testing 1:");
        System.out.println("Standard Service Cost: $" + yearlyService());
        System.out.println("Service with Oil Change: $" + yearlyService(55.0));
        System.out.println("Service with Oil Change and Tire Rotation: $" + yearlyService
                (55.0, 60.0));
        System.out.println("Service with All and Coupon: $" + yearlyService
                (55.0, 60.0, 25.0));

        System.out.println("\nTest 2:");
        System.out.println("Standard Service Cost: $" + yearlyService());
        System.out.println("Service with Oil Change: $" + yearlyService(35.0));
        System.out.println("Service with Oil Change and Tire Rotation: $" + yearlyService
                (35.0, 75.0));
        System.out.println("Service with All and Coupon: $" + yearlyService
                (35.0, 75.0, 26.0));
    }
}
