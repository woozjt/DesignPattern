package Structural.Bridge.YanMo.发送提示消息.第2版不用模式的解决方案扩展功能.BaseClass;

/**
 * Created by sahoo on 17/2/9.
 */
public interface SpecialUrgencyMessage extends Message {

    /**
     * 特急消息的处理过程
     * @param messageId 被控监的消息的编号
     */
    void hurry(String messageId);

}