package Behavioral.State.HeadFirst.第2版行为局部化到状态类.Client;

import Behavioral.State.HeadFirst.第2版行为局部化到状态类.BaseClass.State;
import Behavioral.State.HeadFirst.第2版行为局部化到状态类.ConcreteClass.HasQuarterState;
import Behavioral.State.HeadFirst.第2版行为局部化到状态类.ConcreteClass.NoQuarterState;
import Behavioral.State.HeadFirst.第2版行为局部化到状态类.ConcreteClass.SoldOutState;
import Behavioral.State.HeadFirst.第2版行为局部化到状态类.ConcreteClass.SoldState;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;


    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        this.count = numberGumballs;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter插入25分钱();
    }

    public void ejectQuarter() {
        state.ejectQuarter退回25分钱();
    }

    public void turnCrank() {
        state.turnCrank转动曲柄();
        state.dispense发放糖果();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot......");
        if (count != 0) {
            count = count - 1;
        }
    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }


    public String toString() {
        StringBuffer stringGumball = new StringBuffer();
        stringGumball.append("Mighty Gumball, Inc. V2");
        stringGumball.append("\nJava-enabled Standing Gumball Model");

        stringGumball.append("\nInventory:" + count + " gumballs");
        if (count > 0) {
            stringGumball.append("\nMachine is waiting for quarter\n");
        } else {
            stringGumball.append("\nMachine is sold out");
        }

        return stringGumball.toString();
    }
}
