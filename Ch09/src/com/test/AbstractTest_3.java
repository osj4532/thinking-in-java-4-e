package com.test;

abstract class B{
	public B() {
		this.print();
	}
	public abstract void print();
}

class B1 extends B{
	private int i = 9;
	
	@Override
	public void print() {
		System.out.println("B1 i = " + i);
	}
}

public class AbstractTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1 = new B1();
		b1.print();
	}

}
