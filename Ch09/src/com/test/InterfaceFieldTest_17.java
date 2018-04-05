package com.test;

interface Day{
	int NUM1 = 1, NUM2 = 2, NUM3 = 3, NUM4 = 4;
}

class TestDay implements Day{
	
}

public class InterfaceFieldTest_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDay td = new TestDay();
		TestDay td1 = new TestDay();
		
		System.out.println(td.NUM1);
		//td.NUM1++; static final이라 오류발생
		System.out.println(td1.NUM1);
	}

}
