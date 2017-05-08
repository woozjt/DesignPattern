package Behavioral.State.Yanmo.第5版使用数据库维护状态.DataAccess;

/**
 * Created by zhangjiantao on 2017/5/8.
 */
public class VoteRepository {
    public static int getVoteCount(String user) {
        // 从数据库中查询，根据用户情况
        return 0;
    }

    public static void setVoteCount(String user, Integer count) {
        //把用户的投票次数写入到数据库中
    }

    /**
     * 从数据库获取转移状态，比如从状态A转换成状态B
     * @param user 用户标识
     * @return 返回转移描述
     */
    public static String getTransferState(String user) {
        // 从数据库中查询用户的状态编码，这里只是示意一下
        if (user.equals("test"))
            return null;
        return "黑名单";
    }

    public static void setTransferState(String user, String stateId) {
        //把用户的投票状态写入到数据库中
    }

    public static void addUserVote(String user, String voteItem) {
        //把用户和投票项写入到数据库中
    }

    public static void removeUser(String user) {
        //把用户在数据库中标记为删除
    }
}
