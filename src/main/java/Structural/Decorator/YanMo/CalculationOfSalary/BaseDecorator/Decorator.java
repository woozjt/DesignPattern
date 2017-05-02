package Structural.Decorator.YanMo.CalculationOfSalary.BaseDecorator;

import Structural.Decorator.YanMo.CalculationOfSalary.BaseComponent.Component;

import java.util.Date;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public abstract class Decorator extends Component {
    protected Component c;

    public Decorator(Component c) {
        this.c = c;
    }

    public double calcPrize(String user, Date begin, Date end) {
        return c.calcPrize(user,begin,end);
    }
}
