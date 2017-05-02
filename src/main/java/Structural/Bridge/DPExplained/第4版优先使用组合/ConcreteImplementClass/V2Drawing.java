package Structural.Bridge.DPExplained.第4版优先使用组合.ConcreteImplementClass;

import Structural.Bridge.DPExplained.DP2;
import Structural.Bridge.DPExplained.第4版优先使用组合.BaseImplementClass.Drawing;

/**
 * Created by sahoo on 16/4/28.
 */
public class V2Drawing extends Drawing {
    @Override
    public void drawLine(double x1, double y1, double x2, double y2) {
        DP2.drawline(x1, x2, y1, y2);
    }

    @Override
    public void drawCircle(double x, double y, double r) {
        DP2.drawcircle(x, y, r);
    }
}
