/*
 * Nardos Gebremedhin
 * 02/15/2025
 * Module 9 Programing Assigment
 *
 * In this program I will be:
 *   creating an ArrayList filled with a minimum of 10 Strings.
 *   Use a ‘for-each’ loop to print the ArrayList collection.
 *   Then ask a user which element they would like to see again.
 *   Then, attempt printing the element in a try/catch format which will result in the element being displayed.
 *   If the element value received is invalid,
 *   display a message that an Exception has been thrown displaying “Out of Bounds”.
 *   In this program, include the use of Autoboxing/Auto-Unboxing, working with a user String input.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        // create an arraylist that has 10 strings
        ArrayList<String> item = new ArrayList();
        item.add("Romance");
        item.add("Thriller");
        item.add("Action");
        item.add("Comedy");
        item.add("Mystery");
        item.add("Sci-fi");
        item.add("Horror");
        item.add("Fantasy");
        item.add("Drama");
        item.add("Anime");

        // use a for loop and display the arraylist and
        System.out.println("The list of items: ");
        for (String items : item) {
            System.out.println(item);
        }

        // ask the user what they want to see
        Scanner myscanner = new Scanner(System.in);
        System.out.print("\nEnter the element you want to see again (0 to 9): ");
        try {
            // read user input and display the element
            int index = Integer.parseInt(myscanner.nextLine());
            System.out.println("The element at index " + index + " is: " + item.get(index));
        } catch (IndexOutOfBoundsException e) {
            // handle invalid index and display an error message
            System.out.println("Out of Bounds: The index you entered is invalid.");

        }
    }
}
