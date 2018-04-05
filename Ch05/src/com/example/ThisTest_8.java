package com.example;

public class ThisTest_8 {

	public void Test1() {
		Test2();
		this.Test2();
	}
	
	public void Test2() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest_8 test = new ThisTest_8();
		test.Test1();
	}

}
