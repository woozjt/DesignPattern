package Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.ConcreteBehavior;

import Behavioral.Strategy.HeadFirst.第4版Baseclass使用委托实现行为Subclass选择委托.BaseBehavior.QuackBehavior;

/**
 * Created by sahoo on 16/4/24.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("吱吱！");
    }
}
