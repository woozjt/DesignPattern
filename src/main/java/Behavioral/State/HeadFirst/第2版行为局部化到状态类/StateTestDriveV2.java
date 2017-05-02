package Behavioral.State.HeadFirst.第2版行为局部化到状态类;

import Behavioral.State.HeadFirst.第2版行为局部化到状态类.Client.GumballMachine;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public class StateTestDriveV2 {
    public static void start() {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println("\n1." + gumballMachine);

        gumballMachine.turnCrank();

        System.out.println("\n2." + gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println("\n3." + gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println("\n4." + gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("\n5." + gumballMachine);
    }
}
