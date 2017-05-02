package Behavioral.State.Yanmo.第5版工作流.BaseClass;

/**
 * Created by sahoo on 17/4/25.
 */
public interface State {
    /**
     * 执行状态对应的功能处理
     * @param ctx 上下文的实例对象
     */
    void doWork(StateMachine ctx);

}
