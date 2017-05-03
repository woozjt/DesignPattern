package Behavioral.State.Yanmo.第3版使用模式上下文中处理状态;

import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.ConcreteClass.BlackVoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.ConcreteClass.NormalVoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.ConcreteClass.RepeatVoteState;
import Behavioral.State.Yanmo.第3版使用模式上下文中处理状态.ConcreteClass.SpiteVoteState;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangjiantao on 2017/2/28.
 */
public class VoteManager {

    private VoteState state = null;

    /**
     * 记录用户投票的结果，Map<用户名称，投票选项>
     */
    private Map<String, String> mapVote = new HashMap<String, String>();

    /**
     * 记录用户投票的次数 Map<用户名称，投票的次数>
     */
    private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();

    /**
     * 获取记录用户投票结果的Ｍap
     * @return 记录用户投票结果的Ｍap
     */
    public Map<String, String> getMapVote() {
        return mapVote;
    }

    /**
     * 投票
     * @param user 投票人，为了简单，就是用户名称
     * @param voteItem 投票的选项
     */
    public void vote(String user, String voteItem) {
        // 1: 先为该用户增加投票的次数
        // 从记录中取出已有的投票次数
        Integer oldVoteCount = mapVoteCount.get(user);

        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }

        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user, oldVoteCount);

        // 2: 判断该用户投票的类型，就相当于是判断对应的状态
        // 到底是正常投票、重复投票、恶意投票还是上黑名单
        if (oldVoteCount == 1) {
            state = new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepeatVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            state = new SpiteVoteState();
        } else if (oldVoteCount >= 8) {
            state = new BlackVoteState();
        }

        //然后转调状态对象来进行相应的操作
        state.vote(user,voteItem,this);

    }
}
