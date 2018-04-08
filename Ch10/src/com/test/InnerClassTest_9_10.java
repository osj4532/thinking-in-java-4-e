package com.test;

interface Interface2{
	void print();
}

public class InnerClassTest_9_10 {
	
	public Interface2 innerTest() {
		class Inner implements Interface2{
			public void print() {
				System.out.println("InnerTest.print()");
			}
		}
		return new Inner();
	}
	
	public Interface2 test(boolean b) {
		if(b) {
			class Inner implements Interface2{
				public void print() {
					System.out.println("InnerTest.print()");
				}
			}
			Inner inner = new Inner();
			return inner;
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassTest_9_10 inner = new InnerClassTest_9_10();
		inner.innerTest().print();
		inner.test(true).print();
	}

}
