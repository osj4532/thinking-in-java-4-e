package com.example;

class Cleanser{
	
	public void scrub() {
		System.out.println("Cleanser.scrub()");
	}
}

public class Detergent_2 extends Cleanser{

	public Detergent_2() {
		// TODO Auto-generated constructor stub
		super.scrub();
	}
	
	@Override
	public void scrub() {
		System.out.println("Detergent.scrub()");
	}
	
	public void sterilize() {
		System.out.println("Detergent.sterilize()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent_2 deter = new Detergent_2();
		deter.scrub();
		deter.sterilize();
		
	}

}
