/*
  Nardos Gebremedhin
  Module 8 Programming Assigement
  02/15/2025

In this program I will be creating
    A method that receives an ArrayList populated with an Integer data type received from user input.
    The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
    The ArrayList is then to be sent to the method.
    The method is then to return the largest value in the ArrayList.
    If the ArrayList is sent in empty, the method will then return 0.
    The method signature is to be public static Integer max (ArrayList list).
    Write additional code for testing your method.
    The method will return the largest value that is displayed to the user.
**/


import java.util.ArrayList;
import java.util.Scanner;

public class NardosArrayListTest {

    // method to find the max value in the array list
    public static Integer max(ArrayList<Integer> list) {
        int maxValue = 0;

        // looping through the list
        for (int i=0; i <list.size(); i++){
            if (list.get(i) > maxValue){
                maxValue = list.get(i);
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        //scanner object
        Scanner myscanner = new Scanner(System.in);
        // empty arraylist
        ArrayList<Integer> numberList = new ArrayList<>();

        //user input
        System.out.println("Enter integers (Enter 0 to stop):");

        while(true){
            // reading user input
            int userInput = myscanner.nextInt();
            //adding the input into the list
            numberList.add(userInput);

            // end the loop if user enters 0
            if (userInput == 0){
                break;
            }
        }
        //close scanner
        myscanner.close();

        //store the returned value
        int result = max(numberList);
        System.out.println("The largest number in the list is: " + result);
    }


}

