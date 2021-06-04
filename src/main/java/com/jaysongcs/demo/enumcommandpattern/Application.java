package com.jaysongcs.demo.enumcommandpattern;

import com.jaysongcs.demo.enumcommandpattern.commandenum.CommandEnum;
import com.jaysongcs.demo.enumcommandpattern.invoker.BoxingInvoker;
import com.jaysongcs.demo.enumcommandpattern.invoker.IInvoker;
import com.jaysongcs.demo.enumcommandpattern.invoker.KarateInvoker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        // Executing a kick
        CommandEnum.KICK_ENUM.execute();

        LOGGER.info("Name of the Enum \"KICK_ENUM\": {}", CommandEnum.KICK_ENUM.getName());
        LOGGER.info("Enum of \"kick\": {}", CommandEnum.getEnumFromName("kick"));

        IInvoker boxingInvoker = new BoxingInvoker();
        boxingInvoker.setCommands(CommandEnum.getUpperBodyEnumMap());
        boxingInvoker.fight();

        IInvoker karateInvoker = new KarateInvoker();
        karateInvoker.setCommands(CommandEnum.getAllEnumMap());
        karateInvoker.fight();
    }
}
