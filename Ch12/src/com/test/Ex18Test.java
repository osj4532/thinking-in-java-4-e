package com.test;

import com.example.LostMessage;

class VeryImportantException extends Exception{
	public String toString() {
		return "A very important exception!";
	}
}
class HoHumException extends Exception{
	public String toString() {
		return "A trivial exception";
	}
}
public class Ex18Test {
	void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException{
		throw new HoHumException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ex18Test lm = new Ex18Test();
			try {
				lm.f();
				lm.dispose();
			}finally {
				throw new RuntimeException();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
