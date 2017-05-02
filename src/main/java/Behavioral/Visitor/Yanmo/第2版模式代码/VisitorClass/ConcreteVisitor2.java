package Behavioral.Visitor.Yanmo.第2版模式代码.VisitorClass;

import Behavioral.Visitor.Yanmo.第2版模式代码.ElementClass.ConcreteElementA;
import Behavioral.Visitor.Yanmo.第2版模式代码.ElementClass.ConcreteElementB;

/**
 * Created by zhangjiantao on 2017/2/27.
 */
public class ConcreteVisitor2 implements BaseVisitor {
    public void visitElementA(ConcreteElementA elementA) {
        System.out.println("Visit 2");
        elementA.OperationA();
    }

    public void visitElementB(ConcreteElementB elementB) {
        System.out.println("Visit 2");
        elementB.OperationB();
    }
}
