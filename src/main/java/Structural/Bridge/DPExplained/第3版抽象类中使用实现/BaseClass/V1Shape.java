package Structural.Bridge.DPExplained.第3版抽象类中使用实现.BaseClass;

import Structural.Bridge.DPExplained.DP1;

/**
 * Created by sahoo on 16/5/5.
 */
public abstract class V1Shape extends Shape {

    protected void drawLine(double x1, double y1, double x2, double y2) {
        DP1.draw_a_line(x1, y1, x2, y2);
    }

    protected void drawCircle(double x, double y, double r) {
        DP1.draw_a_circle(x, y, r);
    }

}
