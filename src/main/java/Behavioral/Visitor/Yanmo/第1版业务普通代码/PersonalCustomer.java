package Behavioral.Visitor.Yanmo.第1版业务普通代码;

/**
 * Created by zhangjiantao on 2017/2/23.
 */
public class PersonalCustomer extends Customer {
    private String telephone;
    private int age;
    private String registerAddress;

    /**
     * 个人客户提出服务请求的方法，示意一下
     */
    @Override
    public void serviceRequest() {
        System.out.println("客户" + this.getName() + "提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {

    }

    @Override
    public void worthAnalyze() {

    }
}
