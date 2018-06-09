package com.test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class Ex7LoggingException extends Exception{
	private Logger logger = 
			Logger.getLogger("Ex7LoggingException");
	public Ex7LoggingException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class Ex7Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		try {
			for(int i = 0; i < 4; i++) {
				arr[i] = i;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Caught ArrayIndexOfBoundsException");
			e.printStackTrace();
			new Ex7LoggingException(e);
		}
	}

}
