package Structural.Decorator.YanMo.CalculationOfSalary.ConcreteComponent;

import Structural.Decorator.YanMo.CalculationOfSalary.BaseComponent.Component;

import java.util.Date;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class ConcreteComponent extends Component {
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return 0;
    }
}
