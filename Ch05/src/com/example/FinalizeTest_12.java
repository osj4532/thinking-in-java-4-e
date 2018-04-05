package com.example;

class Tank{
	int s;
	
	protected void finalize() {
		if(this.s == 5)
			System.out.println("finalize");
		else
			System.out.println("error");
	}
}

public class FinalizeTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		tank.s = 3;
		
		new Tank().s = 5;
		
		System.gc();
	}

}
