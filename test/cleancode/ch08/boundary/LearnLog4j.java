package cleancode.ch08.boundary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class LearnLog4j {

	private static final Logger logger = LogManager.getLogger("HelloWorld");

	@Test
	public void test() {
		System.out.println("log test");
		logger.info("Hello, World!");
		logger.error("log4j error");
	}

}
