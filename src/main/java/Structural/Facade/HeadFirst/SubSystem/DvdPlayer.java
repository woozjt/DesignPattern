package Structural.Facade.HeadFirst.SubSystem;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class DvdPlayer {

    public void on() {
        System.out.println("DvdPlayer is On.");
    }

    public void off() {
        System.out.println("DvdPlayer is Off.");
    }

    public void play(String movie) {
        System.out.println("DvdPlay is play " + movie);
    }

    public void stop() {
        System.out.println("DvdPlayer is Stop..");
    }

    public void eject() {
        System.out.println("DvdPlayer is Eject..");
    }
}
