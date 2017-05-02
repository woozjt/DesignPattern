package Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.ConcreteClass;

import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.BaseClass.PrintDriver;

public class HighResolutionPrintDriver implements PrintDriver {

    public void print() {

        System.out.println("HRPD:HighResolutionPrintDriver");
    }
}
