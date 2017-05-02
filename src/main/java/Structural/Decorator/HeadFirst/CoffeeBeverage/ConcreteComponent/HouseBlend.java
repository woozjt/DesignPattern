package Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteComponent;

import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent.Beverage;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 2.89;
    }
}
