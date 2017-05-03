package Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.ConcreteClass;

import Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.BaseClass.VoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/3.
 */
public class BlackWarnVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //待进黑名单警告状态
        System.out.println("禁止登录和使用系统3天");
    }
}
