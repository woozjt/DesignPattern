package Structural.Bridge.YanMo.发送提示消息.第3版桥接模式示例代码;

/**
 * Created by sahoo on 17/2/10.
 *
 * 定义抽象部分的接口
 *
 */
public abstract class Abstraction {

    /**
     * 持有一个实现部分的对象
     */
    protected Implementor impl;

    /**
     * @param impl 实现部分的对象
     */
    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    /**
     * 示例操作，实现一定的功能，可能需要转调实现部分的具体实现方法
     */
    public void operation() {
        impl.operationImpl();
    }
}
