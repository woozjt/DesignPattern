package Behavioral.Visitor.Yanmo.第2版模式代码.VisitorClass;

import Behavioral.Visitor.Yanmo.第2版模式代码.ElementClass.ConcreteElementA;
import Behavioral.Visitor.Yanmo.第2版模式代码.ElementClass.ConcreteElementB;

/**
 * Created by zhangjiantao on 2017/2/24.
 */
public interface BaseVisitor {

    void visitElementA(ConcreteElementA elementA);

    void visitElementB(ConcreteElementB elementB);
}
