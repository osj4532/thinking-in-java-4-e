package com.example;

class Overrding{
	
	public int get(int i) {
		System.out.println("get(int)");
		return i;
	}
	
	public char get(char c) {
		System.out.println("get(char)");
		return c;
	}
	
	public float get(float f) {
		System.out.println("get(float)");
		return f;
	}
}

class SubOverriding extends Overrding{
	public double get(double d) {
		System.out.println("get(double)");
		return d;
	}
}

public class OverridingTest_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubOverriding so = new SubOverriding();
		so.get('x');
		so.get(1);
		so.get(1.1f);
		so.get(2.4);
	}

}
