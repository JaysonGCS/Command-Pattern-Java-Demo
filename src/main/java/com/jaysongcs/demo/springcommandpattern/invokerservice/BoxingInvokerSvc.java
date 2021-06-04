package com.jaysongcs.demo.springcommandpattern.invokerservice;

import com.jaysongcs.demo.springcommandpattern.commandservice.ICommandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BoxingInvokerSvc implements IInvokerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoxingInvokerSvc.class);

    private final Map<String, ICommandService> cmdServiceMap = new HashMap<>();

    public void fight() {
        LOGGER.info("Boxing Fight");
        cmdServiceMap.values().forEach(ICommandService::execute);
    }

    @Override
    public void setCommands(Map<String, ICommandService> commandServiceMap) {
        cmdServiceMap.putAll(commandServiceMap);
    }

}
