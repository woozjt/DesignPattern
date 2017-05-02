package Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcreteStore;

import Creational.FactoryPattern.HeadFirst.第1版具体类导致脆弱的代码.BasePizza.Pizza;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.BaseClass.PizzaStore;
import Creational.FactoryPattern.HeadFirst.第3版工厂方法.ConcretePizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}

