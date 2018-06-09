package com.example;

public class ExceptionSilencer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new RuntimeException();
		}finally {
			//finally 블록에서 return하면 throw되었던 어떤 예외도 다 사라진다.
			return;
		}
	}

}
