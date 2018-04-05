package com.example;

class Component1 {
	public Component1(int i) {
		System.out.println("component1");
	}
}

class Component2 {
	public Component2(int i) {
		System.out.println("component2");
	}
}

class Component3 {
	public Component3(int i) {
		System.out.println("component3");
	}
}

class Root {
	Component1 com1;
	Component2 com2;
	Component3 com3;
	public Root(int i) {
		com1 = new Component1(i);
		com2 = new Component2(i);
		com3 = new Component3(i);
		System.out.println("root");
	}
}

class Stem extends Root{
	Component1 com1;
	Component2 com2;
	Component3 com3;
	public Stem(int i) {
		super(i);
		com1 = new Component1(i);
		com2 = new Component2(i);
		com3 = new Component3(i);
		System.out.println("stem");
	}
}

public class ExtendTest_910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem s = new Stem(1);
	}

}
