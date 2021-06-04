package com.jaysongcs.demo.classcommandpattern.invoker;

import com.jaysongcs.demo.classcommandpattern.command.ICommand;
import com.jaysongcs.demo.enumcommandpattern.commandenum.CommandEnum;

import java.util.Map;

public interface IInvoker {
    public void fight();

    public void setCommands(Map<String, ICommand> commandEnumMap);
}
