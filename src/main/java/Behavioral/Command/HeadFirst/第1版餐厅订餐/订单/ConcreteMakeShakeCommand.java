package Behavioral.Command.HeadFirst.第1版餐厅订餐.订单;

import Behavioral.Command.HeadFirst.第1版餐厅订餐.厨师.CookReceiver;

/**
 * Created by sahoo on 16/5/11.
 */
public class ConcreteMakeShakeCommand implements BaseOrderCommand {

    CookReceiver cook;

    public ConcreteMakeShakeCommand(CookReceiver cook) {
        this.cook = cook;
    }

    public void execute() {
        cook.makeShake();
    }
}
