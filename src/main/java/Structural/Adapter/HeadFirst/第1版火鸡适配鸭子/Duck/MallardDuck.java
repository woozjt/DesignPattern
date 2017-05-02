package Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Duck;

/**
 * Created by sahoo on 16/5/11.
 */
public class MallardDuck implements BaseDuck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
