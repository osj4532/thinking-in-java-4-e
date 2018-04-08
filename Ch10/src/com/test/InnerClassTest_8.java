package com.test;

public class InnerClassTest_8 {
	
	private class Inner{
		private int inner_num = 5;
	}
	
	public void getInnerMember() {
		Inner in = new Inner();
		System.out.println(in.inner_num);
	}
	
	public static void main(String[] args) {
		InnerClassTest_8 in8 = new InnerClassTest_8();
		in8.getInnerMember();
	}
}
