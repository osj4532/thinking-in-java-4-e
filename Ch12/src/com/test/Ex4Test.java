package com.test;

class MyException extends Exception{
	private String str;
	public MyException(String s) {
		super(s);
		System.out.println("MyException()");
		str = s;
	}
	protected void f() {
		System.out.println(str);
	}
}

public class Ex4Test {

	public static void g() throws MyException {
		System.out.println("f()");
		throw new MyException("Ouch from g()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			g();
		}catch(MyException e) {
			System.err.println("Caught MyException");
			e.printStackTrace();
			e.f();
		}
	}

}
