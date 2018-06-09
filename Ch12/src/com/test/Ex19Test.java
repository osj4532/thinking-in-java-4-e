package com.test;

class VeryImportantException1 extends Exception{
	public String toString() {
		return "A very important exception!";
	}
}
class HoHumException1 extends Exception{
	public String toString() {
		return "A trivial exception";
	}
}
public class Ex19Test {
	void f() throws VeryImportantException1{
		throw new VeryImportantException1();
	}
	void dispose() throws HoHumException1{
		throw new HoHumException1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ex19Test lm = new Ex19Test();
			try {
				lm.f();
			}catch(Exception e) {
				System.out.println(e);
			}finally {
				lm.dispose();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
