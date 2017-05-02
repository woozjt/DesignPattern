package Creational.FactoryPattern.Yanmo.第3版工厂方法的示例代码;

/**
 * Created by sahoo on 16/5/4.
 */
public abstract class BaseFactory {
    protected abstract BaseProduct factoryMethod();

    public void someOperation() {
        BaseProduct product = factoryMethod();
    }
}
