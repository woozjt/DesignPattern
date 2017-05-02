package Behavioral.Visitor.Yanmo.第1版业务普通代码;

/**
 * Created by zhangjiantao on 2017/2/23.
 */
public abstract class Customer {
    private String customerId;
    private String name;
    public String getName(){
        return name;
    }

    /**
     * 客户提出服务请求的方法，示意一下
     */
    public abstract void serviceRequest();

    /**
     * 客户对公司产品的偏好分析，示意一下
     */
    public abstract void predilectionAnalyze();

    /**
     * 客户价值分析，示意一下
     */
    public abstract void worthAnalyze();
}

