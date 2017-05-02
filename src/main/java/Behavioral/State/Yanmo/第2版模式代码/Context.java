package Behavioral.State.Yanmo.第2版模式代码;

import Behavioral.State.Yanmo.第2版模式代码.BaseClass.State;

/**
 * Created by zhangjiantao on 2017/2/28.
 * <p/>
 * 定义客户感兴趣的接口，通常会维护一个State 类型的对象类型
 */
public class Context {
    /**
     * 持有一个State 类型的对象实例
     */
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 用户感兴趣的接口方法
     *
     * @param sampleParameter 示意参数
     */
    public void request(String sampleParameter) {
        state.handle(sampleParameter);
    }
}
