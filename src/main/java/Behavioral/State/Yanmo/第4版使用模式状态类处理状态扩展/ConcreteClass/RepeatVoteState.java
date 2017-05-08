package Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.ConcreteClass;


import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.BaseClass.VoteState;
import Behavioral.State.Yanmo.第4版使用模式状态类处理状态扩展.VoteManager;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class RepeatVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 重复投票
        // 暂不做处理
        Integer count = voteManager.getMapVoteCount().get(user);
        System.out.println("第" + count + "次投票，请不要重复投票");

        //重复投票完成，维护下一个状态，重复投票5次，就算恶意投票了
        //注意这里是判断大于等于4，因为这里设置的是下一个状态
        //下一个操作次数就是5了，就应该算是恶意投票了
        if (count >= 4) {
            voteManager.getMapState().put(user, new SpiteVoteState());
        }
    }
}
