package Structural.Bridge.YanMo.发送提示消息.第1版不用模式的解决方案.ConcreteClass;

import Structural.Bridge.YanMo.发送提示消息.第1版不用模式的解决方案.BaseClass.UrgencyMessage;

/**
 * Created by sahoo on 17/2/9.
 */
public class UrgencyMessageEmail implements UrgencyMessage {
    public void send(String message, String toUser) {
        message = "加急" + message;
        System.out.printf("使用E-mail的方式，发送消息'%s'给%s%n",message,toUser);

    }

    public Object watch(String messageId) {
        // 获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }
}
