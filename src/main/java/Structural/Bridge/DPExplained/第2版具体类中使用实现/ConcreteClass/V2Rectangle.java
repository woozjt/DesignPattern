package Structural.Bridge.DPExplained.第2版具体类中使用实现.ConcreteClass;


import Structural.Bridge.DPExplained.DP2;
import Structural.Bridge.DPExplained.第2版具体类中使用实现.BaseClass.Rectangle;

public class V2Rectangle extends Rectangle {

    public V2Rectangle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    protected void drawLine(double x1, double y1, double x2, double y2) {
            DP2.drawline(x1, x2, y1, y2);
    }


}
