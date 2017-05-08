package Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料抽象工厂;

import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料.*;

/**
 * Created by sahoo on 16/5/1.
 */
public interface Pizza原料抽象工厂 {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
