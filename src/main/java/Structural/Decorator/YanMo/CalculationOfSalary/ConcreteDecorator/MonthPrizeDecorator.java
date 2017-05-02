package Structural.Decorator.YanMo.CalculationOfSalary.ConcreteDecorator;

import Structural.Decorator.YanMo.CalculationOfSalary.BaseComponent.Component;
import Structural.Decorator.YanMo.CalculationOfSalary.BaseDecorator.Decorator;
import Structural.Decorator.YanMo.CalculationOfSalary.Data.TempDB;

import java.util.Date;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class MonthPrizeDecorator extends Decorator {
    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + "Current Month Business Bonus: " + prize);
        return money + prize;
    }
}
