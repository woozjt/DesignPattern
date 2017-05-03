package Behavioral.State.Yanmo.第6版工作流.ConcreteClass;

import Behavioral.State.Yanmo.第6版工作流.BaseClass.LeaveRequestState;
import Behavioral.State.Yanmo.第6版工作流.BaseClass.StateMachine;
import Behavioral.State.Yanmo.第6版工作流.Model.LeaveRequestModel;

/**
 * Created by zhangjiantao on 2017/5/2.
 */
public class AuditOverState implements LeaveRequestState {
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

        // 业务处理，在数据中记录整个流程结束
    }
}
