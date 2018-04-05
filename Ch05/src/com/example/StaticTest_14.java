package com.example;

class Cat{
	static String s = "cat!cat!";
	static String c;
	static {
		c = "kiang!";
	}
	
	static void say() {
		System.out.println(s);
		System.out.println(c);
	}
}

public class StaticTest_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat.say();
	}

}
