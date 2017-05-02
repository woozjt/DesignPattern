package Structural.Bridge.DPExplained.第4版优先使用组合;

import Structural.Bridge.DPExplained.第4版优先使用组合.BaseAbstractClass.Shape;
import Structural.Bridge.DPExplained.第4版优先使用组合.BaseImplementClass.Drawing;
import Structural.Bridge.DPExplained.第4版优先使用组合.ConcreteAbstractClass.Circle;
import Structural.Bridge.DPExplained.第4版优先使用组合.ConcreteAbstractClass.Rectangle;
import Structural.Bridge.DPExplained.第4版优先使用组合.ConcreteImplementClass.V1Drawing;
import Structural.Bridge.DPExplained.第4版优先使用组合.ConcreteImplementClass.V2Drawing;

/**
 * Created by zhangjiantao on 2016/5/4.
 */
public class Factory {

    Shape[] getShapes() {
        Shape[] myShapes = new Shape[5];
        Drawing myDrawing;
        myDrawing=new V1Drawing();
        Drawing myDrawing2;
        myDrawing2=new V2Drawing();

        myShapes[0]=new Rectangle(myDrawing, 1,2,3,4);
        myShapes[1]=new Rectangle(myDrawing2, 1,2,3,4);
        myShapes[2]=new Circle(myDrawing, 10,3,4);
        myShapes[3]=new Rectangle(myDrawing2, 1,2,3,4);
        myShapes[4]=new Circle(myDrawing, 12,3,5);

        return myShapes;
    }
}
