package Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决;

import Creational.FactoryPattern.DPExplained.第1版抽象工厂的场景switch控制.RESOLUTION;
import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.BaseClass.DisplayDriver;
import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.BaseClass.PrintDriver;

/**
 * Created by sahoo on 16/5/6.
 */
public class AbstractFactoryTestDriveV2 {
    public static void Start() {
        DisplayDriver myDisplayDriver = ResFactory.createDisplayDriver(RESOLUTION.LOW);
        PrintDriver myPrintDriver = ResFactory.createPrintDriver(RESOLUTION.LOW);
        ApControl myApControl = new ApControl(myDisplayDriver, myPrintDriver);
        myApControl.doDraw();
        myApControl.doPring();
    }
}
