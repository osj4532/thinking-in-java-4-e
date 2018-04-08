package com.test;

class Outter{
	class Inner{
		
	}
	public Inner getInner() {
		return new Inner();
	}
}

public class InnerClassTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter out = new Outter();
		Outter.Inner in = out.getInner();
		in.equals("");
		
	}

}
