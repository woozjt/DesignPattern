package Behavioral.Strategy.HeadFirst.第3版Interface抽象行为接口Subclass实现.ConcreteClass;

import Behavioral.Strategy.HeadFirst.第3版Interface抽象行为接口Subclass实现.BaseClass.Duck;
import Behavioral.Strategy.HeadFirst.第3版Interface抽象行为接口Subclass实现.BaseClass.Flyable;
import Behavioral.Strategy.HeadFirst.第3版Interface抽象行为接口Subclass实现.BaseClass.Quackable;

/**
 * Created by sahoo on 16/4/24.
 */
public class RedheadDuck extends Duck implements Flyable,Quackable {
    @Override
    public void display() {
        System.out.println("外观是红头鸭");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    public void quack() {
        System.out.println("呱呱！");
    }
}
