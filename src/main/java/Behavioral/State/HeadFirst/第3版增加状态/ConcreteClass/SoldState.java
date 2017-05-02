package Behavioral.State.HeadFirst.第3版增加状态.ConcreteClass;

import Behavioral.State.HeadFirst.第3版增加状态.BaseClass.State;
import Behavioral.State.HeadFirst.第3版增加状态.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter插入25分钱() {
        System.out.println("请稍候，我们马上给你一颗糖果（不恰当的动作）");
    }

    public void ejectQuarter退回25分钱() {
        System.out.println("抱歉，你已经转过曲柄了（不恰当的动作）");
    }

    public void turnCrank转动曲柄() {
        System.out.println("不会因为转两次曲柄就能拿到两次糖果（不恰当的动作）");
    }

    public void dispense发放糖果() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("哦，糖果已经售罄");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
