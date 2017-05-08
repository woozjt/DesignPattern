package Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.BaseClass;

import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public interface VoteState {
    /**
     * 处理状态对应的行为
     * @param user  投票人
     * @param voteItem  投票项
     * @param voteManager 投票上下文，用来在实现状态对应的功能处理的时候，
     *                    可以回调上下文的数据
     */
    void vote(String user, String voteItem, VoteManager voteManager);
}
