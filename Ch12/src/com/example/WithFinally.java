package com.example;

public class WithFinally {
	static Switch sw = new Switch();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sw.on();
			OnOffSwitch.f();
		}catch(OnOffException1 e) {
			System.out.println("OnOffException1");
		}catch(OnOffException2 e) {
			System.out.println("OnOffException2");
		}finally {
			sw.off();
		}
	}

}
