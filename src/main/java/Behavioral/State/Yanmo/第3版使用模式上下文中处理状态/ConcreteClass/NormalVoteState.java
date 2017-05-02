package Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.ConcreteClass;


import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.VoteManager;

/**
 * Created by zhangjiantao on 2017/2/28.
 */
public class NormalVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 正常投票
        // 记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");
    }
}
