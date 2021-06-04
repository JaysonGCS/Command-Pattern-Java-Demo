package com.jaysongcs.demo.classcommandpattern;

import com.jaysongcs.demo.classcommandpattern.command.ICommand;
import com.jaysongcs.demo.classcommandpattern.command.KickCmd;
import com.jaysongcs.demo.classcommandpattern.command.PunchCmd;
import com.jaysongcs.demo.classcommandpattern.command.UpperCutCmd;
import com.jaysongcs.demo.classcommandpattern.invoker.BoxingInvoker;
import com.jaysongcs.demo.classcommandpattern.invoker.KarateInvoker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        // Initialize command map that we are going to pass to invoker
        Map<String, ICommand> commandMap = new HashMap<>();
        commandMap.put("punch", new PunchCmd());
        commandMap.put("upper cut", new UpperCutCmd());

        // Boxing Invoker
        BoxingInvoker boxingInvoker = new BoxingInvoker();
        boxingInvoker.setCommands(commandMap);
        boxingInvoker.fight();

        // Karate Invoker
        commandMap.put("kick", new KickCmd());
        KarateInvoker karateInvoker = new KarateInvoker();
        karateInvoker.setCommands(commandMap);
        karateInvoker.fight();
    }
}
