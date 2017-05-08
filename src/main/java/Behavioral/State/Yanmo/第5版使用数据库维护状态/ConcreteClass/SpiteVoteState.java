package Behavioral.State.Yanmo.第5版使用数据库维护状态.ConcreteClass;

import Behavioral.State.Yanmo.第5版使用数据库维护状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class SpiteVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //恶意投票
        //取消用户的投票资格，并取消投票记录
        voteManager.removeUser(user);
        System.out.println("你有恶意投票的行为，取消投票资格！");

        //注意这里的判断大于等于7，因为这里设置的是下一个状态
        //下一个操作次数就是8了，就应该算是进黑名单了
        if (voteManager.getMapVoteCount(user) >= 7) {
            voteManager.setStateId(user,"黑名单");
        }
    }
}
