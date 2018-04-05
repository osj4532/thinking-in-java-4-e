package com.example;

public class InstanceInit {

	
	public InstanceInit() {
		System.out.println("생성자");
	}
	
	String s;
	{
		s = "인스턴스 초기화";
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInit ii = new InstanceInit();
	}

}
