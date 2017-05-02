package Behavioral.Strategy.HeadFirst.第1版Baseclass实现行为Subclass可覆盖.BaseClass;

/**
 * Created by sahoo on 16/4/23.
 */
public abstract class Duck {
    public void quack() {
        System.out.println("呱呱!");
    }

    public void swim() {
        System.out.println("I'm swimming!");
    }

    public void fly(){
        System.out.println("I'm flying!");
    }

    public abstract void display();
}
