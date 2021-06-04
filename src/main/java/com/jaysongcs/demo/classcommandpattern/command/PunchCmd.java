package com.jaysongcs.demo.classcommandpattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PunchCmd implements ICommand {
    private static final Logger LOGGER = LoggerFactory.getLogger(PunchCmd.class);

    @Override
    public void execute() {
        LOGGER.info("Punch!");
    }
}
