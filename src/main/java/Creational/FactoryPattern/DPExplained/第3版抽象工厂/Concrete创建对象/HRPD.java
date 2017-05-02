package Creational.FactoryPattern.DPExplained.第3版抽象工厂.Concrete创建对象;

import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Base创建对象.PrintDriver;

/**
 * Created by sahoo on 16/5/7.
 */
public class HRPD extends PrintDriver {
    @Override
    public void print() {

        System.out.println("HRPD");
    }
}
