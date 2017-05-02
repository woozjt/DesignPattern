package Structural.Bridge.YanMo.发送提示消息.第2版不用模式的解决方案扩展功能.BaseClass;

/**
 * Created by sahoo on 17/2/9.
 *
 * 加急消息的抽象接口
 *
 */
public interface UrgencyMessage extends Message {

    /**
     * 监控某消息的处理过程
     * @param messageId 被控监的消息的编号
     * @return 包含监控到的数据对象，这里示意一下，所以用了 Object
     */
    Object watch(String messageId);

}