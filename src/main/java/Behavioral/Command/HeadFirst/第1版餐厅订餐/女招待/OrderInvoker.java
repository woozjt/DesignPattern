package Behavioral.Command.HeadFirst.第1版餐厅订餐.女招待;

import Behavioral.Command.HeadFirst.第1版餐厅订餐.订单.BaseOrderCommand;

/**
 * Created by sahoo on 16/5/10.
 */
public class OrderInvoker {
    BaseOrderCommand orderCommand;

    public OrderInvoker() {    }

    public void takeOrder(BaseOrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void orderUp() {
        orderCommand.execute();
    }
}
