package Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteComponent;

import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent.Beverage;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 3.55;
    }
}
