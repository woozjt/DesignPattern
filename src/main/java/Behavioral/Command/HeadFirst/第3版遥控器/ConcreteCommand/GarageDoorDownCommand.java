package Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand;

import Behavioral.Command.HeadFirst.第3版遥控器.BaseCommand.Command;
import Behavioral.Command.HeadFirst.第3版遥控器.Receiver.GarageDoor;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }

    public void undo() {
        garageDoor.up();
    }
}
