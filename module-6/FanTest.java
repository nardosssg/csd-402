// Nardos Gebremedhin
// Module 6 Programming Assigment
// 01/31/2025
// This program creates two instances of the Fan class, one using the default constructor and the other using the argument construction
// display the functionality of the Fan class methods


public class FanTest {
    public static void main (String[] args){
        // instances of the Fan class
        Fan myFan1 = new Fan();
        Fan myFan2 = new Fan(Fan.FAST, true,7, "blue");

        //display default fan state
        System.out.println("Default Fan");
        System.out.println(myFan1);
        System.out.println();

        //display custom fan state
        System.out.println("Custom Fan");
        System.out.println(myFan2);
        System.out.println();

        // modifying default fan
        myFan1.setSpeed(Fan.MEDIUM);
        myFan1.setFanON(true);
        myFan1.setRadius(8);
        myFan1.setColor("yellow");

        // displaying the updated fan state
        System.out.println("Updated Default Fan");
        System.out.println(myFan1);

    }
}
