package Creational.FactoryPattern.DPExplained.第3版抽象工厂;

import Creational.FactoryPattern.DPExplained.第1版抽象工厂的场景switch控制.RESOLUTION;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Base创建对象.DisplayDriver;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Base创建对象.PrintDriver;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Concrete抽象工厂.HighResFact;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Concrete抽象工厂.LowResFact;

/**
 * Created by sahoo on 16/5/7.
 */
public abstract class ResFactory {

    public static RESOLUTION myResolution=RESOLUTION.HIGH;

    public static ResFactory getFactory() {
        switch (myResolution) {
            case LOW:
                return new  LowResFact();
            case HIGH:
                return  new HighResFact();
        }
        return null;
    }

    public abstract DisplayDriver getDispDrvr();

    public abstract PrintDriver getPrtDrvr() ;
}
