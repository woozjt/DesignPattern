package Behavioral.State.Yanmo.第5版使用数据库维护状态.ConcreteClass;

import Behavioral.State.Yanmo.第5版使用数据库维护状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class BlackVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {

        //黑名单
        //记入黑名单，禁止登录系统了
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
