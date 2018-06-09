package com.test;

class FailingConstrutor1{
	private int count = 1;
	private static int id;
	public FailingConstrutor1(){
		id = count++;
		System.out.println(id + " Constructer is created");
		try{
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void dispose() {
		System.out.println(id +" Object is disposed");
	}
}

public class Ex24Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FailingConstrutor1 fc = new FailingConstrutor1();
			try {
				//...
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				fc.dispose();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
