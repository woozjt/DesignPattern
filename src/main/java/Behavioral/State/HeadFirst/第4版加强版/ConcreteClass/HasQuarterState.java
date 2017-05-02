package Behavioral.State.HeadFirst.第4版加强版.ConcreteClass;

import Behavioral.State.HeadFirst.第4版加强版.BaseClass.State;
import Behavioral.State.HeadFirst.第4版加强版.Client.GumballMachine;

import java.util.Random;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class HasQuarterState extends State {
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        Name="Has Quarter";this.gumballMachine = gumballMachine;
    }

    public void insertQuarter插入25分钱() {
        alreadyInsertQuarter();
    }

    public void ejectQuarter退回25分钱() {
        returnQuarter();
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank转动曲柄() {
        turning();
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense发放糖果() {
        noQuarter();
    }
}
