package com.example;

class Poppet{
	private int i;
	Poppet(int ii){i = ii;}
	@Override
	public String toString() {
		return "["+i+"]";
	}
}

public class BlankFinalTest_19 {

	private final int i = 0;
	public final int j;
	public final Poppet p;
	
	public BlankFinalTest_19() {
		j = 10;
		p = new Poppet(3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlankFinalTest_19 b = new BlankFinalTest_19();
		System.out.println(b.j);
		System.out.println(b.p);
		//final이 붙어서 초기화 후 변경 불가능
		//b.j = 33;
		//b.p = new Poppet(85);
	}

}
