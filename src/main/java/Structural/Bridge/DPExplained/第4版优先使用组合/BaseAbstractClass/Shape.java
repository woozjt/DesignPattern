package Structural.Bridge.DPExplained.第4版优先使用组合.BaseAbstractClass;

import Structural.Bridge.DPExplained.第4版优先使用组合.BaseImplementClass.Drawing;

/**
 * Created by sahoo on 16/4/28.
 */
public abstract class Shape {
    protected Drawing myDrawing;

    public abstract void draw();

    public Shape(Drawing myDrawing) {
        this.myDrawing = myDrawing;
    }

    protected void drawLine(double x1, double y1, double x2, double y2) {
        myDrawing.drawLine(x1, y1, x2, y2);
    }

    protected void drawCircle(double x, double y, double r) {
        myDrawing.drawCircle(x, y, r);
    }
}
