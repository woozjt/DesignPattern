package Behavioral.Command.HeadFirst.第3版遥控器.Receiver;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + ":Stereo is On.");
    }

    public void off() {
        System.out.println(this.name + ":Stereo is Off.");
    }

    public void setCD() {
        System.out.println(this.name + ":Stereo is Setting CD.");
    }

    public void setVolume(int size) {
        System.out.println(this.name + ":Stereo setting volume to " + size);
    }
}
