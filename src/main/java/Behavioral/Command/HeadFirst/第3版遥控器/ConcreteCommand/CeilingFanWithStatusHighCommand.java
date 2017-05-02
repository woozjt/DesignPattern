package Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand;

import Behavioral.Command.HeadFirst.第3版遥控器.BaseCommand.Command;
import Behavioral.Command.HeadFirst.第3版遥控器.Receiver.CeilingFanWithStatus;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class CeilingFanWithStatusHighCommand implements Command {
    CeilingFanWithStatus ceilingFanWithStatus;
    int prevSpeed;

    public CeilingFanWithStatusHighCommand(CeilingFanWithStatus ceilingFanWithStatus) {
        this.ceilingFanWithStatus = ceilingFanWithStatus;
    }

    public void execute() {
        prevSpeed = ceilingFanWithStatus.getSpeed();
        ceilingFanWithStatus.high();
    }

    public void undo() {
        if (prevSpeed == CeilingFanWithStatus.HIGH) {
            ceilingFanWithStatus.high();
        } else if (prevSpeed == CeilingFanWithStatus.MEDIUM) {
            ceilingFanWithStatus.medium();
        } else if (prevSpeed == CeilingFanWithStatus.LOW) {
            ceilingFanWithStatus.low();
        } else if (prevSpeed == CeilingFanWithStatus.OFF) {
            ceilingFanWithStatus.off();
        }
    }
}
