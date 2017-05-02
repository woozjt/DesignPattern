package Structural.Bridge.YanMo.发送提示消息.第2版不用模式的解决方案扩展功能.BaseClass;

/**
 * Created by sahoo on 17/2/9.
 *
 * 消息的统一接口
 *
 */
public interface Message {

    /**
     * 发送消息
     * @param message 要发送的消息内容
     * @param toUser 消息发送的目的人员
     */
    void send(String message, String toUser);
}