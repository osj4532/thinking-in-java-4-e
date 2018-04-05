package com.example;

class Base{
	public Base(char c) {
		System.out.println(c+" : Base");
	}
}

class Sub extends Base{
	public Sub() {
		super('f');
		System.out.println("Sub()");
	}
	
	public Sub(char c) {
		super(c);
		System.out.println("Sub(char c)");
	}
}

public class ExtendTest_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		Sub sub1 = new Sub('s');
	}

}
