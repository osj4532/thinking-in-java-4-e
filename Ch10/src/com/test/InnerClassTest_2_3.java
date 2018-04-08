package com.test;

public class InnerClassTest_2_3 {
	private String str;
	
	private class InnerClass{
		public String toSting(String str) {
			InnerClassTest_2_3 ict = new InnerClassTest_2_3();
			ict.str = str;
			return ict.str;
		}
	}
	
	public void innerMethod(String str) {
		InnerClass ic = new InnerClass();
		System.out.println(ic.toSting(str));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassTest_2_3 ict = new InnerClassTest_2_3();
		ict.innerMethod("hello");
	}

}
