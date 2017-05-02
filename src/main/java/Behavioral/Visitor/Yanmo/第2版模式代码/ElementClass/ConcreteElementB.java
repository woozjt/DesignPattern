package Behavioral.Visitor.Yanmo.第2版模式代码.ElementClass;

import Behavioral.Visitor.Yanmo.第2版模式代码.VisitorClass.BaseVisitor;

/**
 * Created by zhangjiantao on 2017/2/24.
 */
public class ConcreteElementB extends BaseElementClass {
    @Override
    public void accept(BaseVisitor visitor) {

    }

    public String OperationB() {
        System.out.println("Operation B");
        return "B";
    }
}
