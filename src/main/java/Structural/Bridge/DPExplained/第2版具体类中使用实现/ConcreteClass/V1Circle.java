package Structural.Bridge.DPExplained.第2版具体类中使用实现.ConcreteClass;

import Structural.Bridge.DPExplained.DP1;
import Structural.Bridge.DPExplained.第2版具体类中使用实现.BaseClass.Circle;

public class V1Circle extends Circle {

    public V1Circle(double x, double y, double r) {
        super(x, y, r);
    }

    @Override
    protected void drawCircle() {
        DP1.draw_a_circle(_x, _y, _r);
    }

}
