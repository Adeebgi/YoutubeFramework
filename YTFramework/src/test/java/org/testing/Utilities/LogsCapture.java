package org.testing.Utilities;

import org.apache.log4j.xml.DOMConfigurator;

import jxl.common.Logger;

public class LogsCapture {
	//for log capture we use the apache lgo4j library 
	// there are three things required
	//1) layout file---- where we will define the logs format and log file location 
	//2) the utility which will capture the logs 
	//3) the test cases from where we will call the utility method

	public static void takeLogs(String classname, String message) throws ClassNotFoundException {
		//firs use DOMConfigure and pass the path of layout file 
		DOMConfigurator.configure("../YTFramework/layout.xml");
		// there is a class Logger apache then we need to give the class name which we want to 
		//take the logs 
		Logger l=Logger.getLogger(LogsCapture.class);
		//get the message 
		l.info(message);
	}
}
