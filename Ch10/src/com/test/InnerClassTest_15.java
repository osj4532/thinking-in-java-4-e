package com.test;

class Test1{
	public Test1(String s) {
		System.out.println(s);
	}
}

public class InnerClassTest_15 {
	
	public Test1 getTest1(String s) {
		return new Test1(s) {};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassTest_15 in = new InnerClassTest_15();
		in.getTest1("InnerClass");
	}

}
