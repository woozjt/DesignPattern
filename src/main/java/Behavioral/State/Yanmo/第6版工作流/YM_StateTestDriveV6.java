package Behavioral.State.Yanmo.第6版工作流;

import Behavioral.State.Yanmo.第6版工作流.ConcreteClass.LeaveRequestContext;
import Behavioral.State.Yanmo.第6版工作流.ConcreteClass.ProjectManagerState2;
import Behavioral.State.Yanmo.第6版工作流.Model.LeaveRequestModel;

/**
 * Created by zhangjiantao on 2017/5/3.
 */
public class YM_StateTestDriveV6 {
    public static void start() {
        //创建业务对象，并设置业务数据
        LeaveRequestModel lrm = new LeaveRequestModel();
        lrm.setUser("小李");
        lrm.setBeginDate("2017-5-6");
        lrm.setLeaveDays(5);

        //创建上下文对象
        LeaveRequestContext request = new LeaveRequestContext();
        //为上下文对象设置业务数据对象
        request.setBusinessVO(lrm);
        //配置上下文，作为开始的状态，以后就不管了
        request.setState(new ProjectManagerState2());

        // 请求上下文，让上下文开始处理工作
        request.doWork();
    }
}
