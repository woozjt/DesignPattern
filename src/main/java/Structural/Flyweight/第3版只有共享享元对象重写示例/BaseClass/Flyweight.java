package Structural.Flyweight.第3版只有共享享元对象重写示例.BaseClass;

/**
 * Created by sahoo on 17/3/15.
 *
 * 描述授权数据的享元接口
 *
 */
public interface Flyweight {
    /**
     * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
     * @param securityEntity 安全实体
     * @param permit 权限
     * @return true 表示匹配，false 表示不匹配
     */
    public boolean match(String securityEntity,String permit);
}
