package Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public abstract class Beverage {
    protected String description="Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
