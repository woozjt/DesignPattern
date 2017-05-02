package Behavioral.Command.HeadFirst.第3版遥控器.Client;

import Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand.*;
import Behavioral.Command.HeadFirst.第3版遥控器.Invoker.RemoteControlWithUndo;
import Behavioral.Command.HeadFirst.第3版遥控器.Receiver.CeilingFanWithStatus;
import Behavioral.Command.HeadFirst.第3版遥控器.Receiver.Light;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class RemoteLoaderWithStatus {

    public static void start() {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        CeilingFanWithStatus ceilingFanWithStatus = new CeilingFanWithStatus("Living Room");

        CeilingFanWithStatusMediumCommand ceilingFanWithStatusMediumCommand = new CeilingFanWithStatusMediumCommand(ceilingFanWithStatus);
        CeilingFanWithStatusHighCommand ceilingFanWithStatusHighCommand = new CeilingFanWithStatusHighCommand(ceilingFanWithStatus);
        CeilingFanWithStatusOffCommand ceilingFanWithStatusOffCommand = new CeilingFanWithStatusOffCommand(ceilingFanWithStatus);

        remoteControlWithUndo.setCommand(0,ceilingFanWithStatusMediumCommand,ceilingFanWithStatusOffCommand);
        remoteControlWithUndo.setCommand(1,ceilingFanWithStatusHighCommand,ceilingFanWithStatusOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}
