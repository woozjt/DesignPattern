package Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.FactoryMethod;

import Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.Product.BaseExportFileApi;
import Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.Product.ConcreteExportFile;

public class ConcreteExportTxtFileOperate extends BaseExportOperate {

    @Override
    protected BaseExportFileApi factoryMethod() {
        return new ConcreteExportFile();
    }
}
