package Behavioral.State.Yanmo.第5版使用数据库维护状态.ConcreteClass;

import Behavioral.State.Yanmo.第5版使用数据库维护状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class NormalVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 正常投票
        // 记录到投票记录中
        voteManager.addUserVote(user, voteItem);
        System.out.println("恭喜你投票成功");

        // 正常投票完成，编排维护下一个状态，同一个人再投票就是重复了
        voteManager.setStateId(user, "重复投票");
    }
}
