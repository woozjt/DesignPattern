package Creational.FactoryPattern.Yanmo.第3版工厂方法的示例代码;

/**
 * Created by sahoo on 16/5/4.
 */
public class ConcreteFactory extends BaseFactory {
    @Override
    protected BaseProduct factoryMethod() {
        return new ConcreteProduct();
    }
}

