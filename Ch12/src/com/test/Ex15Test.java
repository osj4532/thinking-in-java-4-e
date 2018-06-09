package com.test;

import com.example.OnOffException1;
import com.example.OnOffException2;
import com.example.OnOffSwitch;
import com.example.Switch;

public class Ex15Test {

	static Switch sw = new Switch();
	static Integer[] x = new Integer[1];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sw.on();
			OnOffSwitch.f(x[0]);
		}catch(OnOffException1 e) {
			System.out.println("OnOffException1");
		}catch(OnOffException2 e) {
			System.out.println("OnOffException2");
		}finally {
			sw.off();
		}
	}

}
