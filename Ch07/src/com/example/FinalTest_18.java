package com.example;

import java.util.Random;

class Value{
	private static Random rand = new Random();
	private static final int NUMBER = rand.nextInt(10);
	private final int NUM = rand.nextInt(10);
	
	public int getNUMBER() {
		return NUMBER;
	}
	
	public int getNUM() {
		return NUM;
	}
}

public class FinalTest_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value();
		System.out.println(v1.getNUM());
		System.out.println(v1.getNUMBER());
		
		Value v2 = new Value();
		System.out.println(v2.getNUM());
		System.out.println(v2.getNUMBER());
	}

}
