package Behavioral.Strategy.HeadFirst.第1版Baseclass实现行为Subclass可覆盖.ConcreteClass;

import Behavioral.Strategy.HeadFirst.第1版Baseclass实现行为Subclass可覆盖.BaseClass.Duck;

/**
 * Created by sahoo on 16/4/23.
 */
public class RedheadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("外观是红头");
    }
}
