package com.test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class Ex6LoggingException1 extends Exception{
	private Logger logger = 
				Logger.getLogger("Ex6LoggingException1");
	public Ex6LoggingException1() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

class Ex6LoggingException2 extends Exception{
	private Logger logger = 
				Logger.getLogger("Ex6LoggingException2");
	public Ex6LoggingException2() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class Ex6Test {

	public static void main(String[] args) {
		try {
			throw new Ex6LoggingException1();
		}catch(Ex6LoggingException1 e) {
			System.err.println("Caught "+e);
		}
		
		try {
			throw new Ex6LoggingException2();
		}catch(Ex6LoggingException2 e) {
			System.err.println("Caught "+e);
		}

	}

}
