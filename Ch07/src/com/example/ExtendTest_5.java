package com.example;

class A{
	public A() {
		System.out.println("A");
	}
}

class B{
	public B() {
		System.out.println("B");
	}
}

class C extends A{
	public B b = new B();
}

public class ExtendTest_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
