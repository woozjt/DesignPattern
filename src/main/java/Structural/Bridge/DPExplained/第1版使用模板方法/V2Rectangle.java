package Structural.Bridge.DPExplained.第1版使用模板方法;

import Structural.Bridge.DPExplained.DP2;

public class V2Rectangle extends Rectangle {

    public V2Rectangle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    protected void drawLine(double x1, double y1, double x2, double y2) {
        DP2.drawline(x1, y1, x2, y2);
    }

}
