package com.example;

class Test{
	public Test() {
		finalize();
	}
	protected void finalize() {
		System.out.println("finalize");
	}
}

public class FinanlizeTest_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		//new Test();
		System.gc();
	}

}
