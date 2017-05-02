package Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteDecorator;

import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent.Beverage;
import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseDecorator.CondimentDecorator;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }
}
