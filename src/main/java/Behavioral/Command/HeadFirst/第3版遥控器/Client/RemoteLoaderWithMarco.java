package Behavioral.Command.HeadFirst.第3版遥控器.Client;

import Behavioral.Command.HeadFirst.第3版遥控器.BaseCommand.Command;
import Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand.*;
import Behavioral.Command.HeadFirst.第3版遥控器.Invoker.RemoteControlWithUndo;
import Behavioral.Command.HeadFirst.第3版遥控器.Receiver.*;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class RemoteLoaderWithMarco {
    public static void start() {
        RemoteControlWithUndo remoteControlWithMarco = new RemoteControlWithUndo();

        Light light=new Light("Living Room");
        TV tv=new TV("Living Room");
        Stereo stereo=new Stereo("Living Room");
        Hottub hottub=new Hottub("Living Room") ;

        LightOnCommand lightOn=new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand=new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOnCommand=new TVOnCommand(tv);
        HottubOnCommand hottubOnCommand=new HottubOnCommand(hottub);

        Command[] partyOn={lightOn,stereoOnWithCDCommand,tvOnCommand,hottubOnCommand};

        LightOffCommand lightOffCommand=new LightOffCommand(light);
        StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);
        TVOffCommand tvOffCommand=new TVOffCommand(tv);
        HottubOffCommand hottubOffCommand=new HottubOffCommand(hottub);

        Command[] partyOff={lightOffCommand,stereoOffCommand,tvOffCommand,hottubOffCommand};

        MacroCommand partyOnMacro=new MacroCommand(partyOn);
        MacroCommand partyOffMacro=new MacroCommand(partyOff);

        remoteControlWithMarco.setCommand(0,partyOnMacro,partyOffMacro);

        System.out.println(remoteControlWithMarco);
        System.out.println("---- Pushing Macro On ----");
        remoteControlWithMarco.onButtonWasPushed(0);
        System.out.println("---- Pushing Macro On Undo ----");
        remoteControlWithMarco.undoButtonWasPushed();

        System.out.println("---- Pushing Macro Off ----");
        remoteControlWithMarco.offButtonWasPushed(0);
        System.out.println("---- Pushing Macro Off Undo ----");
        remoteControlWithMarco.undoButtonWasPushed();

    }
}
