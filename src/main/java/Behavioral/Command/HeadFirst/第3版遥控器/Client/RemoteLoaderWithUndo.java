package Behavioral.Command.HeadFirst.第3版遥控器.Client;

import Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand.LightOffCommand;
import Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand.LightOnCommand;
import Behavioral.Command.HeadFirst.第3版遥控器.Invoker.RemoteControlWithUndo;
import Behavioral.Command.HeadFirst.第3版遥控器.Receiver.Light;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class RemoteLoaderWithUndo {

    public static void start() {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}