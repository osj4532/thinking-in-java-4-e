package com.test;

interface Interface3{
	void print();
}

class Test{
	private class Inner implements Interface3{
		public void print() {
			System.out.println("Inner.print()");
		}
	}
	
	public Interface3 getInner() {
		return new Inner();
	}
}

public class InnerClassTest_11 {
	
	public static void main(String[] args) {
		Test test = new Test();
		test.getInner().print();
		//not found class error 
		//(Inner)test.getInner().print();
	}
}
