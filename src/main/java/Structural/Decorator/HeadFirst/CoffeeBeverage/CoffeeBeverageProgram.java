package Structural.Decorator.HeadFirst.CoffeeBeverage;

import Structural.Decorator.HeadFirst.CoffeeBeverage.BaseComponent.Beverage;
import Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteComponent.DarkRoast;
import Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteComponent.Espresso;
import Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteComponent.HouseBlend;
import Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteDecorator.Mocha;
import Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteDecorator.Soy;
import Structural.Decorator.HeadFirst.CoffeeBeverage.ConcreteDecorator.Whip;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class CoffeeBeverageProgram {
    public static void start() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $:" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $:" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Whip(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription() + " $:" + beverage3.cost());

    }
}
