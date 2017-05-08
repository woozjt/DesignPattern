package Creational.FactoryPattern.HeadFirst.第4版抽象工厂;

import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete比萨店工厂方法依赖原料工厂.Chicago披萨店使用Chicago原料工厂;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Concrete比萨店工厂方法依赖原料工厂.NY披萨店使用NY原料工厂;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base比萨.Pizza;
import Creational.FactoryPattern.HeadFirst.第4版抽象工厂.Base比萨店工厂方法.PizzaStore;

/**
 * Created by zhangjiantao on 2016/5/3.
 */
public class HF_FactoryTestDriveV4 {
    public static void Start(){
        PizzaStore nyStore = new NY披萨店使用NY原料工厂();
        PizzaStore chicagoStore = new Chicago披萨店使用Chicago原料工厂();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
