package Behavioral.State.Yanmo.第6版工作流改进版.ConcreteClass;

import Behavioral.State.Yanmo.第6版工作流.Model.LeaveRequestModel;
import Behavioral.State.Yanmo.第6版工作流改进版.BaseClass.LeaveRequestState;
import Behavioral.State.Yanmo.第6版工作流改进版.Model.StateMachine;

import java.util.Scanner;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class DepManagerState implements LeaveRequestState {
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
        System.out.println("部门经理审核中，请稍候......");
        //模拟用户处理界面，通过控制台来读取数据
        System.out.println(lrm.getUser() + "申请从" + lrm.getBeginDate() + "开始请假" + lrm.getLeaveDays() + "天，请部门经理审核（1为同意，2为不同意）：");
        //读取从控制台输入的数据
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            //设置回到上下文中
            String result = "不同意";
            if (a == 1) {
                result = "同意";
            }
            lrm.setResult("部门经理审核结果：" + result);
            //部门经理审核以后，直接转向审核结束状态了
            request.setState(new AuditOverState());
            //继续执行下一步工作
            request.doWork();

        }
    }
}
