package cleancode.ch08.boundary;

import static org.junit.Assert.*;

import org.apache.logging.log4j.core.Logger;
import org.junit.Test;

public class LearningLog4j {

	/*
	@Test
	public void testLogCreate() {
		Logger logger = Logger.getLogger("MyLogger");
		logger.info("hello");
	}

	@Test
	public void testLogAddAppender() {
		Logger logger = Logger.getLogger("MyLogger");
		ConsoleAppender appender = new ConsoleAppender();
		logger.addAppender(appender);
		logger.info("hello");
	}

	private Logger logger;

	@Before
	public void initialize() {
		logger = Logger.getLogger("logger");
		logger.removeAllAppenders();
		Logger.getRootLogger().removeAllAppenders();
	}

	@Test
	public void basicLogger() {
		BasicConfigurator.configure();
		logger.info("basicLogger");
	}

	@Test
	public void addAppenderWithStream() {
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), ConsoleAppender.SYSTEM_OUT));
		logger.info("addAppenderWithStream");
	}

	@Test
	public void addAppenderWithoutStream() {
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n")));
		logger.info("addAppenderWithoutStream");
	}
	//*/
}
