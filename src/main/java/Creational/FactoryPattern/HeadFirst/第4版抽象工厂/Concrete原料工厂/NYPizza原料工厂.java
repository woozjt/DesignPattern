package Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete原料工厂;

import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料工厂.Pizza原料工厂;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete原料.*;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料.*;


/**
 * Created by sahoo on 16/5/1.
 * 这是个具体工厂，很像简单工厂，创建很多具体的对象
 */
public class NYPizza原料工厂 implements Pizza原料工厂 {
    public Dough createDough() {
        return new ThinCrustDought();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[]={new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
