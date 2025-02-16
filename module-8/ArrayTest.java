/*
* Nardos Gebremedhin
* Module 8 Programming Assigement
* 02/15/2025
* Write additional code for testing your method.
* */


import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Running test cases...\n");

        // test case with 0s
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(0);
        System.out.println("Expected: 0, Actual: " + NardosArrayListTest.max(test1));
        System.out.println();

        // test case with negetive numbers
        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(-1);
        test2.add(-10);
        test2.add(-5);
        test2.add(0);
        System.out.println("Expected: 0, Actual: " + NardosArrayListTest.max(test2));
        System.out.println();

        // test postiive list
        ArrayList<Integer> test3 = new ArrayList<>();
        test1.add(60);
        test1.add(50);
        test1.add(40);
        test1.add(30);
        test1.add(20);
        System.out.println("Expected: 60, Actual: " + NardosArrayListTest.max(test1));
        System.out.println();

        // test with multi max value
        ArrayList<Integer> test5 = new ArrayList<>();
        test5.add(7);
        test5.add(2);
        test5.add(7);
        test5.add(0);
        System.out.println("Expected: 7, Actual: " + NardosArrayListTest.max(test5));
    }
}
