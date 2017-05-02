package Structural.Decorator.YanMo.CalculationOfSalary;

import Structural.Decorator.YanMo.CalculationOfSalary.BaseComponent.Component;
import Structural.Decorator.YanMo.CalculationOfSalary.BaseDecorator.Decorator;
import Structural.Decorator.YanMo.CalculationOfSalary.ConcreteComponent.ConcreteComponent;
import Structural.Decorator.YanMo.CalculationOfSalary.ConcreteDecorator.GroupPrizeDecorator;
import Structural.Decorator.YanMo.CalculationOfSalary.ConcreteDecorator.MonthPrizeDecorator;
import Structural.Decorator.YanMo.CalculationOfSalary.ConcreteDecorator.SumPrizeDecorator;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class CalculationOfSalaryProgram {
    public static void Start() {
        Component c1 = new ConcreteComponent();

        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator d2 = new SumPrizeDecorator(d1);

        double zs = d2.calcPrize("张三", null, null);
        System.out.println("==========张三应得奖金: " + zs);

        double ls = d2.calcPrize("李四", null, null);
        System.out.println("==========李四应得奖金: " + ls);

        Decorator d3 = new GroupPrizeDecorator(d2);
        double ww = d3.calcPrize("王五", null, null);
        System.out.println("==========王经理应得奖金: " + ww);
    }
}
