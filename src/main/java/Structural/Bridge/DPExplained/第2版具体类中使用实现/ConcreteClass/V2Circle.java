package Structural.Bridge.DPExplained.第2版具体类中使用实现.ConcreteClass;

import Structural.Bridge.DPExplained.DP2;
import Structural.Bridge.DPExplained.第2版具体类中使用实现.BaseClass.Circle;

public class V2Circle extends Circle {

    public V2Circle(double x, double y, double r) {
        super(x, y, r);
    }

    @Override
    protected void drawCircle() {
        DP2.drawcircle(_x, _y, _r);
    }
}
