package Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete比萨依赖原料工厂;

import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料抽象工厂.Pizza原料抽象工厂;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base比萨.Pizza;

/**
 * Created by zhangjiantao on 2016/5/3.
 */
public class PepperoniPizza extends Pizza {
    Pizza原料抽象工厂 ingredientFactory;

    public PepperoniPizza(Pizza原料抽象工厂 ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
