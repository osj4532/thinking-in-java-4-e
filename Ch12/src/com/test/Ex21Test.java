package com.test;

class Base{
	public Base() throws Exception{
		throw new Exception();
	}
}

public class Ex21Test extends Base{

	
	public Ex21Test() throws Exception {
		//try {
		//	super();
		//}catch(Exception e) {
		//	System.out.println("Exception");
		//}
		//베이스 클래스의 생성자에서 던져진 예외는 파생클래스 생성자에서 catch할수 없다.
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ex21Test ex = new Ex21Test();
		}catch(Exception e) {
			System.out.println("Test");
		}
	}

}
