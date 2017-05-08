package Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.ConcreteClass;

import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.BaseClass.VoteState;
import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class BlackVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {

        Integer count = voteManager.getMapVoteCount().get(user);
        //黑名单
        //记入黑名单，禁止登录系统了
        System.out.println("第" + count + "次投票，进入黑名单，将禁止登录和使用本系统！");
    }
}
