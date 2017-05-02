package Structural.Facade.HeadFirst.SubSystem;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class Amplifier {

    private DvdPlayer dve;

    public void on() {
        System.out.println("Amplifier is On.");
    }

    public void off() {
        System.out.println("Amplifier is Off.");
    }

    public void setDve(DvdPlayer dve) {
        this.dve = dve;
        System.out.println("Amplifier set DVD is "+ this.dve.getClass());
    }

    public void setSurroundSound() {
        System.out.println("Amplifier set SurroundSound is bigger");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier set setVolume = "+ volume);
    }
}
