package Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteComponent;

import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent.Beverage;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
