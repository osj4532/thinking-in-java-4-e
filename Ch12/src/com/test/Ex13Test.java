package com.test;

class Exception1A extends Exception{
	public Exception1A(String msg) {
		super(msg);
	}
}

class Exception1B extends ArrayIndexOutOfBoundsException{
	public Exception1B(String msg) {
		super(msg);
	}
}

class Exception1C extends NullPointerException{
	public Exception1C(String msg) {
		super(msg);
	}
}
public class Ex13Test {

	public static void genEx(int i) throws Exception1A, Exception1B, Exception1C{
		if(i == 0) throw new Exception1A("Exception");
		if(i == 1) throw new Exception1B("ArrayException");
		if(i == 2) throw new Exception1C("NullException");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				genEx(0);
				genEx(1);
				genEx(2);
			}catch(Exception e) {
				System.out.println("getMessage():" + e.getMessage());
				System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
				System.out.println("printStackTrace : ");
				e.printStackTrace();
		}finally {
			System.out.println("Finally run test");
		}
	}

}
