package com.example;

public class DefaultCon_34 {

	public DefaultCon_34() {
		System.out.println("디폴트 생성자");
	}
	
	public DefaultCon_34(String s) {
		System.out.println(s+":디폴트 생성자");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DefaultCon_34();
		new DefaultCon_34("스트링 인자");
	}

}
