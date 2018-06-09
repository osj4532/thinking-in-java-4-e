package com.test;

class Ex11Exception1 extends Exception{
	public Ex11Exception1(String msg) {
		super(msg);
	}
}

class Ex11Exception2 extends Exception{
	public Ex11Exception2(String msg) {
		super(msg);
	}
}

public class Ex11Test {
	public static void f() {
			try {
				g();
			} catch (Ex11Exception1 e) {
				System.out.println("inner f()");
				e.printStackTrace();
				throw new RuntimeException(e);
			}
	}
	
	public static void g() throws Ex11Exception1{
		throw new Ex11Exception1("Ex11Exception1 in g()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
	}

}
