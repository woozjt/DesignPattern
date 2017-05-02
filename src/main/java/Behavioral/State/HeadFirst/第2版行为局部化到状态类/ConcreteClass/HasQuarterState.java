package Behavioral.State.HeadFirst.第2版行为局部化到状态类.ConcreteClass;

import Behavioral.State.HeadFirst.第2版行为局部化到状态类.BaseClass.State;
import Behavioral.State.HeadFirst.第2版行为局部化到状态类.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter插入25分钱() {
        System.out.println("你已经投入25分钱，不能再投入另外的25分钱（不恰当的动作）");
    }

    public void ejectQuarter退回25分钱() {
        System.out.println("退还25分钱");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank转动曲柄() {
        System.out.println("正在转动......");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense发放糖果() {
        System.out.println("没有糖果可以发放（不恰当的动作）");
    }
}
