package Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.ConcreteClass;

import Behavioral.State.Yanmo.第4版使用模式状态类处理状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第4版使用模式状态类处理状态.ConcreteClass.BlackVoteState;
import Behavioral.State.Yanmo.第4版使用模式状态类处理状态.VoteManager;

/**
 * Created by sahoo on 17/3/8.
 */
public class BlackWarnVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {

//        待进黑名单警告状态
        System.out.println("禁止登录和使用本系统3天");

//
        if (voteManager.getMapVoteCount().get(user) >= 9) {
            voteManager.getMapState().put(user, new BlackVoteState());
        }

    }
}
