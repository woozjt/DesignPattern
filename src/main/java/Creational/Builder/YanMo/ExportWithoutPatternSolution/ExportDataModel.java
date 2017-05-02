package Creational.Builder.YanMo.ExportWithoutPatternSolution;

/**
 * Created by zhangjiantao on 2016/4/18.
 */
public class ExportDataModel {

    /**/
    private String productId;
    /*销售价格*/
    private double price;
    /*销售数量*/
    private double amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
