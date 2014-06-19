package com.training.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainApp {

	// static Logger log = Logger.getLogger(MainApp.class.getName());
	static Log log = LogFactory.getLog(MainApp.class.getName());

	public static void main(String[] args) {

		log.debug("START");
		log.info("Started the program");
		log.error("Error!");
		log.info("Exiting the program");
		log.debug("END");
	}
}
