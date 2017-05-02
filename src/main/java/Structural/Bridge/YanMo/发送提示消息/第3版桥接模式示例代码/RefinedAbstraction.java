package Structural.Bridge.YanMo.发送提示消息.第3版桥接模式示例代码;

/**
 * Created by sahoo on 17/2/10.
 *
 * 扩充由 Abstraction 定义的接口功能
 *
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    public void otherOperation(){
        // 实现一定的功能，可能会使用具体实现部分的实现方法
        // 但是本方法更大的可能是使用 Abstraction 中定义的方法
        // 通过组合使用 Abstraction 中定义的方法来完成更多的功能
    }
}
