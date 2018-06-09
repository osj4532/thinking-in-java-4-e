package com.test;

public class Ex1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("Ex1");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
	}

}
