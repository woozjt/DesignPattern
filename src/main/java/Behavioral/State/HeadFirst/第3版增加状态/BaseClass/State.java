package Behavioral.State.HeadFirst.第3版增加状态.BaseClass;

/**
 * Created by zhangjiantao on 2016/5/13.
 */
public interface State {

    void insertQuarter插入25分钱();

    void ejectQuarter退回25分钱();

    void turnCrank转动曲柄();

    void dispense发放糖果();
}
