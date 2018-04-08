package com.test;

class WithInner{
	class Inner{
		Inner(String s){
			System.out.println("Inner "+s);
		}
	}
}

public class InnerClassExtends_26{
	class Inner2 extends WithInner.Inner{
		Inner2(WithInner w){
			w.super("Inner2");
			System.out.println("Inner2");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithInner w = new WithInner();
		InnerClassExtends_26 s = new InnerClassExtends_26();
		Inner2 i = s.new Inner2(w);
	}

}
