package com.jaysongcs.demo.enumcommandpattern.commandenum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public enum CommandEnum {

    PUNCH_ENUM("punch") {
        @Override
        public void execute() {
            Logger LOGGER = LoggerFactory.getLogger(CommandEnum.class);
            LOGGER.info("Punch!");
        }
    },
    UPPER_CUT_ENUM("uppercut") {
        @Override
        public void execute() {
            Logger LOGGER = LoggerFactory.getLogger(CommandEnum.class);
            LOGGER.info("Upper Cut!!");
        }
    },
    KICK_ENUM("kick") {
        @Override
        public void execute() {
            Logger LOGGER = LoggerFactory.getLogger(CommandEnum.class);
            LOGGER.info("Kick!");
        }
    };

    private String name;

    CommandEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CommandEnum getEnumFromName(String name) {
        for (CommandEnum cmd : CommandEnum.values()) {
            if (cmd.name.equals(name)) {
                return cmd;
            }
        }
        return null;
    }

    public static Map<String, CommandEnum> getUpperBodyEnumMap() {
        Map<String, CommandEnum> upperBodyEnumMap = new HashMap<>();
        upperBodyEnumMap.put(CommandEnum.UPPER_CUT_ENUM.name, CommandEnum.UPPER_CUT_ENUM);
        upperBodyEnumMap.put(CommandEnum.PUNCH_ENUM.name, CommandEnum.PUNCH_ENUM);
        return upperBodyEnumMap;
    }

    public static Map<String, CommandEnum> getAllEnumMap() {
        Map<String, CommandEnum> allEnumMap = new HashMap<>();
        for (CommandEnum cmd : CommandEnum.values()) {
            allEnumMap.put(cmd.name, cmd);
        }
        return allEnumMap;
    }

    public abstract void execute();
}
