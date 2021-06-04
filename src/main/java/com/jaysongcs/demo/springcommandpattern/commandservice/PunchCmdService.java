package com.jaysongcs.demo.springcommandpattern.commandservice;

import com.jaysongcs.demo.springcommandpattern.customannotation.UpperBodyAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@UpperBodyAction    // Custom annotation for grouping purpose
@Service("PUNCH")    // Qualifier for @Autowire to retrieve single bean
public class PunchCmdService implements ICommandService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PunchCmdService.class);

    @Override
    public void execute() {
        LOGGER.info("Punch!");
    }
}
