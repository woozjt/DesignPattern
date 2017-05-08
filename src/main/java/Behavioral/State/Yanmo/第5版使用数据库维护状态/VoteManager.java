package Behavioral.State.Yanmo.第5版使用数据库维护状态;

import Behavioral.State.Yanmo.第5版使用数据库维护状态.BaseClass.VoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.ConcreteClass.BlackVoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.ConcreteClass.NormalVoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.ConcreteClass.RepeatVoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.ConcreteClass.SpiteVoteState;
import Behavioral.State.Yanmo.第5版使用数据库维护状态.DataAccess.VoteRepository;


/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class VoteManager {
    /**
     * 投票
     *
     * @param user     投票人，为了简单，就是用户名称
     * @param voteItem 投票的选项
     */
    public void vote(String user, String voteItem) {
        // 1: 先为该用户增加投票的次数
        // 从数据库中获取投票次数
        Integer oldVoteCount = VoteRepository.getVoteCount(user);

        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }

        oldVoteCount = oldVoteCount + 1;
        VoteRepository.setVoteCount(user, oldVoteCount);

        VoteState state = null;
        //2:直接从数据库获取该用户对应的下一个状态的编码
        String stateId = VoteRepository.getTransferState(user);

        if (stateId == null || stateId.trim().length() == 0) {
            //如果没有值，说明还没有投过票，就初始化一个正常投票状态
            state = new NormalVoteState();
        } else if ("重复投票".equals(stateId)) {
            state = new RepeatVoteState();
        } else if ("恶意投票".equals(stateId)) {
            state = new SpiteVoteState();
        } else if ("黑名单".equals(stateId)) {
            state = new BlackVoteState();
        }

        //然后转调状态对象来进行相应的操作
        state.vote(user, voteItem, this);
    }

    public void vote2(String user, String voteItem) {
        // 1: 先为该用户增加投票的次数
        // 从数据库中获取投票次数
        Integer oldVoteCount = VoteRepository.getVoteCount(user);

        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }

        oldVoteCount = oldVoteCount + 1;
        VoteRepository.setVoteCount(user, oldVoteCount);

        VoteState state = null;

        //2:直接从数据库获取该用户对应的下一个状态的编码
        //开始根据状态编码来创建需用的状态对象
        //根据状态编码去获取相应的类
        String className = "从数据库中获取状态编码相应的类";
        //使用反射创建对象实例，简单示意一下
        Class c;
        try {
            c = Class.forName(className);
            state = (VoteState) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //然后转调状态对象来进行相应的操作
        state.vote(user, voteItem, this);
    }

    public void addUserVote(String user, String voteItem) {
        VoteRepository.addUserVote(user, voteItem);
    }

    public void removeUser(String user) {
        VoteRepository.removeUser(user);
    }

    public int getMapVoteCount(String user) {
        return VoteRepository.getVoteCount(user);
    }

    public void setStateId(String user, String stateId) {
        VoteRepository.setTransferState(user, stateId);
    }
}
