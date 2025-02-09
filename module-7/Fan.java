public class Fan {
    //Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    // Private arguments
    private int speed;
    private boolean fanON;
    private int radius;
    String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.fanON = false;
        this.radius = 6;
        this.color = "white";
    }

    //constructor with arguments
    public Fan(int speed, boolean fanON, int radius, String color) {
        this.speed = speed;
        this.fanON = fanON;
        this.radius = radius;
        this.color = color;
    }

    // getter and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isFanON() {
        return fanON;
    }

    public void setFanON(boolean fanON) {
        this.fanON = fanON;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString method
    @Override
    public String toString() {
        if (fanON){
            return "Fan is on " + "Speed of the Fan: " + speed + " Radius: " + radius + " Color: " + color;
        } else {
            return  "Fan is off "  + " Radius: " + radius + " Color: " + color;
        }
    }

}
