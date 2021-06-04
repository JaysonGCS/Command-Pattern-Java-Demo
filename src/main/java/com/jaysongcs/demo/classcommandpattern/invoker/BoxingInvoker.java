package com.jaysongcs.demo.classcommandpattern.invoker;

import com.jaysongcs.demo.classcommandpattern.command.ICommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BoxingInvoker implements IInvoker {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoxingInvoker.class);
    private final Map<String, ICommand> cmdMap = new HashMap<>();

    @Override
    public void fight() {
        LOGGER.info("Boxing Fight");
        cmdMap.values().forEach(ICommand::execute);
    }

    @Override
    public void setCommands(Map<String, ICommand> commandEnumMap) {
        cmdMap.putAll(commandEnumMap);
    }
}
