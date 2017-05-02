package Behavioral.State.HeadFirst.第4版加强版.ConcreteClass;

import Behavioral.State.HeadFirst.第4版加强版.BaseClass.State;
import Behavioral.State.HeadFirst.第4版加强版.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class SoldState extends State {

    public SoldState(GumballMachine gumballMachine) {
        Name="Sold";this.gumballMachine = gumballMachine;
    }

    public void insertQuarter插入25分钱() {
        readyDispenseQuarter();
    }

    public void ejectQuarter退回25分钱() {
        youTurned();
    }

    public void turnCrank转动曲柄() {turnTwoTime(); }

    public void dispense发放糖果() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            quarterSoldOut();
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
