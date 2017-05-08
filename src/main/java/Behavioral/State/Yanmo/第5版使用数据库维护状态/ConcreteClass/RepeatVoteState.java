package Behavioral.State.Yanmo.第5版使用数据库维护状态.ConcreteClass;

import Behavioral.State.Yanmo.第5版使用数据库维护状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class RepeatVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 重复投票
        // 暂不做处理
        System.out.println("请不要重复投票");

        //重复投票完成，维护下一个状态，重复投票5次，就算恶意投票了
        //注意这里是判断大于等于4，因为这里设置的是下一个状态
        //下一个操作次数就是5了，就应该算是恶意投票了
        if (voteManager.getMapVoteCount(user) >= 4) {
            // 直接把下一个状态的编码记录到数据库就可以了
            voteManager.setStateId(user,"恶意投票");
        }
    }
}
