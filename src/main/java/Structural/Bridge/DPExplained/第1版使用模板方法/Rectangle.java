package Structural.Bridge.DPExplained.第1版使用模板方法;

/**
 * Created by zhangjiantao on 2016/5/4.
 */
public abstract class Rectangle  {

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



