package Behavioral.Strategy.HeadFirst.第3版Interface抽象行为接口Subclass实现.ConcreteClass;

import Behavioral.Strategy.HeadFirst.第3版Interface抽象行为接口Subclass实现.BaseClass.Duck;

/**
 * Created by sahoo on 16/4/24.
 */
public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("诱饵鸭");
    }

}
