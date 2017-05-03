package Behavioral.State.Yanmo.第6版工作流.ConcreteClass;

import Behavioral.State.Yanmo.第6版工作流.BaseClass.LeaveRequestState;
import Behavioral.State.Yanmo.第6版工作流.BaseClass.StateMachine;
import Behavioral.State.Yanmo.第6版工作流.Model.LeaveRequestModel;

/**
 * Created by zhangjiantao on 2017/5/3.
 */
public class AuditOverState2 implements LeaveRequestState {
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        System.out.println(lrm.getUser() + ",你的请假申请已经审核结束，结果是：" + lrm.getResult());
    }
}
