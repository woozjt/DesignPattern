package Behavioral.State.HeadFirst.第4版加强版;

import Behavioral.State.HeadFirst.第4版加强版.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public class StateTestDriveV4 {
    public static void start(){
        GumballMachine gumballMachine=new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
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
