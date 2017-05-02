package Structural.Facade.HeadFirst.第1版操作繁琐;

import Structural.Facade.HeadFirst.SubSystem.*;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class FacadeTestDriverV1 {

    public static void start() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        String movie = "Raiders of the Lost Ark";

        System.out.println("Get ready to watch a movie......");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDve(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);

        System.out.println("Shutting movie theater down......");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
