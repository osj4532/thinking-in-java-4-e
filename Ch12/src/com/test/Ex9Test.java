package com.test;

class ExceptionA extends Exception{
	public ExceptionA(String msg) {
		super(msg);
	}
}

class ExceptionB extends ArrayIndexOutOfBoundsException{
	public ExceptionB(String msg) {
		super(msg);
	}
}

class ExceptionC extends NullPointerException{
	public ExceptionC(String msg) {
		super(msg);
	}
}

public class Ex9Test {

	public static void genEx(int i) throws ExceptionA, ExceptionB, ExceptionC{
		if(i == 0) throw new ExceptionA("Exception");
		if(i == 1) throw new ExceptionB("ArrayException");
		if(i == 2) throw new ExceptionC("NullException");
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
		}
	}

}
