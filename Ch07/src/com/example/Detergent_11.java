package com.example;

class Cleanser1{
	
	public void scrub() {
		System.out.println("Cleanser.scrub()");
	}
}

class Cleanser2 extends Cleanser1{
	public void scrub() {
		System.out.println("Cleanser2.scrub()");
	}
}

public class Detergent_11 {

	private Cleanser2 cln2 = new Cleanser2();
	public Detergent_11() {
		// TODO Auto-generated constructor stub
		
	}
	public void scrub() {
		cln2.scrub();
		System.out.println("Detergent.scrub()");
	}
	
	public void sterilize() {
		System.out.println("Detergent.sterilize()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent_11 deter = new Detergent_11();
		deter.scrub();
		deter.sterilize();
		
	}

}
