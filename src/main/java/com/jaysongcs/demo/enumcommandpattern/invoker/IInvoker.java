package com.jaysongcs.demo.enumcommandpattern.invoker;

import com.jaysongcs.demo.enumcommandpattern.commandenum.CommandEnum;

import java.util.Map;

public interface IInvoker {
    public void fight();

    public void setCommands(Map<String, CommandEnum> commandEnumMap);
}
