package Structural.Bridge.YanMo.发送提示消息.第1版不用模式的解决方案.ConcreteClass;

import Structural.Bridge.YanMo.发送提示消息.第1版不用模式的解决方案.BaseClass.Message;

/**
 * Created by sahoo on 17/2/9.
 * 以 E-mail 的方式发送普通消息
 */
public class CommonMessageEmail implements Message {

    public void send(String message, String toUser) {
        System.out.printf("使用E-mail的方式，发送消息'%s'给%s%n",message,toUser);
    }
}
