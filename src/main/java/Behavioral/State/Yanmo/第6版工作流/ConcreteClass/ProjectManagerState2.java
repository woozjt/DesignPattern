package Behavioral.State.Yanmo.第6版工作流.ConcreteClass;

import Behavioral.State.Yanmo.第6版工作流.BaseClass.LeaveRequestState;
import Behavioral.State.Yanmo.第6版工作流.BaseClass.StateMachine;
import Behavioral.State.Yanmo.第6版工作流.Model.LeaveRequestModel;

import java.util.Scanner;

/**
 * Created by zhangjiantao on 2017/5/3.
 */
public class ProjectManagerState2 implements LeaveRequestState {
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        System.out.println("项目经理审核中，请稍候......");
        //模拟用户处理界面，通过控制台来读取数据
        System.out.println(lrm.getUser() + "申请从" + lrm.getBeginDate() + "开始请假" + lrm.getLeaveDays() + "天，请项目经理审核（1为同意，2为不同意）：");
        //读取从控制台输入的数据
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            //设置回到上下文中
            String result = "不同意";
            if (a == 1) {
                result = "同意";
            }
            lrm.setResult("项目经理审核结果：" + result);
            //根据选择的结果和条件来设置下一步
            if (a == 1) {
                if (lrm.getLeaveDays() > 3) {
                    //如果请假天数大于3天，而且项目经理同意了
                    //就提交给部门经理
                    request.setState(new DepManagerState2());
                    //继续执行下一步工作
                    request.doWork();
                } else {
                    //3天以内的请假，由项目经理做主，
                    //就不用提交给部门经理了,转向审核结束状态
                    request.setState(new AuditOverState2());
                    //继续执行下一步工作
                    request.doWork();
                }
            } else{
                //项目经理不同意，就不用提交给部门经理了，转向审核结束状态
                request.setState(new AuditOverState2());
                //继续执行下一步工作
                request.doWork();
            }
        }
    }
}
