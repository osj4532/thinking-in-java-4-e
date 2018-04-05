package com.example;

class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	
	private static int x1 = 
			printInit("static Insect.x1 initialized");
	
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	private static int x2 = 
			printInit("static Beetle.x2 initialized");
	
}

public class BeetleTest_24 extends Beetle {
	private int p = printInit("BeetleTest.p initialized");
	public BeetleTest_24() {
		System.out.println("p = " + p);
		System.out.println("j = " + j);
	}
	
	private static int x3 = 
			printInit("static Beetle.x2 initialized");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BeetleTest cinstructor");
		BeetleTest_24 b = new BeetleTest_24();
	}

}
