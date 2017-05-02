package Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteDecorator;

import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent.Beverage;
import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseDecorator.CondimentDecorator;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return .2 + beverage.cost();
    }
}
