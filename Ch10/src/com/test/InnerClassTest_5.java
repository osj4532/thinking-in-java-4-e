package com.test;

class Outter1{
	class Inner{
		Inner(){
			System.out.println("Outter.Inner()");
		}
	}
}

public class InnerClassTest_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter1 out = new Outter1();
		Outter1.Inner in = out.new Inner();
		in.equals("");
	}

}
