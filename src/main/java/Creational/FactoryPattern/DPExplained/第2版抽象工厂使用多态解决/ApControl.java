package Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决;

import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.BaseClass.DisplayDriver;
import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.BaseClass.PrintDriver;

/**
 * Created by sahoo on 16/5/6.
 */
public class ApControl {
    private DisplayDriver myDisplayDriver;
    private PrintDriver myPrintDriver;

    public ApControl(DisplayDriver myDisplayDriver, PrintDriver myPrintDriver) {
        this.myDisplayDriver = myDisplayDriver;
        this.myPrintDriver = myPrintDriver;
    }

    public void doDraw() {
        myDisplayDriver.draw();
    }

    public void doPring() {
        myPrintDriver.print();
    }
}

