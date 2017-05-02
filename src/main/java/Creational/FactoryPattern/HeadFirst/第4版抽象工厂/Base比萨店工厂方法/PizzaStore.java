package Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base比萨店工厂方法;


import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base比萨.Pizza;

/**
 * Created by sahoo on 16/5/3.
 */

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}

