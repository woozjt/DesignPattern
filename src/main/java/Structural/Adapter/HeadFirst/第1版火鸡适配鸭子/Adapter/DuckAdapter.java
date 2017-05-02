package Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Adapter;

import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Duck.BaseDuck;
import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Turkey.BaseTurkey;

import java.util.Random;

/**
 * Created by sahoo on 16/5/12.
 */
public class DuckAdapter implements BaseTurkey {
    BaseDuck duck;
    Random rand;

    public DuckAdapter(BaseDuck duck) {
        this.duck = duck;
        rand = new Random();
    }

    public void gobble() {
        duck.quack();

    }

    public void fly() {
        if (rand.nextInt(5) >2 ) {
            duck.fly();
        }
    }
}
