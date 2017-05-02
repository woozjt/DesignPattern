package Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete原料抽象工厂;

import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete原料.*;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料.*;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base原料抽象工厂.PizzaIngredientFactory;

/**
 * Created by zhangjiantao on 2016/5/3.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDought();
    }

    public Sauce createSauce() {
       return new PlumTomatoSause();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
            return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
