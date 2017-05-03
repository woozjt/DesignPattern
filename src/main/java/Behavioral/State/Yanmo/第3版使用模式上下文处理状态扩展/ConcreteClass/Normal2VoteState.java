package Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.ConcreteClass;

import Behavioral.State.Yanmo.第3版使用模式上下文处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/3.
 */
public class Normal2VoteState extends NormalVoteState {
    public void vote(String user,String voteItem,VoteManager voteManager){
        //先调用已有的功能
        super.vote(user,voteItem,voteManager);
        //给予积分奖励，示意一下
        System.out.println("奖励积分10分");
    }
}
