package com.example;

public class OnOffSwitch {
	private static Switch sw = new Switch();
	public static void f() 
			throws OnOffException1, OnOffException2{}
	public static void f(int i) 
			throws OnOffException1, OnOffException2{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sw.on();
			f();
			
		}catch(OnOffException1 e) {
			System.out.println("OnOffException1");
			sw.off();
		}catch(OnOffException2 e) {
			System.out.println("OnOffException2");
			sw.off();
		}
	}

}
