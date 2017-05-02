package Structural.Bridge.DPExplained.第4版优先使用组合.ConcreteImplementClass;

import Structural.Bridge.DPExplained.DP1;
import Structural.Bridge.DPExplained.第4版优先使用组合.BaseImplementClass.Drawing;

/**
 * Created by sahoo on 16/4/28.
 */
public class V1Drawing extends Drawing {
    @Override
    public void drawLine(double x1, double y1, double x2, double y2) {
        DP1.draw_a_line(x1, y1, x2, y2);
    }

    @Override
    public void drawCircle(double x, double y, double r) {
        DP1.draw_a_circle(x, y, r);
    }
}
