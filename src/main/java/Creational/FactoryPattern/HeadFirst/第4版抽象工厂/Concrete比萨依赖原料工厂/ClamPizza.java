package Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete比萨依赖原料工厂;

import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料工厂.Pizza原料工厂;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base比萨.Pizza;

/**
 * Created by sahoo on 16/5/3.
 */
public class ClamPizza extends Pizza {
    Pizza原料工厂 ingredientFactory;

    public ClamPizza(Pizza原料工厂 ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
