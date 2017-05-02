package Creational.FactoryPattern.HeadFirst.第3版工厂方法;

import Creational.FactoryPattern.HeadFirst.第1版具体类导致脆弱的代码.BasePizza.Pizza;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.BaseClass.PizzaStore;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcreteStore.ChicagoPizzaStore;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcreteStore.NYPizzaStore;

/**
 * Created by sahoo on 16/4/30.
 */
public class PizzaTestDrive {
    public static void start() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
