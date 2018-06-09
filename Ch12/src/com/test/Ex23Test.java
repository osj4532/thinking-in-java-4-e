package com.test;

class TestClass{
	public void dispose() {
		System.out.println("TestClass is disposed");
	}
}

public class Ex23Test {
	private int count = 1;
	private static int id;
	public TestClass tc;
	public Ex23Test() throws Exception{
		id = count++;
		tc = new TestClass();
		System.out.println(id + " Constructer is created");
		throw new Exception();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ex23Test fc = new Ex23Test();
			try {
				// ...
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				fc.tc.dispose();
			}
		}catch(Exception e) {
			System.out.println("fcExcpetion");
			e.printStackTrace();
		}finally {
			
		}
	}

}
