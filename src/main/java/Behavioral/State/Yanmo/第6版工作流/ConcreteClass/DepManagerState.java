package Behavioral.State.Yanmo.第6版工作流.ConcreteClass;

import Behavioral.State.Yanmo.第6版工作流.BaseClass.LeaveRequestState;
import Behavioral.State.Yanmo.第6版工作流.BaseClass.StateMachine;
import Behavioral.State.Yanmo.第6版工作流.Model.LeaveRequestModel;

/**
 * Created by zhangjiantao on 2017/5/2.
 */
public class DepManagerState implements LeaveRequestState {
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
        //业务处理，把审核结果保存取数据库中

        //部门经理审核以后，直接转向审核结束状态了
        request.setState(new AuditOverState());
    }
}
