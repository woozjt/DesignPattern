package Behavioral.Strategy.HeadFirst.第2版Baseclass抽象行为接口Subclass实现.ConcreteClass;

import Behavioral.Strategy.HeadFirst.第2版Baseclass抽象行为接口Subclass实现.BaseClass.Duck;

/**
 * Created by sahoo on 16/4/23.
 */
public class MallardDuck extends Duck {

    @Override
    public void quack() { System.out.println("呱呱!"); }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

    @Override
    public void display() {
        System.out.println("外观是绿头");
    }
}
