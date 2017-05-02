package Creational.FactoryPattern.DPExplained.第1版抽象工厂的场景switch控制;

/**
 * Created by sahoo on 16/5/6.
 */
public class ApControl {
    public ApControl(RESOLUTION myResolution) {
        this.myResolution = myResolution;
    }

    private RESOLUTION myResolution;

    public void doDraw(){
        switch (myResolution) {
            case LOW:
                break;
            case HIGH:
                break;
        }
    }

    public void doPrint(){
        switch (myResolution) {
            case LOW:
                break;
            case HIGH:
                break;
        }
    }
}

