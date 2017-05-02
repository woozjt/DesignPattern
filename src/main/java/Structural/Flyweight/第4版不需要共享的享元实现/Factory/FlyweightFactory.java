package Structural.Flyweight.第4版不需要共享的享元实现.Factory;

import Structural.Flyweight.第4版不需要共享的享元实现.BaseClass.Flyweight;
import Structural.Flyweight.第4版不需要共享的享元实现.ConcreteClass.AuthorizationFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sahoo on 17/3/18.
 * <p>
 * 享元工厂，通常实现成为单例
 */
public class FlyweightFactory {
    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    /**
     * 缓存多个Flyweight对象
     */
    private Map<String, Flyweight> fsMap = new HashMap<String, Flyweight>();

    /**
     * 获取 key 对应的享元对象
     *
     * @param key 获取享元对象的 key
     * @return key 对应的享元对象
     */
    public Flyweight getFlyweight(String key) {
        Flyweight f = fsMap.get(key);
        if (f == null) {
            f = new AuthorizationFlyweight(key);
            fsMap.put(key, f);
        }
        return f;
    }

}