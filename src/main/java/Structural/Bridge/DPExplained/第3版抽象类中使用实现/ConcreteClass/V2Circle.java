package Structural.Bridge.DPExplained.第3版抽象类中使用实现.ConcreteClass;

import Structural.Bridge.DPExplained.第3版抽象类中使用实现.BaseClass.V2Shape;

public class V2Circle extends V2Shape {

   double _x, _y, _r;

    public V2Circle(double x, double y, double r) {
        this._x = x;
        this._y = y;
        this._r = r;
    }

    @Override
    public void draw() {
        drawCircle(_x, _y, _r);
    }
}
