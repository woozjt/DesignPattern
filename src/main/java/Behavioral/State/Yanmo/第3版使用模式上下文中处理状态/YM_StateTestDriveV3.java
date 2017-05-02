package Behavioral.State.Yanmo.第3版使用模式上下文中处理状态;

/**
 * Created by sahoo on 17/3/2.
 */
public class YM_StateTestDriveV3 {

        public static void start() {
            VoteManager vm = new VoteManager();
            for (int i = 0; i < 8; i++) {
                vm.vote("u1", "A");
            }
        }
}
