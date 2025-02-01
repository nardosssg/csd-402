// Nardos Gebremedhin
// Module 5 Programming Assigment
// 02/01/2025
// This program finds the smallest and largest elements in a 2d array and display the location


public class ArrayLocation {

    // method to locate the largest element in a 2d double array
    public static int [ ] locateLargest (double [ ][ ] arrayParam){
        int[] largestLocation = {0, 0};
        // Initialize max with the first element
        double max = arrayParam[0][0];
        // Loop through the array to find the largest element
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    largestLocation[0] = i;
                    largestLocation[1] = j;
                }
            }
        }
        return largestLocation;
    }

    // method to locate the largest element in a 2d int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] largestLocation = {0, 0};
        int max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    largestLocation[0] = i;
                    largestLocation[1] = j;
                }
            }
        }
        return largestLocation;
    }

    // Method to locate the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] smalllocation = {0, 0};
        // Initialize min with the first element
        double min = arrayParam[0][0];
        // Loop through the array to find the smallest element
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    smalllocation[0] = i;
                    smalllocation[1] = j;
                }
            }
        }


        return smalllocation;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] smalllocation = {0, 0};
        int min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    smalllocation[0] = i;
                    smalllocation[1] = j;
                }
            }
        }
        return smalllocation;
    }

    // Testing methods
    public static void main(String[] args) {
        double [][] doubleArray = {
                {1.3, 4.6, 7.9},
                {2.4, 5.7, 8.1},
                {9.5, 3.5, 2.2},
        };
        int[][] intArray = {
                {1, 2, 3},
                {40, 57, 68},
                {300, 454, 648}
        };

        // locating smallest and largest double array
        int[] LargestDouble = locateLargest(doubleArray);
        int[] SmallestDouble = locateSmallest(doubleArray);

        // displaying largest double array
        System.out.println("Largest Double array is: (" + LargestDouble[0] + ", " + LargestDouble[1] + ")");
        System.out.println();

        // displaying smallest double array
        System.out.println("Smallest Double array is: (" + SmallestDouble[0] + ", " + SmallestDouble[1] + ")");
        System.out.println();


        // locating smallest and largest int array
        int[] LargestInt = locateLargest(intArray);
        int[] SmallestInt = locateSmallest(intArray);

        // displaying the largest int array
        System.out.println("Largest Int array is: (" + LargestInt[0] + ", " + LargestInt[1] + ")");
        System.out.println();

        // displaying the smallest int array
        System.out.println("Smallest Int array is: (" + SmallestInt[0] + ", " + SmallestInt[1] + ")");
        System.out.println();

    }

}
