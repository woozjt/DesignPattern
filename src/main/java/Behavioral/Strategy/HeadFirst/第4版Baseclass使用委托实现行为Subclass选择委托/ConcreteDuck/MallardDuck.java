package Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.ConcreteDuck;

import Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.BaseDuck.Duck;
import Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.ConcreteBehavior.FlyWithWings;
import Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.ConcreteBehavior.Quack;

/**
 * Created by sahoo on 16/4/24.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
