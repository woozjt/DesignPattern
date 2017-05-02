package Behavioral.Command.HeadFirst.第1版餐厅订餐.顾客;

import Behavioral.Command.HeadFirst.第1版餐厅订餐.厨师.CookReceiver;
import Behavioral.Command.HeadFirst.第1版餐厅订餐.女招待.OrderInvoker;
import Behavioral.Command.HeadFirst.第1版餐厅订餐.订单.BaseOrderCommand;
import Behavioral.Command.HeadFirst.第1版餐厅订餐.订单.ConcreteMakeBurgerCommand;
import Behavioral.Command.HeadFirst.第1版餐厅订餐.订单.ConcreteMakeShakeCommand;

/**
 * Created by sahoo on 16/5/11.
 */
public class CreateOrderTestDrive {

    public static void CreateOrder() {
        OrderInvoker order = new OrderInvoker();
        CookReceiver cook = new CookReceiver();

        BaseOrderCommand burgerCommand = new ConcreteMakeBurgerCommand(cook);
        order.takeOrder(burgerCommand);
        order.orderUp();

        BaseOrderCommand shakeCommand = new ConcreteMakeShakeCommand(cook);
        order.takeOrder(shakeCommand);
        order.orderUp();
    }

}
