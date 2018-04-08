package com.test;

interface Test2{
	void howdy();
	class Test3 implements Test2{
		public void howdy() {
			System.out.println("Howdy!");
		}
	}
}

public class InterfaceClass_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2.Test3 t = new Test2.Test3();
		t.howdy();
	}

}
