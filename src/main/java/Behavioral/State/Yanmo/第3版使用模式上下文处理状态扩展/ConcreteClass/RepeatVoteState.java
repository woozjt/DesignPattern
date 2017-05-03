package Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.ConcreteClass;

import Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.BaseClass.VoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/3.
 */
public class RepeatVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 重复投票
        // 暂不做处理
        System.out.println("请不要重复投票");
    }
}
