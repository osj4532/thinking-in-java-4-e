package com.example;

class Test3{
	public final void print() {
		System.out.println("final override");
	}
}

public class OverrideFinalTest_21 extends Test3{
	//메소드에 final 키워드가 있으면 오버라이딩 불가
	//@Override
	//public final void print() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
