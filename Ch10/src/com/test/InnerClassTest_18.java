package com.test;

class OutClass{
	
	protected static class InClass{
		public void print() {
			System.out.println("InClass");
		}
	}
}

public class InnerClassTest_18 extends OutClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InClass().print();
	}

}
