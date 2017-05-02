package Behavioral.Command.HeadFirst.第3版遥控器.Receiver;

public class CeilingFanWithStatus {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFanWithStatus(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(this.location +" ceiling fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(this.location +" ceiling fan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(this.location +" ceiling fan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println(this.location +" ceiling fan is on off");
    }

    public int getSpeed() {
        return speed;
    }
}
