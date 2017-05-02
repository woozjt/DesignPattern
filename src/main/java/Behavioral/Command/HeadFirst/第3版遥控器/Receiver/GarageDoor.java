package Behavioral.Command.HeadFirst.第3版遥控器.Receiver;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }


    public void up() {
        System.out.println(this.name + ": GarageDoor is Up.");
    }

    public void down() {
        System.out.println(this.name + ": GarageDoor is Down.");
    }
}
