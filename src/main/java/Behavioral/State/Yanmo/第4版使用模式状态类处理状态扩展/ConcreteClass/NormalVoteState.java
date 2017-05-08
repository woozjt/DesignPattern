package Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.ConcreteClass;


import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.BaseClass.VoteState;
import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class NormalVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {

        // 正常投票
        // 记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        Integer count = voteManager.getMapVoteCount().get(user);
        System.out.println("第" + count + "次投票，恭喜你投票成功");

        // 正常投票完成，编排维护下一个状态，同一个人再投票就是重复了
        voteManager.getMapState().put(user, new RepeatVoteState());
    }
}
