package Behavioral.Strategy.HeadFirst.第1版Baseclass实现行为Subclass可覆盖.ConcreteClass;

import Behavioral.Strategy.HeadFirst.第1版Baseclass实现行为Subclass可覆盖.BaseClass.Duck;

/**
 * Created by sahoo on 16/4/23.
 */
public class RubberDuck extends Duck {

    public void quack() {
        System.out.println("吱吱！");
    }

    public void fly() {
        // 覆盖，变成什么事都不做
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }
}
