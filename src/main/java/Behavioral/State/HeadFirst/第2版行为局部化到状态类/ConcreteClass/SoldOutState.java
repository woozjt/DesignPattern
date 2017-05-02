package Behavioral.State.HeadFirst.第2版行为局部化到状态类.ConcreteClass;

import Behavioral.State.HeadFirst.第2版行为局部化到状态类.BaseClass.State;
import Behavioral.State.HeadFirst.第2版行为局部化到状态类.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter插入25分钱() {
        System.out.println("糖果已经售罄");
    }

    public void ejectQuarter退回25分钱() {
        System.out.println("你还没有投入25分钱，你不能要求退钱");
    }

    public void turnCrank转动曲柄() {
        System.out.println("糖果全部售完");
    }

    public void dispense发放糖果() {
        System.out.println("没有糖果可以发放");
    }
}
