package Behavioral.State.HeadFirst.第2版行为局部化到状态类.BaseClass;

/**
 * Created by zhangjiantao on 2016/5/12.
 */
public interface State {

    void insertQuarter插入25分钱();

    void ejectQuarter退回25分钱();

    void turnCrank转动曲柄();

    void dispense发放糖果();

}
