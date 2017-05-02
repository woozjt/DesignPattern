package Creational.FactoryPattern.Yanmo.第4版工厂方法的应用;

import Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.FactoryMethod.BaseExportOperate;
import Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.FactoryMethod.ConcreteExportDBOperate;


/**
 * Created by sahoo on 16/5/4.
 */
public class FactoryMethodTestDriveV4 {
    public static void Start() {
        BaseExportOperate operate = new ConcreteExportDBOperate();
        operate.export("测试数据");
    }
}
