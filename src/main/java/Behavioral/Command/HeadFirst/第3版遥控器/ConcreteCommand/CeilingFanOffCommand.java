package Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand;

import Behavioral.Command.HeadFirst.第3版遥控器.BaseCommand.Command;
import Behavioral.Command.HeadFirst.第3版遥控器.Receiver.CeilingFan;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }

    public void undo() {
        ceilingFan.on();
    }
}
