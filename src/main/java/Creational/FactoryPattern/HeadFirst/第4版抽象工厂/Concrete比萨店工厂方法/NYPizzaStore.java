package Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete比萨店工厂方法;

import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete比萨.*;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料抽象工厂.PizzaIngredientFactory;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete原料抽象工厂.NYPizzaIngredientFactory;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base比萨.Pizza;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base比萨店工厂方法.PizzaStore;

/**
 * Created by sahoo on 16/5/3.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}
