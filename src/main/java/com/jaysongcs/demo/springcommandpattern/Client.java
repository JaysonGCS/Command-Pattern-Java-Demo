package com.jaysongcs.demo.springcommandpattern;

import com.jaysongcs.demo.springcommandpattern.commandservice.ICommandService;
import com.jaysongcs.demo.springcommandpattern.customannotation.UpperBodyAction;
import com.jaysongcs.demo.springcommandpattern.invokerservice.BoxingInvokerSvc;
import com.jaysongcs.demo.springcommandpattern.invokerservice.KarateInvokerSvc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication
public class Client implements ApplicationRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

	@Autowired
	private BoxingInvokerSvc boxingInvokerSvc;

	@Autowired
	private KarateInvokerSvc karateInvokerSvc;

	@Autowired
	private Map<String, ICommandService> allCmdServiceMap;

	@Autowired
	@UpperBodyAction
	private Map<String, ICommandService> upperBodyCmdServiceMap;

	@Autowired
	@Qualifier("PUNCH")
	private ICommandService punchCmdService;

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Retrieve all the concrete implementation bean via interface
		LOGGER.info("{}", context.getBeansOfType(ICommandService.class));
		LOGGER.info("{}", allCmdServiceMap);

		// Retrieve single concrete implementation bean via qualifier
		LOGGER.info("Punch only: {}", context.getBean("PUNCH"));
		LOGGER.info("Punch only: {}", punchCmdService);

		// Retrieve all the concrete implementation bean via custom annotation
		LOGGER.info("Upper body only: {}", context.getBeansWithAnnotation(UpperBodyAction.class));
		LOGGER.info("Upper body only: {}", upperBodyCmdServiceMap);

		boxingInvokerSvc.setCommands(upperBodyCmdServiceMap);
		boxingInvokerSvc.fight();

		karateInvokerSvc.setCommands(allCmdServiceMap);
		karateInvokerSvc.fight();
	}
}
