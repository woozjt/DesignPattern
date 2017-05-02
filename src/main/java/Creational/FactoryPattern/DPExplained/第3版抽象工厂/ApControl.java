package Creational.FactoryPattern.DPExplained.第3版抽象工厂;

import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Base创建对象.DisplayDriver;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Base创建对象.PrintDriver;

/**
 * Created by sahoo on 16/5/7.
 */
public class ApControl {
    ResFactory myResFactory;
    DisplayDriver myDisplayDriver;
    PrintDriver myPrintDriver;

    public ApControl() {
        myResFactory = ResFactory.getFactory();
        myDisplayDriver = myResFactory.getDispDrvr();
        myPrintDriver = myResFactory.getPrtDrvr();
    }

    public void doDraw() {
        myDisplayDriver.draw();
    }

    public void doPrint() {
        myPrintDriver.print();
    }
}
