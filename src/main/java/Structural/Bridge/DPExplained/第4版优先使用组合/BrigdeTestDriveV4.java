package Structural.Bridge.DPExplained.第4版优先使用组合;

import Structural.Bridge.DPExplained.第4版优先使用组合.BaseAbstractClass.Shape;

/**
 * Created by zhangjiantao on 2016/5/4.
 */
public class BrigdeTestDriveV4 {
    public static void main() {
        Shape[] myShapes;
        Factory myFactory = new Factory();
        myShapes = myFactory.getShapes();
        for (int i = 0; i < myShapes.length; i++) {
            myShapes[i].draw();
        }
    }

}

