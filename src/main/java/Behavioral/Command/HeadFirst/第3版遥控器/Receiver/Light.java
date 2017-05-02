package Behavioral.Command.HeadFirst.第3版遥控器.Receiver;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + ": Light is On.");
    }

    public void off() {
        System.out.println(this.name + ": Light is Off.");
    }
}
