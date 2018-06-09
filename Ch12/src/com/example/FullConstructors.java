package com.example;

class MyException extends Exception{
	public MyException() {}
	public MyException(String msg) { super(msg);}
}

public class FullConstructors {
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		}catch(MyException e) {
			//예외가 발생할 때까지 실행되었던 메소드들의 기록 정보를 만들어준다.
			e.printStackTrace();
		}
		
		try {
			g();
		}catch(MyException e) {
			e.printStackTrace();
		}
	}

}
