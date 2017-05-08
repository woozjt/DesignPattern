package Behavioral.State.Yanmo.第6版工作流改进版.BaseClass;


import Behavioral.State.Yanmo.第6版工作流改进版.Model.StateMachine;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public interface State {
    /**
     * 执行状态对应的功能处理
     * @param request 上下文的实例对象
     */
    void doWork(StateMachine request);
}
