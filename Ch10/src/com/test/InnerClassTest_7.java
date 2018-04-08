package com.test;

class Outter2{
	private int num = 2;
	
	private void setnum() {
		System.out.println(num);
	}
	class Inner{
		void test() {
			num *= 2;
			setnum();
		}
	}
	public void getInner() {
		Inner in = new Inner();
		in.test();
	}
	
}

public class InnerClassTest_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter2 out = new Outter2();
		out.getInner();
	}

}
