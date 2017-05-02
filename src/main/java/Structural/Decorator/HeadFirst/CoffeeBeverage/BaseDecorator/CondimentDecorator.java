package Structural.Decorator.HeadFirst.CoffeeBeverage.BaseDecorator;

import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent.Beverage;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription() ;
}

