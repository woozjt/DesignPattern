package Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.ConcreteClass;


import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.BaseClass.VoteState;
import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.VoteManager;

/**
 * Created by sahoo on 17/3/8.
 */
public class BlackWarnVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {

        Integer count = voteManager.getMapVoteCount().get(user);
        //待进黑名单警告状态
        System.out.println("第" + count + "次投票，禁止登录和使用本系统3天！");

        //待进黑名单警告处理完成，维护下一个状态，投票到10次，就进黑名单了
        //注意这里的判断大于等于9，因为这里设置的是下一个状态
        //下一个操作次数就是10了，就应该算是进黑名单了
        if (count >= 9) {
            voteManager.getMapState().put(user, new BlackVoteState());
        }
    }
}
