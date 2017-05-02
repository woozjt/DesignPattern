package Structural.Bridge.YanMo.发送提示消息.第4版使用桥接模式重写.BaseImplement;

/**
 * Created by sahoo on 17/2/10.
 *
 * 实现发送消息的统一接口
 *
 */
public interface MessageImplementor {

     /**
     * 发送消息
     * @param message 要发送的消息内容
     * @param toUser 消息发送的目的人员
     */
    void send(String message, String toUser);
}
