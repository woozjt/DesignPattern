package Structural.Flyweight.第3版只有共享享元对象重写示例.ConcreteClass;

import Structural.Flyweight.第3版只有共享享元对象重写示例.BaseClass.Flyweight;

/**
 * Created by sahoo on 17/3/15.
 * <p>
 * 封装授权数据中重复出现部分的享元对象
 */
public class AuthorizationFlyweight implements Flyweight {

    /**
     * 内部状态，安全实体
     */
    private String securityEntity;

    /**
     * 内部状态，权限
     */
    private String permit;

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    /**
     * 构造方法，传入状态数据
     *
     * @param state 状态数据，包含安全实体和权限的数据，用","分隔
     */
    public AuthorizationFlyweight(String state) {
        String ss[] = state.split(",");
        securityEntity = ss[0];
        permit = ss[1];
    }


    public boolean match(String securityEntity, String permit) {
        return this.securityEntity.equals(securityEntity) && this.permit.equals(permit);
    }

}
