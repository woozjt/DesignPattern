package Creational.FactoryPattern.DPExplained.第3版抽象工厂.Concrete抽象工厂;

import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Base创建对象.DisplayDriver;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Base创建对象.PrintDriver;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Concrete创建对象.LRDD;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Concrete创建对象.LRPD;
import Creational.FactoryPattern.DPExplained.第3版抽象工厂.ResFactory;

/**
 * Created by sahoo on 16/5/7.
 */
public class LowResFact extends ResFactory {
    @Override
    public DisplayDriver getDispDrvr() {
        return new LRDD();
    }

    @Override
    public PrintDriver getPrtDrvr() {
        return new LRPD();
    }
}
