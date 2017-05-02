package Behavioral.Command.HeadFirst.第3版遥控器.Receiver;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class TV {
    String name;

    public TV(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + ": TV is On.");
    }

    public void off() {
        System.out.println(this.name + ": TV is Off.");
    }
}
