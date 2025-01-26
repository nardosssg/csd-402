
/**
 * Nardos Gebremedhin
 * 1/25/25
 * M4 Programming Assignment
 * A program that return the average of an array with the following headers
 * public static short average (short [ ] array)
 * public static int average (int [ ] array)
 * public static long average (long [ ] array)
 * public static double average (double [ ] array)
 *
* */

public class ArrayAverage{

    public static short average(short[] array){
        // declare variables
        int sum = 0;
        int count = array.length;
        short avg;

        //calc the elements
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        //calc the avg
        avg = (short) (sum/count);
        return avg;
    }
    public static int average (int [] array){

        int sum = 0;
        int count = array.length;
        int avg;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        avg = sum / count;
        return avg;
    }

    public static long average (long [ ] array){
        long sum = 0;
        int count = array.length;
        long avg;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / count;
        return avg;
    }

    public static double average (double [ ] array){
        double sum = 0;
        int count = array.length;
        double avg;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / count;
        return avg;
    }
    public static void main(String[] args) {
        // creating different size arrays to test
        short[] shortArray = {2, 4, 6, 8};
        int[] intArray = {20, 40, 60};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5};

        // print the results
        System.out.println("Short Array: ");
        displayArray(shortArray);// Display the elements
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array: ");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }
    public static void displayArray(short[] array){
        for (short num : array){ //looping through elements
            System.out.print(num + " "); // printing the element
        }
        System.out.println();
    }

    public static void displayArray(int[] array){
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void displayArray(long[] array){
        for (long num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(double[] array){
        for (double num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
