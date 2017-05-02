package Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteComponent;

import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent.Beverage;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 5.88;
    }
}
