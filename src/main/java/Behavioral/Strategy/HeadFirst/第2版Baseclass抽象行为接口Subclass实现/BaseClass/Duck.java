package Behavioral.Strategy.HeadFirst.第2版Baseclass抽象行为接口Subclass实现.BaseClass;

/**
 * Created by sahoo on 16/4/23.
 */
public abstract class Duck {

    public void swim() {
        System.out.println("I'm swimming!");
    }

    public abstract void quack() ;

    public abstract void fly();

    public abstract void display();

}