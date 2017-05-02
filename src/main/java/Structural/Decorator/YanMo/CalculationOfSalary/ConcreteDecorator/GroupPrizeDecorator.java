package Structural.Decorator.YanMo.CalculationOfSalary.ConcreteDecorator;

import Structural.Decorator.YanMo.CalculationOfSalary.BaseComponent.Component;
import Structural.Decorator.YanMo.CalculationOfSalary.BaseDecorator.Decorator;
import Structural.Decorator.YanMo.CalculationOfSalary.Data.TempDB;

import java.util.Date;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class GroupPrizeDecorator extends Decorator {
    public GroupPrizeDecorator(Component c) {
        super(c);
    }

    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double group = 0.0;
        for (double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + " 当月 Team Business Bonus: " + prize);
        return money + prize;
    }
}
