package Structural.Bridge.DPExplained.第3版抽象类中使用实现.BaseClass;

import Structural.Bridge.DPExplained.DP2;

/**
 * Created by sahoo on 16/5/5.
 */
public abstract class V2Shape extends Shape {

    protected void drawLine(double x1, double y1, double x2, double y2) {
        DP2.drawline(x1, x2, y1, y2);
    }

    protected void drawCircle(double x, double y, double r) {
        DP2.drawcircle(x, y, r);
    }
}
