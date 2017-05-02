package Structural.Bridge.DPExplained.第2版具体类中使用实现.BaseClass;

public abstract class Rectangle extends Shape {

    private double _x1, _x2, _y1, _y2;

    public Rectangle(double x1, double y1, double x2, double y2) {
        _x1 = x1;
        _y1 = y1;
        _x2 = x2;
        _y2 = y2;
    }

    public void draw() {
        drawLine(_x1, _y1, _x2, _y1);
        drawLine(_x2, _y1, _x2, _y2);
        drawLine(_x2, _y2, _x1, _y2);
        drawLine(_x1, _y2, _x1, _y1);
    }

    protected abstract void drawLine(double x1, double y1, double x2, double y2);
}
