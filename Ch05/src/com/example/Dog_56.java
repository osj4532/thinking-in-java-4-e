package com.example;

public class Dog_56 {
	
	public void bark(int i) {
		System.out.println("int : 웡웡");
	}
	
	public void bark(float i) {
		System.out.println("float : 멍멍");
	}
	
	public void bark(double i) {
		System.out.println("double : 왈왈");
	}
	
	public void bark(char c, int i) {
		System.out.println("char : int");
	}
	
	public void bark(int i, char c) {
		System.out.println("int : char");
	}
	
	public static void main(String[] args) {
		Dog_56 dog = new Dog_56();
		dog.bark(1);
		dog.bark(1.1f);
		dog.bark(1.1);
		dog.bark('c',1);
		dog.bark(1,'c');
	}
}
