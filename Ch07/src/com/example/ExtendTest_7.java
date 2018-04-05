package com.example;

class A1{
	public A1(int i) {
		System.out.println("A");
	}
}

class B1{
	public B1(int i) {
		System.out.println("B");
	}
}

class C1 extends A1{
	public C1(int i) {
		super(i);
		System.out.println("C");
	}
	public B1 b = new B1(1);
}

public class ExtendTest_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1(1);
	}

}
