package Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第2版进一步抽取算法骨架.ConcreteClass;

import Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第2版进一步抽取算法骨架.BaseClass.CaffeineBeverage;

/**
 * Created by sahoo on 16/4/26.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
