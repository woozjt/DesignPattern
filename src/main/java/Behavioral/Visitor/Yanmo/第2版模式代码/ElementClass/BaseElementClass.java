package Behavioral.Visitor.Yanmo.第2版模式代码.ElementClass;

import Behavioral.Visitor.Yanmo.第2版模式代码.VisitorClass.BaseVisitor;

/**
 * Created by zhangjiantao on 2017/2/24.
 */
public abstract class BaseElementClass {
    public abstract void accept(BaseVisitor visitor);
}
