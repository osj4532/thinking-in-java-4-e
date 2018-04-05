package com.example;

class Test1{
	private void print() {
		System.out.println("Test1");
	}
}
//private는 메소드 오버라이딩 불가능
class Test2 extends Test1{
	//@Override
	//private void print() {}
}

public class PrivateFinalTest_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
