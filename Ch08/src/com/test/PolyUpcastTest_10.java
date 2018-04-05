package com.test;

class Base{
	public void call() {
		System.out.println(write());
	}
	public String write() {
		return "Base";
	}
}

class Sub extends Base{
	@Override
	public String write() {
		return "Sub";
	}
}

public class PolyUpcastTest_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Sub();
		base.call();
	}

}
