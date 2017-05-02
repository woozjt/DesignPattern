package Structural.Facade.HeadFirst.SubSystem;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class TheaterLights {

    public void on() {
        System.out.println("TheaterLights is On.");
    }

    public void off() {
        System.out.println("TheaterLights is Off.");
    }

    public void dim(int i) {
        System.out.println("TheaterLights dim = " + i);
    }
}
