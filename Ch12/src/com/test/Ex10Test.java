package com.test;

class Ex10Exception1 extends Exception{
	public Ex10Exception1(String msg) {
		super(msg);
	}
}

class Ex10Exception2 extends Exception{
	public Ex10Exception2(String msg) {
		super(msg);
	}
}

public class Ex10Test {
	public static void f() {
		try {
			try {
				g();
			} catch (Ex10Exception1 e) {
				System.out.println("inner f()");
				e.printStackTrace();
				throw new Ex10Exception2("Ex10Exception2 in f()");
			}
		}catch(Ex10Exception2 e) {
			System.out.println("outter f()");
			e.printStackTrace();
		}
	}
	public static void g() throws Ex10Exception1{
		throw new Ex10Exception1("Ex10Exception1 in g()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
	}

}
