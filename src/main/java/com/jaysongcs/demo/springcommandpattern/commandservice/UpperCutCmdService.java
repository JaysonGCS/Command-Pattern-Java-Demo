package com.jaysongcs.demo.springcommandpattern.commandservice;

import com.jaysongcs.demo.springcommandpattern.customannotation.UpperBodyAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@UpperBodyAction    // Custom annotation for grouping purpose
@Service("UPPERCUT")    // Qualifier for @Autowire to retrieve single bean
public class UpperCutCmdService implements ICommandService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpperCutCmdService.class);

    @Override
    public void execute() {
        LOGGER.info("Upper cut!");
    }
}
