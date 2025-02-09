//Nardos Gebremedhin
//02/08/2025
//Module 7 Programming Assisagmet


//This program creates and manages a collection of Fan instances,
//displaying their instance without using the toString() method.

import java.util.ArrayList;
import java.util.Collection;

class UseFans {

   // method taking a collection of Fan instances for displaying without using the toString() method.
    public static void displayFans(Collection<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println();
        }
    }

    // method that takes a single instance of a Fan for displaying without using the toString() method.
    public static void displayFan(Fan fan) {
        System.out.println("Fan Status: " + (fan.isFanON() ? "On" : "Off"));
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    public static void main(String[] args) {
        // creating a collection of Fans
        Collection<Fan> fans = new ArrayList<>();

        // adding Fan instances
        fans.add(new Fan(Fan.FAST, true, 10, "Blue"));
        fans.add(new Fan(Fan.MEDIUM, false, 8, "Red"));
        fans.add(new Fan(Fan.SLOW, true, 12, "Green"));
        fans.add(new Fan());

        // displaying the fans using the method
        displayFans(fans);
    }
}
