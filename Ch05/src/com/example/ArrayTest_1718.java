package com.example;

public class ArrayTest_1718 {

	ArrayTest_1718(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest_1718[] test = new ArrayTest_1718[5];
		for(int i = 0; i<test.length;i++) {
			test[i] = new ArrayTest_1718(i+"");
		}
	}

}
