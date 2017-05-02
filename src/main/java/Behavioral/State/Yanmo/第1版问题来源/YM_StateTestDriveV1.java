package Behavioral.State.Yanmo.第1版问题来源;

/**
 * Created by zhangjiantao on 2017/2/28.
 */
public class YM_StateTestDriveV1 {
    public static void start() {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 8; i++) {
            vm.vote("u1", "A");
        }
    }
}
