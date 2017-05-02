package Creational.FactoryPattern.Yanmo.第2版简单工厂的示例代码;

public class TestDrive{
    public static void Start(){
        Api api=Factory.createApi(1);
        api.operation("正在使用简单工厂");
    }
}
