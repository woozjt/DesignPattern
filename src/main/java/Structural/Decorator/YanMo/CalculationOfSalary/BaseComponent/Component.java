package Structural.Decorator.YanMo.CalculationOfSalary.BaseComponent;

import java.util.Date;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public abstract class Component {
    public abstract double calcPrize(String user, Date begin, Date end);
}
