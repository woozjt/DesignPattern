package Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.ConcreteDuck;

import Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.BaseDuck.Duck;
import Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.ConcreteBehavior.FlyNoWay;
import Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.ConcreteBehavior.MuteQuack;

/**
 * Created by sahoo on 16/4/24.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("诱饵鸭");
        
    }
}
