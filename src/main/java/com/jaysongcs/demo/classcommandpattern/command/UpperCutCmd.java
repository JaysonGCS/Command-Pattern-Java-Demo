package com.jaysongcs.demo.classcommandpattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpperCutCmd implements ICommand {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpperCutCmd.class);

    @Override
    public void execute() {
        LOGGER.info("Upper cut!");
    }
}
