package demo_log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jclassdemo {
	
	private static Logger logger = LogManager.getLogger(log4jclassdemo.class);  // creating a logger for log4jclassdemo class

	public static void main(String[] args) {
		
		System.out.println("\n hello world \n");
		
		logger.error("this is error");
		logger.warn("this is warning");
		
		System.out.println("\n completed \n");

	}

}
