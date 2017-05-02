package Structural.Bridge.DPExplained.第4版优先使用组合.ConcreteAbstractClass;

import Structural.Bridge.DPExplained.第4版优先使用组合.BaseAbstractClass.Shape;
import Structural.Bridge.DPExplained.第4版优先使用组合.BaseImplementClass.Drawing;

/**
 * Created by sahoo on 16/4/28.
 */
public class Rectangle extends Shape {
    private double _x1, _y1, _x2, _y2;

    public Rectangle(Drawing drawing, double x1, double y1, double x2, double y2) {
        super(drawing);
        _x1 = x1;
        _y1 = y1;
        _x2 = x2;
        _y2 = y2;
    }

    @Override
    public void draw() {
        drawLine(_x1, _y1, _x2, _y2);
        drawLine(_x2, _y1, _x2, _y2);
        drawLine(_x2, _y2, _x1, _y2);
        drawLine(_x1, _y2, _x1, _y1);
    }
}
