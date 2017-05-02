package Behavioral.State.HeadFirst.第3版增加状态.ConcreteClass;

import Behavioral.State.HeadFirst.第3版增加状态.BaseClass.State;
import Behavioral.State.HeadFirst.第3版增加状态.Client.GumballMachine;

import java.util.Random;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter插入25分钱() {
        System.out.println("你已经投入25分钱");
    }

    public void ejectQuarter退回25分钱() {
        System.out.println("退还25分钱");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank转动曲柄() {
        System.out.println("正在转动......");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }

    }

    public void dispense发放糖果() {
        System.out.println("没有糖果可以发放（不恰当的动作）");
    }
}
