package Creational.FactoryPattern.Yanmo.第1版简单工厂的场景;

public class TestDrive {
    public static void Start(){
        Api api = new Imp1();
        api.test1("哈哈，不要紧张，只是个测试而已");
    }
}
