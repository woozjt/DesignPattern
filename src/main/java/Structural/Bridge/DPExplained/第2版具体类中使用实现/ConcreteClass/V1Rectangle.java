package Structural.Bridge.DPExplained.第2版具体类中使用实现.ConcreteClass;

import Structural.Bridge.DPExplained.DP1;
import Structural.Bridge.DPExplained.第2版具体类中使用实现.BaseClass.Rectangle;

public class V1Rectangle extends Rectangle {

    public V1Rectangle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    protected void drawLine(double x1, double y1, double x2, double y2) {
        DP1.draw_a_line(x1, y1, x2, y2);
    }
}
