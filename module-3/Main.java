/**
 * Nardos Gebremedhin
 * 01/17/2025
 * M3 NestedForLoop Program
 * Write a program that uses nested for loops to output a Christmas tree with numbers and @ symbol
 */

public class Main {
    public static void main(String[] args) {
        int rows = 7; // Total number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for alignment
            for (int space = rows - i; space > 0; space--) {
                System.out.print("   ");
            }

            // Print the increasing part of the sequence
            int value = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            // Print the decreasing part of the sequence
            value /= 2;
            for (int j = i - 1; j >= 1; j--) {
                value /= 2;
                System.out.print(value + " ");
            }

            // Print the  '@'
            System.out.println("   @");
        }
    }
}