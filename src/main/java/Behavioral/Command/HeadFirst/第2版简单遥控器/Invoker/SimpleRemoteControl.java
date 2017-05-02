package Behavioral.Command.HeadFirst.第2版简单遥控器.Invoker;

import Behavioral.Command.HeadFirst.第2版简单遥控器.BaseCommand.Command;

/**
 * Created by sahoo on 16/5/9.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }


    public void setCommand(Command command) {

        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
