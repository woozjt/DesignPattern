package Behavioral.State.Yanmo.第4版使用模式状态类处理状态.ConcreteClass;

import Behavioral.State.Yanmo.第4版使用模式状态类处理状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第4版使用模式状态类处理状态.VoteManager;

/**
 * Created by sahoo on 17/3/8.
 */
public class SpiteVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {

//      恶意投票
//      取消用户的投票资格，并取消投票记录
        String s = voteManager.getMapVote().get(user);
        if (s != null) {
            voteManager.getMapVote().remove(s);
        }
        System.out.println("你有恶意投票的行为，取消投票资格！");

        if (voteManager.getMapVoteCount().get(user) >= 7) {
            voteManager.getMapState().put(user, new BlackVoteState());
        }
    }
}
