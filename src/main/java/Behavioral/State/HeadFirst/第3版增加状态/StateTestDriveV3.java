package Behavioral.State.HeadFirst.第3版增加状态;

import Behavioral.State.HeadFirst.第3版增加状态.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class StateTestDriveV3 {
    public static void start(){
        GumballMachine gumballMachine=new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
