package com.test;

public class Ex27Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		try {
			for(int i = 0; i < 4; i++) {
				arr[i] = i;
			}
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}
}
