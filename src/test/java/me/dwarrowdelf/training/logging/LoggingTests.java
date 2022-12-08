package me.dwarrowdelf.training.logging;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reference https://www.baeldung.com/slf4j-log-exceptions
 */
public class LoggingTests {

	@Test
	public void logger_should_log_error_using_message() {

		Logger logger = LoggerFactory.getLogger(LoggingTests.class);
		logger.error("An exception occurred!");

	}

	@Test
	public void logger_should_log_error_using_message_and_exception() {

		Logger logger = LoggerFactory.getLogger(LoggingTests.class);
		Exception ex = new Exception("Custom exception");
		logger.error("A custom exception occurred!", ex);

	}

	@Test
	public void logger_should_log_error_using_multiple_parameters() {

		Logger logger = LoggerFactory.getLogger(LoggingTests.class);

		String host = "localhost";
		int port = 8080;
		Exception ex = new Exception("Custom exception");

		logger.error("Another exception occurred connecting to {}:{}!", host, port, ex);

	}

}
