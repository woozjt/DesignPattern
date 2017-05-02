package Creational.FactoryPattern.Yanmo.第4版工厂方法的应用.Product;

public class ConcreteExportDB implements BaseExportFileApi {

    public boolean export(String data) {
        System.out.println("导出数据"+data+"到数据库备份文件");
        return true;
    }
}
