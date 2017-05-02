package Creational.Builder.YanMo.DemoCode.ConcreteBuilder;

import Creational.Builder.YanMo.DemoCode.BaseBuilder.Builder;

/**
 * Created by zhangjiantao on 2016/4/18.
 */
public class ConcreteBuilder implements Builder {
    private Product resultProduct;

    public Product getResultProduct() {
        return resultProduct;
    }

    public void buildPart() {
        //构建某个部件的功能处理
    }
}
