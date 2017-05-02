package Structural.Bridge.DPExplained.第2版具体类中使用实现.BaseClass;

public abstract class Circle extends Shape {
    protected double _x,_y,_r;

    public Circle(double x, double y, double r) {
        this._x = x;
        this._y = y;
        this._r = r;
    }

    public void draw(){
        drawCircle();
    }

    protected abstract void drawCircle();
}
