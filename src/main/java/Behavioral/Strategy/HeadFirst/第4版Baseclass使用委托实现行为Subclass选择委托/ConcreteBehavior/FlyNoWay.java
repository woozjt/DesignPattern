package Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.ConcreteBehavior;

import Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.BaseBehavior.FlyBehavior;

/**
 * Created by sahoo on 16/4/24.
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I'm can't fly");
    }
}
