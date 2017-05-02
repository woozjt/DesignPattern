package Structural.Facade.HeadFirst.第2版简易灵活;

import Structural.Facade.HeadFirst.SubSystem.*;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class FacadeTestDriveV2 {

    public static void start() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(amp,tuner,dvd,cd,projector,lights,screen,popper);
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}
