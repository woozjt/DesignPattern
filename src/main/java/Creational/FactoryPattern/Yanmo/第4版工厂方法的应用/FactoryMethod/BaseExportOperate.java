package Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.FactoryMethod;

import Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.Product.BaseExportFileApi;

/**
 * Created by sahoo on 16/5/4.
 */
public abstract class BaseExportOperate {

    public boolean export(String data) {
        BaseExportFileApi api = factoryMethod();
        return api.export(data);
    }

    protected abstract BaseExportFileApi factoryMethod();

}


