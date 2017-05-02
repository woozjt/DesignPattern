package Behavioral.Command.HeadFirst.第2版简单遥控器.Client;

import Behavioral.Command.HeadFirst.第2版简单遥控器.ConcreteCommand.LightOnCommand;
import Behavioral.Command.HeadFirst.第2版简单遥控器.Invoker.SimpleRemoteControl;
import Behavioral.Command.HeadFirst.第2版简单遥控器.Receiver.Light;

/**
 * Created by sahoo on 16/5/10.
 */
public class RemoteControlTest {
    public static void Start(){
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light();
        LightOnCommand lightOn=new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
