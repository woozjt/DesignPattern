package Structural.Flyweight.第3版只有共享享元对象重写示例;

import Structural.Flyweight.第3版只有共享享元对象重写示例.Context.SecurityMgr;

/**
 * Created by sahoo on 17/3/16.
 * <p>
 * 客户端测试
 */
public class YM_FlyweightTestDriveV3 {
    public static void start() {
//        需要先登录，然后再判断是否有权限
        SecurityMgr mgr = SecurityMgr.getSecurityMgr();

        mgr.login("张三");
        mgr.login("李四");

        boolean f1 = mgr.hasPermit("张三", "薪资数据", "查看");
        boolean f2 = mgr.hasPermit("李四", "薪资数据", "查看");

        System.out.println("f1 == " + f1);
        System.out.println("f2 == " + f2);

        for (int i = 0; i < 3; i++) {
            mgr.login("张三" + i);
            mgr.hasPermit("张三" + i, "薪资数据", "查看");
        }
    }
}
