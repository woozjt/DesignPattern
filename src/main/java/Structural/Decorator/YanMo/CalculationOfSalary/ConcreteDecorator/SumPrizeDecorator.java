package Structural.Decorator.YanMo.CalculationOfSalary.ConcreteDecorator;

import Structural.Decorator.YanMo.CalculationOfSalary.BaseComponent.Component;
import Structural.Decorator.YanMo.CalculationOfSalary.BaseDecorator.Decorator;

import java.util.Date;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class SumPrizeDecorator extends Decorator {
    public SumPrizeDecorator(Component c) {
        super(c);
    }

    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double prize = 1000000 * 0.001;
        System.out.println(user + "Sum Bonus: " + prize);
        return money + prize;
    }
}
