package Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.ConcreteClass;


import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.BaseClass.VoteState;
import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class SpiteVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //恶意投票
        //取消用户的投票资格，并取消投票记录
        String s = voteManager.getMapVote().get(user);
        if (s != null) {
            voteManager.getMapVote().remove(s);
        }

        Integer count = voteManager.getMapVoteCount().get(user);
        System.out.println("第" + count + "次投票，你有恶意投票的行为，取消投票资格！");

        //注意这里的判断大于等于7，因为这里设置的是下一个状态
        //下一个操作次数就是8了，就应该算是进黑名单警告状态了
        if (count >= 7) {
            voteManager.getMapState().put(user, new BlackWarnVoteState());
        }
    }
}
