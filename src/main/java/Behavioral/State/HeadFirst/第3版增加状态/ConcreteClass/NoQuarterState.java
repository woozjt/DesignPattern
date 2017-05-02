package Behavioral.State.HeadFirst.第3版增加状态.ConcreteClass;

import Behavioral.State.HeadFirst.第3版增加状态.BaseClass.State;
import Behavioral.State.HeadFirst.第3版增加状态.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter插入25分钱() {
        System.out.println("我们接受了25分钱");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter退回25分钱() {
        System.out.println("你没有投入25分钱");
    }

    public void turnCrank转动曲柄() {
        System.out.println("你转动了曲柄，但是我没有得到25分钱");
    }

    public void dispense发放糖果() {
        System.out.println("你需要先付25分钱");
    }
}
