package Behavioral.State.Yanmo.第4版使用模式状态类处理状态;

/**
 * Created by sahoo on 17/3/8.
 */
public class YM_StateTestDriveV4 {

    public static void start() {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 8; i++) {
            vm.vote("u1", "A");
        }
    }
}
