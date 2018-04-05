package com.example;

public class ConstructorCall_9 {

	public ConstructorCall_9(int i) {
		System.out.println(i+":ConstructorCall");
	}
	
	public ConstructorCall_9() {
		this(9);
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorCall_9();
	}

}
