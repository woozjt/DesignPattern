package Behavioral.Visitor.Yanmo.第1版业务普通代码;

/**
 * Created by zhangjiantao on 2017/2/23.
 */

public class EnterpriseCustomer extends Customer {

    private String linkman;
    private String linkTelephone;
    private String registerAddress;


    /**
     * 企业客户提出服务请求的方法，示意一下
     */
    @Override
    public void serviceRequest() {
        System.out.println(this.getName() + "企业提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {

    }

    @Override
    public void worthAnalyze() {

    }
}
