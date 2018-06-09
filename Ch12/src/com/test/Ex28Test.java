package com.test;

class MyException1 extends RuntimeException{
	private String str;
	public MyException1(String s) {
		super(s);
		System.out.println("MyException()");
		str = s;
	}
	protected void f() {
		System.out.println(str);
	}
}

public class Ex28Test {

	public static void g() throws MyException1 {
		System.out.println("f()");
		throw new MyException1("Ouch from g()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			g();
		
	}

}
