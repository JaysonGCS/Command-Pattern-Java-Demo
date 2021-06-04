package com.jaysongcs.demo.classcommandpattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KickCmd implements ICommand {
    private static final Logger LOGGER = LoggerFactory.getLogger(KickCmd.class);

    @Override
    public void execute() {
        LOGGER.info("Kick!");
    }
}
