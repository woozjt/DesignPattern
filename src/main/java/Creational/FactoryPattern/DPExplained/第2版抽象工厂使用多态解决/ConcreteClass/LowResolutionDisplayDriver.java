package Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.ConcreteClass;

import Creational.FactoryPattern.DPExplained.第2版抽象工厂使用多态解决.BaseClass.DisplayDriver;

/**
 * Created by sahoo on 16/5/6.
 */
public class LowResolutionDisplayDriver implements DisplayDriver {
    public void draw() {
        System.out.println("LRDD:LowResolutionDisplayDriver");
    }
}
