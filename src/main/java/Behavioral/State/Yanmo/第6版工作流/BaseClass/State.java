package Behavioral.State.Yanmo.第6版工作流.BaseClass;

import Behavioral.State.Yanmo.第6版工作流.Model.StateMachine;

/**
 * Created by sahoo on 17/4/25.
 */
public interface State {
    /**
     * 执行状态对应的功能处理
     * @param request 上下文的实例对象
     */
    void doWork(StateMachine request);

}
