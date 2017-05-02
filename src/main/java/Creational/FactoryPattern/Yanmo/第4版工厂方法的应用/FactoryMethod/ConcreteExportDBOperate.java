package Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.FactoryMethod;

import Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.Product.BaseExportFileApi;
import Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.Product.ConcreteExportDB;

public class ConcreteExportDBOperate extends BaseExportOperate {

    @Override
    protected BaseExportFileApi factoryMethod() {
        return new ConcreteExportDB();
    }
}
