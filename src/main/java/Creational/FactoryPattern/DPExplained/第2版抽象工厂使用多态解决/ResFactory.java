package Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决;

import Creational.FactoryPattern.DPExplained.第1版抽象工厂的场景switch控制.RESOLUTION;
import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.BaseClass.*;
import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.ConcreteClass.*;

/**
 * Created by sahoo on 16/5/6.
 */
public class ResFactory {
    public static DisplayDriver createDisplayDriver(RESOLUTION aResolution) {
        switch (aResolution) {
            case LOW:
                return new LowResolutionDisplayDriver();
            case HIGH:
                return new HighResolutionDisplayDriver();
        }
        return null;
    }

    public static PrintDriver createPrintDriver(RESOLUTION aResolution){
        switch (aResolution) {
            case LOW:
                return new LowResolutionPrintDriver();
            case HIGH:
                return new HighResolutionPrintDriver();
        }
        return null;
    }
}
