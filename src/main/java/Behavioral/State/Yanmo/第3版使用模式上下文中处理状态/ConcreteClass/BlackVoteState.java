package Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.ConcreteClass;

import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.VoteManager;

/**
 * Created by sahoo on 17/3/2.
 */
public class BlackVoteState implements VoteState
{
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //黑名单
        //记入黑名单，禁止登录系统了
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
