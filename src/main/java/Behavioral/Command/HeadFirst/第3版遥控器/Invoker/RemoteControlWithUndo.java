package Behavioral.Command.HeadFirst.第3版遥控器.Invoker;

import Behavioral.Command.HeadFirst.第3版遥控器.BaseCommand.Command;
import Behavioral.Command.HeadFirst.第3版遥控器.ConcreteCommand.NoCommand;

/**
 * Created by zhangjiantao on 2016/5/11.
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n-----Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[solt " + i + "] " + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() );
        return stringBuff.toString();
    }
}
