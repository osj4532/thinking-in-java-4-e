package com.example;

class All{
	public int i=10;
	protected int j=21;
	private int k=45;
	int l=64;
	
	public void test() {
		System.out.println("public");
	}
	
	protected void test1() {
		System.out.println("protected");
	}
	
	private void test2() {
		System.out.println("private");
	}
	
	void test3() {
		System.out.println("package");
	}
}

public class AllTest_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		All a = new All();
		System.out.println(a.i);
		System.out.println(a.j);
		//System.out.println(a.k);
		System.out.println(a.l);
		
		a.test();
		a.test1();
		//a.test2();
		a.test3();
	}

}
