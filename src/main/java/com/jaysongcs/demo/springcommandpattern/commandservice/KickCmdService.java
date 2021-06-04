package com.jaysongcs.demo.springcommandpattern.commandservice;

import com.jaysongcs.demo.springcommandpattern.customannotation.LowerBodyAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@LowerBodyAction    // Custom annotation for grouping purpose
@Service("KICK")    // Qualifier for @Autowire to retrieve single bean
public class KickCmdService implements ICommandService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KickCmdService.class);

    @Override
    public void execute() {
        LOGGER.info("Kick!");
    }
}
