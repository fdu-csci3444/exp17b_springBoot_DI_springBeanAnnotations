package exp17b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import exp17b.di.bean.PersonBeansUser4component;
import exp17b.di.bean.PersonBeansUser4config;
import exp17b.di.dis.EchoServiceUserUser;
import exp17b.di.dis.ServiceUsersUser;

@SpringBootApplication
public class Exp17bSpringBootCommandLineRunnerApplication implements CommandLineRunner {
// NOTE ilker below line is the default generated one. Above replacement says, this app is a SpringBoot CommandLineRunner
//public class Exp17bSpringBootCommandLineRunnerApplication {
	
	// NOTE ilker logback is the default slf4j implementation used by SpringBoot
	private static final Logger logger = LoggerFactory.getLogger(Exp17bSpringBootCommandLineRunnerApplication.class);

	@Autowired
	private ServiceUsersUser serviceUsersUser;
	
	@Autowired
	private PersonBeansUser4config personBeansUser4config;
	
	@Autowired
	private PersonBeansUser4component personBeansUser4component;
	
	public static void main(String[] args) {
		// NOTE ilker loggging.level specified in application.properties will NOT be in effect before spring app starts. So below 2 lines will always print regardless of level
		logger.error("BEF main - ERROR");
		logger.warn( "BEF main - WARN");
		logger.info( "BEF main - INFO");
		logger.debug("BEF main - DEBUG");
		logger.trace("BEF main - TRACE");
		
//		SpringApplication.run(Exp17bSpringBootCommandLineRunnerApplication.class, args);
		// NOTE ilker if one really wants to get hold of a bean instance in "main" method, you can do that via "context" like below 2 lines
		ConfigurableApplicationContext context = SpringApplication.run(Exp17bSpringBootCommandLineRunnerApplication.class, args);
		EchoServiceUserUser serviceUsersUser2 = context.getBean(ServiceUsersUser.class);
		serviceUsersUser2.useUseEchoServices("MESSAGE1", "MESSAGE2");
		// NOTE ilker above block is not suggested		
//		serviceUsersUser.useUseEchoServices("message1",	"message2");	// WRONG - injected attribute is NOT available in static method

		// NOTE ilker below 2 lines AFTER spring app starts will be controlled by logging.level
		logger.error("EOF main - ERROR");
		logger.warn( "EOF main - WARN");
		logger.info( "EOF main - INFO");
		logger.debug("EOF main - DEBUG");
		logger.trace("EOF main - TRACE");
		
		int myInt = 1, myInt2 = 2, myInt3 = 3, myInt4 = 4;
		logger.debug("myInt:" + myInt + ", myInt2:" + myInt2 + ", myInt3:" + myInt3 + ", myInt4:" + myInt4);	// WRONG - don't do this. Do below instead
		logger.debug("myInt:{}, myInt2:{}, myInt3:{}, myInt4:{}", myInt, myInt2, myInt3, myInt4);	// CORRECT
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info( "BEF run - INFO");
		serviceUsersUser.useUseEchoServices("message1",	"message2");
		personBeansUser4config.usePersons("Mr");
		personBeansUser4config.usePersonContainers("MR");
		personBeansUser4component.usePersons("Ms");
		personBeansUser4component.usePersonContainers("MS");
	}

}
