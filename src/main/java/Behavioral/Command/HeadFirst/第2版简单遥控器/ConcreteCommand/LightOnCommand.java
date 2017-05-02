package Behavioral.Command.HeadFirst.第2版简单遥控器.ConcreteCommand;

import Behavioral.Command.HeadFirst.第2版简单遥控器.BaseCommand.Command;
import Behavioral.Command.HeadFirst.第2版简单遥控器.Receiver.Light;

/**
 * Created by sahoo on 16/5/9.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
