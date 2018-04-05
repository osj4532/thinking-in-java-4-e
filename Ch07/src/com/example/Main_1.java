package com.example;

class Init1{
	public Init1() {
		System.out.println("lazy");
	}
	
}

class Init2{
	private String s = null;
	private Init1 init;
	public Init1 lazyInit() {
		if(init == null) {
			return new Init1();
		}else {
			return null;
		}
	}
}

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Init2 init = new Init2();
		init.lazyInit();
	}

}
