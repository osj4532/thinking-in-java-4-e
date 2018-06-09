package com.test;

import com.example.OnOffException1;
import com.example.OnOffException2;
import com.example.Switch;

public class Ex14Test {
	private static Switch sw = new Switch();
	static Integer[] x = new Integer[1];
	public static void f(int i) 
			throws OnOffException1, OnOffException2{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sw.on();
			f(x[0]);
			//throw new RuntimeException();
			sw.off();
		}catch(OnOffException1 e) {
			System.out.println("OnOffException1");
			sw.off();
		}catch(OnOffException2 e) {
			System.out.println("OnOffException2");
			sw.off();
		}
	}
}
