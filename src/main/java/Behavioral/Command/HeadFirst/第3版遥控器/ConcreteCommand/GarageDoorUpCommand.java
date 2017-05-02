package Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand;

import Behavioral.Command.HeadFirst.第3版遥控器.BaseCommand.Command;
import Behavioral.Command.HeadFirst.第3版遥控器.Receiver.GarageDoor;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}
