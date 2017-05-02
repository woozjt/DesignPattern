package Behavioral.State.HeadFirst.第4版加强版.BaseClass;

import Behavioral.State.HeadFirst.第4版加强版.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public abstract class State {
    public GumballMachine gumballMachine;
    public String Name;

    public abstract void insertQuarter插入25分钱();

    public abstract void ejectQuarter退回25分钱();

    public abstract void turnCrank转动曲柄();

    public abstract void dispense发放糖果();

    protected void needInsertQuarter() {
        System.out.println(Name + " " + "你需要先付25分钱");
    }

    protected void noInsertQuarter() {
        System.out.println(Name + " " + "你还没有投入25分钱。");
    }

    protected void alreadyInsertQuarter() {
        System.out.println(Name + " " + "你已经投入25分钱。");
    }

    protected void youTurnedButNoInsert() {
        System.out.println(Name + " " + "你转动了曲柄，但是我没有得到25分钱");
    }

    protected void weReceiveQuarter() {
        System.out.println(Name + " " + "我们接受了25分钱");
    }

    protected void readyDispenseQuarter() {
        System.out.println(Name + " " + "请稍候，我们马上给你一颗糖果");
    }

    protected void quarterSoldOut() {
        System.out.println(Name + " " + "糖果已经售罄");
    }

    protected void noQuarter() {
        System.out.println(Name + " " + "没有糖果可以发放（不恰当的动作）");
    }

    protected void returnQuarter() {
        System.out.println(Name + " " + "退还25分钱");
    }

    protected void youTurned() {
        System.out.println(Name + " " + "抱歉，你已经转过曲柄了");
    }

    protected void turning() {
        System.out.println(Name + " " + "正在转动......");
    }

    protected void turnTwoTime() {
        System.out.println(Name + " " + "不会因为转两次曲柄就能拿到两次糖果");
    }

    protected void youWinner() {
        System.out.println(Name + " " + "你是赢家，你投入的25分钱可以得到两个糖果。");
    }
}
