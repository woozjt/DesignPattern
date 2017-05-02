package Behavioral.State.Yanmo.第5版工作流.ConcreteClass;

import Behavioral.State.Yanmo.第5版工作流.BaseClass.LeaveRequestState;
import Behavioral.State.Yanmo.第5版工作流.BaseClass.StateMachine;
import Behavioral.State.Yanmo.第5版工作流.Model.LeaveRequestModel;

/**
 * Created by zhangjiantao on 2017/5/2.
 * 处理项目经理的审核，处理后可能对应部门经理审核或者审核结束之中的一种状态
 */
public class ProjectManagerState implements LeaveRequestState {
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

        //根据选择的结果和条件来设置下一步
        if ("同意".equals(lrm.getResult())) {
            if (lrm.getLeaveDays() > 3) {
                //如果请假天数大于3天，而且项目经理同意了，就提交给部门经理
                request.setState(new DepManagerState());
                //为部门经理增加一个工作
            } else {
                //3天以内的请假，由项目经理做主，
                //就不用提交给部门经理了,转向审核结束状态
                request.setState(new AuditOverState());
                //给申请人增加一个工作，让他查看审核结果
            }
        } else {
            //项目经理不同意的话，也就不用提交给部门经理了，转向审核结束状态
            request.setState(new AuditOverState());
            //给申请人增加一个工作，让他查看审核结果

        }

    }
}
