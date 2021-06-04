package com.jaysongcs.demo.enumcommandpattern.invoker;

import com.jaysongcs.demo.enumcommandpattern.commandenum.CommandEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BoxingInvoker implements IInvoker {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoxingInvoker.class);
    private final Map<String, CommandEnum> cmdEnumMap = new HashMap<>();

    @Override
    public void fight() {
        LOGGER.info("Boxing Fight");
        cmdEnumMap.values().forEach(CommandEnum::execute);
    }

    @Override
    public void setCommands(Map<String, CommandEnum> commandEnumMap) {
        cmdEnumMap.putAll(commandEnumMap);
    }
}
