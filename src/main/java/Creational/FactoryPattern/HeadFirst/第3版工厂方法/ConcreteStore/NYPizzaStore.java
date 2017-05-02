package Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcreteStore;

import Creational.FactoryPattern.HeadFirst.第1版具体类导致脆弱的代码.BasePizza.Pizza;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.BaseClass.PizzaStore;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcretePizza.NYStyleCheesePizza;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcretePizza.NYStyleClamPizza;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcretePizza.NYStylePepperoniPizza;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcretePizza.NYStyleVeggiePizza;

/**
 * Created by sahoo on 16/4/30.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
