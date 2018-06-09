package com.example;

public class NeverCaught {
	
	static void f() {
		throw new RuntimeException("From f()");
	}
	static void g() {
		f();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		g();
	}

}
