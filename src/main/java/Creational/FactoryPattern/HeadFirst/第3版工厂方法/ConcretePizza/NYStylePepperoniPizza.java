package Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcretePizza;

import Creational.FactoryPattern.HeadFirst.第1版具体类导致脆弱的代码.BasePizza.Pizza;

/**
 * Created by sahoo on 16/4/30.
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
