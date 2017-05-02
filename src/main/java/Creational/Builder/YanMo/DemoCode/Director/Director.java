package Creational.Builder.YanMo.DemoCode.Director;

import Creational.Builder.YanMo.DemoCode.BaseBuilder.Builder;

/**
 * Created by zhangjiantao on 2016/4/18.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /*
    * 示意方法，指导生成器构建最终的产品对象
    * */
    public void construct() {
        // 通过使用生成器接口来构建最终的产品对象
        builder.buildPart();
    }
}
