package Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.ConcreteClass;

import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.BaseClass.PrintDriver;

/**
 * Created by sahoo on 16/5/6.
 */
public class LowResolutionPrintDriver implements PrintDriver {
    public void print() {

        System.out.println("LRPD:LowResolutionPrintDriver");
    }
}
