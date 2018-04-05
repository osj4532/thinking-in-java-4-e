package com.example;


class Test{
	protected String s = "hello";
	
	public void print() {
		System.out.println(s);
	}
}

public class Test_6 {

	public void printTest() {
		new Test().print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test_6().printTest();
	}

}
