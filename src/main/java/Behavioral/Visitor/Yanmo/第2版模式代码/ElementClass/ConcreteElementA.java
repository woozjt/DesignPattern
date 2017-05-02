package Behavioral.Visitor.Yanmo.第2版模式代码.ElementClass;

import Behavioral.Visitor.Yanmo.第2版模式代码.VisitorClass.BaseVisitor;

/**
 * Created by zhangjiantao on 2017/2/24.
 */
public class ConcreteElementA extends BaseElementClass{
    @Override
    public void accept(BaseVisitor visitor) {

    }

    public String OperationA(){
        System.out.println("Operation A");
        return "A";
    }
}
