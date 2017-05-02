package Behavioral.Strategy.HeadFirst.第2版Baseclass抽象行为接口Subclass实现.ConcreteClass;


import Behavioral.Strategy.HeadFirst.第2版Baseclass抽象行为接口Subclass实现.BaseClass.Duck;

/**
 * Created by sahoo on 16/4/23.
 */
public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("吱吱！");
    }

    @Override
    public void fly() {
// 覆盖，变成什么事都不做
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }

}
