package Structural.Bridge.DPExplained.第4版优先使用组合.ConcreteAbstractClass;

import Structural.Bridge.DPExplained.第4版优先使用组合.BaseAbstractClass.Shape;
import Structural.Bridge.DPExplained.第4版优先使用组合.BaseImplementClass.Drawing;

/**
 * Created by sahoo on 16/4/28.
 */
public class Circle extends Shape {
    private double _x, _y, _r;

    public Circle(Drawing drawing, double x, double y, double r) {
        super(drawing);
        _x = x;
        _y = y;
        _r = r;
    }

    @Override
    public void draw() {
        drawCircle(_x, _y, _r);
    }
}
