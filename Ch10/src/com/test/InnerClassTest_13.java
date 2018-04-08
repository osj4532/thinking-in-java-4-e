package com.test;

interface Interface4{
	void print();
}

public class InnerClassTest_13 {
	
	public Interface4 getInner(String s) {
		return new Interface4() {
			public void print() {
				System.out.println(s);
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassTest_13 out = new InnerClassTest_13();
		out.getInner("hello").print();
	}

}
