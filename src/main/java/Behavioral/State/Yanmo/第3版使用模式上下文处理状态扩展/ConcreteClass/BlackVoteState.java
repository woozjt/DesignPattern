package Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.ConcreteClass;

import Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.BaseClass.VoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/3.
 */
public class BlackVoteState implements VoteState
{
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //黑名单
        //记入黑名单，禁止登录系统了
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
