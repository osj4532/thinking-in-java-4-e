package com.test;

abstract  class Inner{
	public abstract void f();
}

class Outter3{
	public Inner getInner() {
		return new Inner() {
			@Override public void f() {
				System.out.println("anonymousClass");
			}
		};
	}
}

public class InnerClassTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter3 out = new Outter3();
		Inner in = out.getInner();
		in.f();
	}

}
