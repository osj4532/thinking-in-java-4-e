package com.example;

class Component11 {
	public Component11() {
		System.out.println("component1");
	}
}

class Component22 {
	public Component22() {
		System.out.println("component2");
	}
}

class Component33 {
	public Component33() {
		System.out.println("component3");
	}
}

class Root1 {
	Component11 com1;
	Component22 com2;
	Component33 com3;
	public Root1() {
		System.out.println("root");
	}
	
	public void dispose() {
		System.out.println("root.dispose()");
	}
}

class Stem1 extends Root1{
	Component11 com1;
	Component22 com2;
	Component33 com3;
	public Stem1() {
		super();
		System.out.println("stem");
	}
	
	@Override
	public void dispose() {
		System.out.println("stem.dispose()");
		super.dispose();
	}
}

public class ExtendTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem1 s = new Stem1();
		s.dispose();
	}

}
