package Behavioral.State.HeadFirst.第4版加强版.ConcreteClass;

import Behavioral.State.HeadFirst.第4版加强版.BaseClass.State;
import Behavioral.State.HeadFirst.第4版加强版.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class SoldOutState extends State {

    public SoldOutState(GumballMachine gumballMachine) {
        Name="Sold Out";this.gumballMachine = gumballMachine;
    }


    public void insertQuarter插入25分钱() {
        quarterSoldOut();
    }

    public void ejectQuarter退回25分钱() {
        noInsertQuarter();
    }

    public void turnCrank转动曲柄() {
        quarterSoldOut();
    }

    public void dispense发放糖果() {
        quarterSoldOut();
    }
}
