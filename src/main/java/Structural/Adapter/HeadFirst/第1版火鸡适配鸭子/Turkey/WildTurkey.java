package Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Turkey;

/**
 * Created by sahoo on 16/5/11.
 */
public class WildTurkey implements BaseTurkey {

    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
