package com.test;

abstract class C{
	
}

class C1 extends C{
	public void print() {
		System.out.println("C1 : Hello");
	}
}

public class AbstractTest_4 {
	public static void testC(C c) {
		((C1)c).print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c1 = new C1();
		AbstractTest_4.testC(c1);
	}

}
