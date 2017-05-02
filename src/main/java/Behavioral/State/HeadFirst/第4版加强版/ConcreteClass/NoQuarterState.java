package Behavioral.State.HeadFirst.第4版加强版.ConcreteClass;

import Behavioral.State.HeadFirst.第4版加强版.BaseClass.State;
import Behavioral.State.HeadFirst.第4版加强版.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class NoQuarterState extends State {

    public NoQuarterState(GumballMachine gumballMachine) {
        Name="No Quarter";this.gumballMachine = gumballMachine;
    }

    public void insertQuarter插入25分钱() {
        weReceiveQuarter();
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter退回25分钱() {
        noInsertQuarter();
    }

    public void turnCrank转动曲柄() {
        youTurnedButNoInsert();
    }

    public void dispense发放糖果() {
        needInsertQuarter();
    }
}
