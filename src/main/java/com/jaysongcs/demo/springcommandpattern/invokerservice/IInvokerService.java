package com.jaysongcs.demo.springcommandpattern.invokerservice;

import com.jaysongcs.demo.springcommandpattern.commandservice.ICommandService;

import java.util.Map;

public interface IInvokerService {
    public void fight();

    public void setCommands(Map<String, ICommandService> commandServiceMap);
}
