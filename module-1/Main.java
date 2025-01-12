/* Nardos Gebremedhin
 * 1/11/2025
 * M1 Programming Assignment
 * I will be writing a program that calculates the energy needed to heat water. I will use the formula provided.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialWaterTemp;
        double finalWaterTemp;
        double waterMass;
        double Q;

        // prompt the user for the input
        System.out.print("Enter an amount of water in kilograms: ");
        waterMass = scanner.nextDouble();

        System.out.print("Enter the initial water temperature in celsius: ");
        initialWaterTemp = scanner.nextDouble();

        System.out.print("Enter the final water temperature in celsius: ");
        finalWaterTemp = scanner.nextDouble();

        // compute
        Q = waterMass * (finalWaterTemp - initialWaterTemp) * 4184;

        // display results
        System.out.print("The energy needed to heat water is " + Q + " Joules" );
    }
}