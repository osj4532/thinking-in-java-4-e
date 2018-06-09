package com.test;

class FailingConstrutor{
	private int count = 1;
	private static int id;
	public FailingConstrutor() throws Exception{
		id = count++;
		System.out.println(id + " Constructer is created");
		throw new Exception();
	}
}


public class Ex22Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FailingConstrutor fc = new FailingConstrutor();
		}catch(Exception e) {
			System.out.println("fcExcpetion");
			e.printStackTrace();
		}finally {
			
		}
	}

}
