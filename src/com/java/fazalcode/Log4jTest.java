package com.java.fazalcode;

import org.apache.log4j.Logger;


/**
 * @author : Tatarao
 * @date   : 02-Nov-2013 11:19:15 AM
 */
public class Log4jTest {
	
	final Logger logger=Logger.getLogger(this.getClass().getName());
	
	public void getLog4jTest(){
		logger.debug("debug");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
	}
	
	public static void main(String[] args) {
		
		Log4jTest t=new Log4jTest();
		t.getLog4jTest();

	}

}
