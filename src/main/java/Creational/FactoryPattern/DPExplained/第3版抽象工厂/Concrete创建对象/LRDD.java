package Creational.FactoryPattern.DPExplained.第3版抽象工厂.Concrete创建对象;

import Creational.FactoryPattern.DPExplained.第3版抽象工厂.Base创建对象.DisplayDriver;

/**
 * Created by sahoo on 16/5/7.
 */
public class LRDD extends DisplayDriver {
    @Override
    public void draw() {

        System.out.println("LRDD");
    }
}
