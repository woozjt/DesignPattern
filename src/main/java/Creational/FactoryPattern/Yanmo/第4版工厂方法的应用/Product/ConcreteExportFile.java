package Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.Product;

public class ConcreteExportFile implements BaseExportFileApi {

    public boolean export(String data) {
        System.out.println("导出数据"+data+"到文本文件");
        return true;
    }
}
