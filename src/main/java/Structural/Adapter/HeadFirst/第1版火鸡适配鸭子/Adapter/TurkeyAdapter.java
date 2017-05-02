package Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Adapter;

import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Duck.BaseDuck;
import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Turkey.BaseTurkey;

/**
 * Created by sahoo on 16/5/11.
 */
public class TurkeyAdapter implements BaseDuck {
    BaseTurkey turkey;

    public TurkeyAdapter(BaseTurkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
